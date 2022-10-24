package Ch19;

abstract class 재료
{
	
}

class 팥 extends 재료
{
	String meterial;
	팥(String meterial)
	{
		this.meterial = meterial;
	}
	
	@Override
	public String toString() {
		return "팥 [meterial=" + meterial + "]";
	}
}

class 야채 extends 재료
{
	String meterial;
	야채(String meterial)
	{
		this.meterial = meterial;
	}
	
	@Override
	public String toString() {
		return "야채 [meterial=" + meterial + "]";
	}
}

class 피자 extends 재료
{
	String meterial;
	피자(String meterial)
	{
		this.meterial = meterial;
	}
	
	@Override
	public String toString() {
		return "피자 [meterial=" + meterial + "]";
	}
}

class 민초 extends 재료
{
	String meterial;
	민초(String meterial)
	{
		this.meterial = meterial;
	}
	
	@Override
	public String toString() {
		return "민초 [meterial=" + meterial + "]";
	}
}

class 호빵<T extends 재료>
{
	private T meterial;
	호빵(T meterial)
	{
		this.meterial = meterial;
	}
	
	void ShowInfo()
	{
		System.out.println(meterial.toString() + "으로 만든 호빵");
	}
}

public class C01Generic {

	public static void main(String[] args) {
		호빵<팥> ob1 = new 호빵(new 팥("단팥"));
		ob1.ShowInfo();
		
		호빵<야채> ob2 = new 호빵(new 야채("맛있는 야채"));
		ob2.ShowInfo();
		
		호빵<피자> ob3 = new 호빵(new 피자("불고기맛"));
		ob3.ShowInfo();
		
		호빵<민초> ob4 = new 호빵(new 민초("민트초코맛"));
		ob4.ShowInfo();
	}

}
