package Ch14;

//클래스 기본 : https://security-nanglam.tistory.com/m/213
//자바 상속1 : https://security-nanglam.tistory.com/m/215
//자바 상속2 : https://security-nanglam.tistory.com/m/218


class Moonbanggu
{
	public static int SharpenCnt = 100;
	public static int Pencil = 100;
	void write() {};
}
class Sharpen extends Moonbanggu
{
	Sharpen()
	{
		if(SharpenCnt >= 1)
			SharpenCnt--;
	}
	void write()
	{
		System.out.println("샤프로 씁니다");
	}
}
class Pencil extends Moonbanggu
{
	Pencil()
	{
		if(Pencil >= 1)
			Pencil--;
	}
	void write()
	{
		System.out.println("연필로 씁니다");
	}
}
public class C08Prac2 {
	public static void Writing(Moonbanggu item)
	{
		item.write();
	}
	
	public static void ShowInfo()
	{
		System.out.printf("샤프재고량 : %d 연필 재고량 : %d\n",Moonbanggu.SharpenCnt,Moonbanggu.Pencil);
	}
	
	public static void main(String[] args) {
		Sharpen item1 = new Sharpen();
		Pencil item2 = new Pencil();
		Writing(item1);	//"샤프로 씁니다" 가 출력
		Writing(item2); //"연필로 씁니다" 가 출력
		
		ShowInfo();
	}
}
