package Ch15;

abstract class Moonbanggu
{
	 public static int SharpenCnt=100;
	 public static int PencilCnt=100;
	 abstract void write();
	 abstract void Show();
}
class Sharpen extends Moonbanggu
{	
	Sharpen()
	{
		if(SharpenCnt>=1)
			SharpenCnt--;
	}
	//코드완성
	 void write() {System.out.println("샤프로 씁니다.");};
	 void Show() {System.out.printf("샤프 재고량 : %d\n", SharpenCnt);}
}
class Pencil extends Moonbanggu
{
	Pencil()
	{
		if(PencilCnt>=1)
			PencilCnt--;
	
	}
	//코드 완성
	void write() {System.out.println("연필로 씁니다.");}
	
	void Show() {System.out.printf("연필 재고량 : %d\n", PencilCnt);}
}
public class C03Prac {
	
	public static void Writing(Moonbanggu m)
	{
		m.write();
	}

	public static void ShowInfo(Moonbanggu m)
	{
		m.Show();
	}
	
	public static void main(String[] args)
	{
		Sharpen item1 = new Sharpen();
		Pencil item2 = new Pencil();
		Writing(item1);	//"샤프로 씁니다" 가 출력
		Writing(item2); //"연필로 씁니다" 가 출력 
		ShowInfo(item1);
		ShowInfo(item2);
	}
}

