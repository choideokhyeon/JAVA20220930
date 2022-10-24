package Ch20EXEC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01Prac {
	public static void main(String[] args) {
		int num = 0;
		List<String> list = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("=======M E N U =======");
			System.out.println("1 이름 등록");
			System.out.println("2 이름 조회");
			System.out.println("3 이름 삭제");
			System.out.println("4 전체 조회");
			System.out.println("5 종료");
			System.out.println("=======M E N U =======");
			System.out.print("번호 : " );
			num = sc.nextInt();
			switch(num)
			{
				case 1:
					//이름 입력받아서 ArrayList 에  add
					System.out.print("등록할 이름 입력 : ");
					String input = sc.next();
					list.add(input);
					break;
					
				case 2:
					//이름 입력받아서 조회(있다,없다로 조회) 이름이 있으면 "있다" 없으면 "없다"..
					System.out.print("조회할 이름 입력 : ");
					String input2 = sc.next();
					if(list.contains(input2))
						System.out.printf("%s는 리스트에 있습니다\n", input2);
					else
						System.out.printf("%s는 리스트에 없습니다\n", input2);
					break;
					
				case 3:
					//이름 입력받아서 삭제.. 삭제되었으면 "삭제완료" 삭제할 이름 없으면 "삭제실패"
					System.out.print("삭제할 이름 입력 : ");
					String input3 = sc.next();
					if(list.contains(input3))
					{
						for(int i = 0; i < list.size(); i++)
						{
							if(list.get(i).equals(input3))
							{
								System.out.printf("idx %d번 %s 삭제 합니다\n", i, list.get(i));
								System.out.println("삭제 완료");
								list.remove(i);
								break;
							}
						}
					}
					else
						System.out.printf("%s는 존재하지 않습니다. 삭제 실패\n", input3);
					break;
					
				case 4:
					System.out.println("<<전체 조회>>");
					if(list.size() < 1)
						System.out.println("아직 아무도 없습니다");
					else
					{
						for(String temp : list)
							System.out.println(temp);
					}
					break;
					
				case 5:
					System.out.println("종료합니다");
					System.exit(-1);
					
				default:
					System.out.println("다시 입력...");
			}
		}
	}
}

