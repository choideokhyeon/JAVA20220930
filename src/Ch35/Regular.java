package Ch35;

public class Regular extends Employees{
	public int salary;
	
	public Regular(String name, int age, int salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	double pay()
	{
		return salary;
	}
	
	void showinfo()
	{
		System.out.printf("이름 : %s, 나이 : %d, 고정급 : %.1f원\n", name, age, pay());
	}
}
