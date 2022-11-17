package Ch99.Domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import oracle.net.aso.i;

public class UserDAO {
	// 연결관련 정보 저장용 변수
		String id = "root"; // DB연결 id
		String pw = "1234"; // DB연결 pw
		String url = "jdbc:mysql://localhost:3306/gachadb"; // 연결 URL(DBMS마다 상이함)
	
		// DB연결객체 관련 참조변수
		Connection conn = null; // DB연결객체용
		PreparedStatement pstmt = null; // SQL쿼리 전송용 객체
		ResultSet rs = null; // 쿼리결과(Select결과) 수신용
	
		// 싱글톤 패턴 코드 추가
		private static UserDAO instance;
	
		public static UserDAO getInstance() {
			if (instance == null)
				instance = new UserDAO();
			return instance;
		}
	
		private UserDAO()
			{
				//CONN객체 연결
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn = DriverManager.getConnection(url,id,pw);
					System.out.println("Connected...");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		
		//전체 조회하기
		
		//선택 조회하기
		
		//등록하기
		public int Insert(UserDTO dto)
		{	
			//pstmt
			int result = 0;
			try
			{
				pstmt = conn.prepareStatement("insert into usertbl values(null, ?, ?, 0, 0, 0)");
				pstmt.setString(1, dto.getUsername());
				pstmt.setString(2, dto.getPwd());
				result = pstmt.executeUpdate();
			} catch (SQLException e) {e.printStackTrace();}
			
			return result;
		}
	
		
		public UserDTO Loginstatus(String name)
		{	
			//pstmt
			UserDTO dto = new UserDTO();
			int result = 0;
			try
			{
				pstmt = conn.prepareStatement("select loginstatus,userid from usertbl where id=?");
				pstmt.setString(1, name);
				rs = pstmt.executeQuery();
				if(rs != null)
				{
					rs.next();
					dto = new UserDTO();
					dto.setLoginstatus(rs.getInt("loginstatus"));
					dto.setUserid(rs.getInt("userid"));
					if(rs.getInt("loginstatus") == 0)
					{
						pstmt = conn.prepareStatement("update usertbl set loginstatus=? where id=?");
						pstmt.setInt(1, 1);
						pstmt.setInt(2, dto.getUserid());
						result = pstmt.executeUpdate();
					}
					else
						System.out.println("[SYSTEM] 현재 로그인 상태입니다.");
				}
			} catch (SQLException e) {e.printStackTrace();}
			finally
			{
				try
				{rs.close(); pstmt.close();}catch(Exception e) {e.printStackTrace();}
			}
			
			return dto;
		}

		
		public int Logout(String id)
		{
			//pstmt
			UserDTO dto = new UserDTO();
			int result = 0;
			try
			{
				pstmt = conn.prepareStatement("select loginstatus,userid from usertbl where username=?");
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
				if(rs != null)
				{
					dto = new UserDTO();
					rs.next();
					dto.setLoginstatus(rs.getInt("loginstatus"));
					dto.setUserid(rs.getInt("userid"));
					if(rs.getInt("loginstatus") == 1)
					{
						pstmt = conn.prepareStatement("update usertbl set loginstatus=? where userid=?");
						pstmt.setInt(1, 0);
						pstmt.setInt(2, dto.getUserid());
						result = pstmt.executeUpdate();
					}
					else
						System.out.println("[SYSTEM] 현재 로그아웃 중 상태입니다.");
				}
			} catch (SQLException e) {e.printStackTrace();}
			finally
			{
				try
				{rs.close(); pstmt.close();}catch(Exception e) {e.printStackTrace();}
			}
			
			return result;
		}
		
		
		public UserDTO Select(String name) {
			UserDTO dto = new UserDTO();
			try
			{
				pstmt = conn.prepareStatement("select * from usertbl where username=?");
				pstmt.setString(1, name);
				rs = pstmt.executeQuery();
				ResultSetMetaData rsmd = rs.getMetaData();
				if(rs != null)
				{
					if(name.equals("*"))	//* 입력시 전체 출력
					{
						pstmt = conn.prepareStatement("select * from gachadb.usertbl");
						rs = pstmt.executeQuery();
						System.out.print(rsmd.getColumnName(1) + "\t|");
						System.out.print(rsmd.getColumnName(2) + "\t|");
						System.out.print(rsmd.getColumnName(3) + "\t\t|");
						System.out.print(rsmd.getColumnName(4) + "\t|");
						System.out.print(rsmd.getColumnName(5) + "\t\t|");
						System.out.print(rsmd.getColumnName(6));
						System.out.println();
						while(rs.next())
						{
							System.out.print(rs.getInt("userid") + "\t|");
							System.out.print(rs.getString("username") + "\t\t|");
							System.out.print(rs.getString("pwd") + "\t\t|");
							System.out.print(rs.getInt("loginstatus") + "\t\t|");
							System.out.print(rs.getInt("money") + "\t\t|");
							System.out.print(rs.getInt("jewel"));
							System.out.println();
						}
					}
					else
					{
						pstmt = conn.prepareStatement("select * from usertbl where username=?");
						pstmt.setString(1, name);
						rs = pstmt.executeQuery();
						System.out.print(rsmd.getColumnName(1) + "\t|");
						System.out.print(rsmd.getColumnName(2) + "\t|");
						System.out.print(rsmd.getColumnName(3) + "\t\t|");
						System.out.print(rsmd.getColumnName(4) + "\t|");
						System.out.print(rsmd.getColumnName(5) + "\t\t|");
						System.out.print(rsmd.getColumnName(6) + "\n");
						while(rs.next())
						{
							System.out.print(rs.getInt("userid") + "\t|");
							System.out.print(rs.getString("username") + "\t\t|");
							System.out.print(rs.getString("pwd") + "\t\t|");
							System.out.print(rs.getInt("loginstatus") + "\t\t|");
							System.out.print(rs.getInt("money") + "\t\t|");
							System.out.print(rs.getInt("jewel") + "\n");
							System.out.println();
							dto.setUsername(rs.getString("username"));
							dto.setPwd(rs.getString("pwd"));
						}
					}
				}
			} catch (SQLException e) {e.printStackTrace();}
			finally
			{
				try
				{rs.close(); pstmt.close();}catch(Exception e) {e.printStackTrace();}
			}
			return dto;
		}
}

