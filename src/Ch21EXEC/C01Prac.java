package Ch21EXEC;

import java.io.*;
import java.util.*;

public class C01Prac {
	//Key : 제목 , Value : 내용
	public static Map<String,String> map = new HashMap();

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int num;
		String subject;
		String contents = null;
		while (true)
		{
			System.out.println("-----------M E M O-----------");
			System.out.println("1 메모하기");
			System.out.println("2 불러오기");
			System.out.println("3 파일로 저장");
			System.out.println("4 종료");
			System.out.println("-----------M E M O-----------");
			System.out.print("번호 : ");
			num = sc.nextInt();
			
			switch (num)
			{
				case 1:
					sc.nextLine();
					System.out.print("제목 입력 : " ); //map의 key로 저장
					subject = sc.nextLine();
					//제목과 내용을 입력 받아서 map에 저장합니다
					//기존의 제목과 동일한 제목이 있으면 내용입력이 불가능하게 설정합니다
					if(map.containsKey(subject))
					{
						System.out.println("이미 존재하는 제목입니다");
						sc.nextLine();
						break;
					}
					
					System.out.print("----내용----\n");//map의 value로 저장
					contents = sc.nextLine();
					while(true)
					{
						String tmp = sc.next();
						if(tmp.equals("-1"))
							break;
						contents += tmp + "\n";
					}
					map.put(subject, contents);
					break;
					
				case 2:
					System.out.print("제목 입력 : " );
					subject = sc.next();
					if(map.containsKey(subject))
						System.out.println(map.get(subject));	//null값 제거
					else
						System.out.println("해당 제목은 존재하지 않습니다");
					break;
					
				case 3:
					//map의 제목 리스트가 나오게 합니다
					//제목 리스트마다 번호를 부여해서 번호를 입력하면 파일로 저장되게 합니다
					//파일명도 받아서 처리합니다
					System.out.println("저장할 제목을 선택하세요");
					Set<String> set = map.keySet();
					int i = 0;
					for(String key : set)
					{
						System.out.println("idx번호[" + i + "] : " + key);
						i++;
					}
					System.out.print("제목 입력 : ");
					subject = sc.next();
					contents = map.get(subject);
					
					Date now = new Date();
					Writer out = new FileWriter("C:\\iotest\\" + subject + ".txt", true);
					out.write("-----" + now + "-----\n");
					out.write(contents);
					out.flush();
					out.close();
					
					
//					ArrayList<String> subList = new ArrayList();
//					ArrayList<String> conList = new ArrayList();
//					int i = 0;
//					for(String n : map.keySet())
//					{
//						System.out.println("인덱스번호[" + i + "] : " + n);
//						subList.add(n);
//						i++;
//					}
//					
//					for(String n2 : map.values())
//					{
//						conList.add(n2);
//					}
//					System.out.print("번호를 입력하세요 : ");
//					num = sc.nextInt();
//					Writer out = new FileWriter("C:\\iotest\\" + subList.get(num) + ".txt");
//					out.write(conList.get(num));
//					out.flush();
//					out.close();
					
					//issue 1 기존 파일명이 없을때 -> 생성하기
					//issue 2 기존 파일명이 있을때 -> 추가하기
					//issue 3 파일명을 map 에 저장해야되는 문제 -> String이 아니라 memo 클래스 생성
					
					
					break;
					
				case 4:
					System.out.println("종료합니다.");
					System.exit(-1);
					
				default : 
					System.out.println("다시 입력하세요..");	
			}
		}

	}
}
