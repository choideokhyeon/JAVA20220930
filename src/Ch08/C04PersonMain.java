package Ch08;

class C04Person
{
	//속성(=필드,멤버변수)
	String name;
	int age;
	String addr;
	
	//기능(멤버메서드)
	void talk()
	{
		System.out.println(name + "님이 말합니다");
	}
	
	void walk()
	{
		System.out.println(name + "님이 걷습니다");
	}
	
	void ShowInfo()
	{
		System.out.printf("이름 : %s\n나이 : %d\n주소 : %s\n", name, age, addr);
	}
	
}

public class C04PersonMain {

	public static void main(String[] args) {
		C04Person hong = new C04Person();
		
		hong.name = "홍길동";
		hong.age = 55;
		hong.addr = "대구대구대구";
		
		hong.talk();
		hong.walk();
		hong.ShowInfo();
		
	}

}
