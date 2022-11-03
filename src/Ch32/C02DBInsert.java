package Ch32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class C02DBInsert {

	public static void main(String[] args) {
		String id = "SYSTEM";	//DB연결 id
		String pw = "1234";		//DB연결 pw
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	//연결 URL(DBMS마다 상이함)

		
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일 입력 : ");
		String name = sc.next();
		System.out.print("주소 입력 : ");
		String addr = sc.next();
		
		
		//연결하기 try-with-resources(JAVA 7버전 이상)
		try
		(
				Connection conn = DriverManager.getConnection(url, id, pw);
				PreparedStatement pstmt = conn.prepareStatement("insert into a_tbl values(atbl_seq.NEXTVAL, ?, ?)");
		)
		{
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			
			int result = pstmt.executeUpdate();
			if(result != 0)
				System.out.println("Insert Success!");
			else
				System.out.println("Insert Failed..");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		sc.close();
		
	}
}
