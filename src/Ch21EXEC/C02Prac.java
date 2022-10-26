package Ch21EXEC;

import java.io.*;
import java.util.Scanner;

public class C02Prac {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		//메뉴를 만들어서 파일복사하는 작업을 완성하시오
		//1 바이너리 파일복사
		//2 문자형 파일 복사
		//번호 : 1
		//원본파일 경로 :
		//복사대상 경로 :
		String input = null;
		String output = null;
		
		System.out.println("-----------------------");
		System.out.println("1.바이너리 파일복사");
		System.out.println("2.문자형 파일복사");
		System.out.println("-----------------------");
		System.out.print("입력하세요 >> ");
		int num = sc.nextInt();
		
		System.out.print("원본 파일 경로 입력 : ");
		input = sc.next();
		
		System.out.print("복사 대상 경로 입력 : ");
		output = sc.next();
		
		InputStream in = new FileInputStream(input);
		OutputStream out = new FileOutputStream(output);
		
		
	
		if(num == 1)
		{
			byte buff[] = new byte[4096];
			int cnt = 0;
			while((cnt = in.read(buff)) != -1)
			{
				out.write(buff, 0, cnt);
				out.flush();
			}
		}
		
		else if(num == 2)
		{
			byte buff[] = new byte[4096];
			while(true)
			{
				int cnt = in.read(buff);
				if(cnt == -1)
					break;
				out.write(buff, 0, cnt);
				out.flush();
			}
		}
		System.out.println("복사 완료");
		out.close();
			
		
		
	}

}
