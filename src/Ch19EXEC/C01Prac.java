package Ch19EXEC;

class caramel
{
	public String toString()
	{
		return "카라멜";
	}
}

class onion
{
	public String toString()
	{
		return "어니언";
	}
}

class PopCorn <T>
{
	private T meterial;
	public T getMeterial()
	{
		return meterial;
	}
	
	public void setMeterial(T meterial)
	{
		this.meterial = meterial;
	}
	
	public void Fry()
	{
		System.out.println(meterial + "맛 팝콘을 만듭니다");
	}
}

public class C01Prac {

	public static void main(String[] args) {
		PopCorn<caramel> corn1 = new PopCorn<caramel>();
		corn1.setMeterial(new caramel());
		corn1.Fry();
		System.out.println(corn1.getMeterial());
		
		PopCorn<onion> corn2 = new PopCorn<onion>();
		corn2.setMeterial(new onion());
		corn2.Fry();
		System.out.println(corn2.getMeterial());
	}

}
