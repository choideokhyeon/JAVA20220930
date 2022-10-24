package Ch19;

class Simple<T>
{
	T x;
	T y;
	Simple(T x, T y)
	{
		this.x = x;
		this.y = y;
	}
	
	void ShowMember()
	{
		System.out.println("x = " + x + ", y = " + y);
	}
}

class Person
{
	String name;
	String addr;
	public Person(String name, String addr)
	{
		super();
		this.name = name;
		this.addr = addr;
	}
}

public class C02Generic {

	public static void main(String[] args) {
		Simple<Integer> ob1 = new Simple<Integer>(10, 20);
		ob1.ShowMember();
		System.out.println();
												//x								y
		Simple<Person> ob2 = new Simple<Person>(new Person("홍길동", "대구"), new Person("서길동", "부산"));
		ob2.ShowMember();
		System.out.println();
	}

}
