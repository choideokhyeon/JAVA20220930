package Ch08;

class C97Person{
	//속성(=필드,멤버변수)
	String name;
	int age;
	String addr;
	
	//기능(멤버매서드)	
	C97Person()
	{
		System.out.println("디폴트 생성자 호출");
	}
	
	C97Person(String name)
	{
		this.name = name;
		System.out.println("C97Person(str) 생성자 호출");
	}
	
	C97Person(String name, int age)
	{
		this.name = name;
		this.age = age;
		System.out.println("C97Person(str,int) 생성자 호출");
	}
	
	C97Person(String name, int age, String addr)
	{
		this.name = name;
		this.age = age;
		this.addr = addr;
		System.out.println("C97Person(str,int,str) 생성자 호출");
	}

	
	@Override
	public String toString() {
		return "C97Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
	
	
}

public class C97PersonPractice {

	public static void main(String[] args) {
		
		//다음코드가 성립될수 있도록 생성자함수를 오버로딩 합니다
		//toString()코드 삽입을 통해서 결과 확인합니다
		C97Person ob1 = new C97Person();
		System.out.println(ob1.toString());
		C97Person ob2 = new C97Person("홍길동");
		System.out.println(ob2.toString());
		C97Person ob3 = new C97Person("서길동",22);
		System.out.println(ob3.toString());
		C97Person ob4 = new C97Person("남길동",30,"대구");
		System.out.println(ob4.toString());

	}

}
