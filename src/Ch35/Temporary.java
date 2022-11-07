package Ch35;

public class Temporary extends Employees {
	public int ilsu;
	public int ildang;
	
	Temporary(String name, int age, int ilsu, int ildang)
	{
		this.name = name;
		this.age = age;
		this.ilsu = ilsu;
		this.ildang = ildang;
	}
	
	double pay()
	{
		return ilsu*ildang;
	}

	@Override
	void showinfo() {
		System.out.printf("이름 : %s, 나이 : %d, 월급 : %.1f원\n", name, age, pay());
	}
	
	
}
