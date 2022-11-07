package Ch35;

public class Sales extends Regular{
	
	int record;
	double commission;
	
	Sales(String name, int age, int salary, int record, double commission)
	{
		super(name, age, salary);
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.record = record;
		this.commission = commission;
	}

	double pay()
	{
		return salary + (record * commission);
	}
	
	void showinfo()
	{
		System.out.printf("이름 : %s, 나이 : %d, 수령액 : %.1f원\n", name, age, pay());
	}
}
