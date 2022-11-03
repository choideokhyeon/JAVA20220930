package Ch32EXEC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class MemberDAO {
	
	//연결관련 정보 저장용 변수
	String id = "SYSTEM";	//DB연결 id
	String pw = "1234";		//DB연결 pw
	String url = "jdbc:oracle:thin:@localhost:1521:xe";	//연결 URL(DBMS마다 상이함)
	
	//DB연결객체 관련 참조변수
	Connection conn = null;				//DB연결객체용
	PreparedStatement pstmt = null;		//SQL쿼리 전송용 객체
	ResultSet rs = null;				//쿼리결과(Select결과) 수신용
	
	MemberDAO()
	{
		//CONN객체 연결
		try {
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("Connected...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//멤버 가입하기
	boolean Insert(String email, String addr, String phone)
	{
		int result = 0;
		try {
			pstmt = conn.prepareStatement("insert into tbl_member values(member_seq.NEXTVAL,?,?,?)");
			pstmt.setString(1, email);
			pstmt.setString(2, addr);
			pstmt.setString(3, phone);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try{pstmt.close();} catch(Exception e) {e.printStackTrace();}
		}
		
		if(result > 0)
			return true;
		else
			return false;
	}
	
	boolean Insert(MemberDTO dto)
	{
		int result = 0;
		try {
			pstmt = conn.prepareStatement("insert into tbl_member values(member_seq.NEXTVAL,?,?,?)");
			pstmt.setString(1, dto.getEmail());
			pstmt.setString(2, dto.getAddr());
			pstmt.setString(3, dto.getPhone());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try{pstmt.close();} catch(Exception e) {e.printStackTrace();}
		}
		
		if(result > 0)
			return true;
		else
			return false;
	}
	
//	//멤버 수정하기
//	boolean Update(이메일,주소,이름){DB 수정하기}
//	-----------------------------------------------
	boolean Update(MemberDTO dto) {
		
		int result=0;
		try
		{
			if(dto.getAddr() == null && dto.getPhone() == null)
			{}
			else
			{
				pstmt = conn.prepareStatement("update tbl_member set addr='?', Phone='?', where email='?';");
				pstmt.setString(1, dto.getAddr());
				pstmt.setString(2, dto.getPhone());
				pstmt.setString(3, dto.getEmail());
				result = pstmt.executeUpdate();
			}
		}catch(Exception e){ e.printStackTrace();}
		finally {
			
		}
		
		if(result > 0)
		{
			return true;
		}
		return false;
	}
	
// -----------------------------------------------
	
//	//멤버 삭제하기
//	boolean Delete(String){DB 삭제하기}
	
	//멤버 조회하기
	boolean Search(String email)
	{
		int result = 0;
		try {
			pstmt = conn.prepareStatement("select * from tbl_member where email=?");
			pstmt.setString(1, email);
			result = pstmt.executeUpdate();
			rs = pstmt.executeQuery();		//Select만 Query
			ResultSetMetaData rsmd = rs.getMetaData();
			if(rs != null)
			{
				while(rs.next())
				{
					for(int i = 1; i <= rsmd.getColumnCount(); i++)
					{
						System.out.print(rs.getString(rsmd.getColumnName(i)));
						if(i < rsmd.getColumnCount())
							System.out.print("\t");
					}
					System.out.println();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try{pstmt.close();} catch(Exception e) {e.printStackTrace();}
		}
		
		if(result > 0)
			return true;
		else
			return false;
	}
	
	//전체 조회하기
	boolean SearchAll()
	{
		int result = 0;
		ResultSet rs = null;				//쿼리결과(Select결과) 수신용
		try {
			pstmt = conn.prepareStatement("select * from tbl_member");
			result = pstmt.executeUpdate();
			rs = pstmt.executeQuery();		//Select만 Query
			ResultSetMetaData rsmd = rs.getMetaData();
			if(rs != null)
			{
				while(rs.next())
				{
					for(int i = 1; i <= rsmd.getColumnCount(); i++)
					{
						System.out.print(rs.getString(rsmd.getColumnName(i)));
						if(i < rsmd.getColumnCount())
							System.out.print("\t");
					}
					System.out.println();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try{pstmt.close();} catch(Exception e) {e.printStackTrace();}
		}
		
		if(result > 0)
			return true;
		else
			return false;
	}
	
	//멤버 수 확인하기
	//자원 연결 해제하기
}
