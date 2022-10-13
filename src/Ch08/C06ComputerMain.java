package Ch08;

import java.util.Scanner;


//C06Computer Class
//-------------------
//~SerialNo : String		~ : default상태
//~CPUSpec : String
//~RAMSpec : String
//~DISKSpec : String
//~PowerON() : void		SerialNo+의 전원을 켭니다 가 출력
//~PowerOFF() : void	SerialNo+의 전원을 끕니다 가 출력
//~ShowInfo() : void	Computer 객체의 모든 속성이 출력

class C06Computer
{
	String SerialNo;
	String CPUSpec;
	String RAMSpec;
	String DISKSpec;
	
	void PowerON()
	{
		System.out.println(SerialNo + "의 전원을 켭니다");
	}
	
	void PowerOFF()
	{
		System.out.println(SerialNo + "의 전원을 끕니다");
	}
	
	void ShowInfo()
	{
		System.out.println("SerialNo : " + SerialNo);
		System.out.println("CPUSpec : " + CPUSpec);
		System.out.println("RAMSpec : " + RAMSpec);
		System.out.println("DISKSpec : " + DISKSpec);
	}
}

public class C06ComputerMain {

	public static void main(String[] args) {
		
//		C06ComputerMain Class
//		--------------------------
//		C06Computer LGGram1010 = new C06Computer;
//		LGGram1010.SerialNo="1010";
//		LGGram1010.CPUSpec="i7";
//		LGGram1010.RAMSpec="16G";
//		LGGram1010.DISKSpec="2TB";
//		LGGram1010.PowerON();
//		LGGram1010.ShowInfo();
//		LGGram1010.PowerOFF();
		
		Scanner sc = new Scanner(System.in);
		C06Computer LGGram1010 = new C06Computer();
		
		System.out.print("시리얼 넘버 입력 : ");
		LGGram1010.SerialNo = sc.nextLine();
		System.out.print("CPUSpec 입력 : ");
		LGGram1010.CPUSpec = sc.nextLine();
		System.out.print("RAMSpec 입력 : ");
		LGGram1010.RAMSpec = sc.nextLine();
		System.out.print("DISKSpec 입력 : ");
		LGGram1010.DISKSpec = sc.nextLine();
		
		LGGram1010.PowerON();
		LGGram1010.ShowInfo();
		LGGram1010.PowerOFF();
		
		sc.close();
		
	}

}
