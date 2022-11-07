package Ch35;

public class Manager extends Regular{
	public double incentive;
	
	public Manager(String name, int age, int salary)
	{
		super(name, age, salary);
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}

	double pay()
	{
		if(salary >= 2500000)
		{
			return salary*1.6;
		}
		else if(salary >= 2000000)
		{
			return salary*1.5;
		}
		else
		{
			return salary*1.4;
		}
	}
	
	void showinfo()
	{
		System.out.printf("이름 : %s, 나이 : %d, 수령액 : %.1f원\n", name, age, pay());
	}
}
