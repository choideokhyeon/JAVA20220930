package Ch14;

//상속관계에서 생성자 호출
//상위클래스의 생성자 호출 -> 하위클래스 생성자 호출
//상위클래스 생성자 호출시 super() 예약어를 사용하여 상위클래스의 오버로딩된 생성자에 접근이 가능하다.

class Parent
{
	int x;
	int y;
	Parent()
	{
		System.out.println("Parent() 생성자 호출");
	}
	
	Parent(int x)
	{
		System.out.println("Parent(x) 생성자 호출");
		this.x = x;
	}
	
	Parent(int x, int y)
	{
		System.out.println("Parent(x,y) 생성자 호출");
		this.x = x;
		this.y = y;
	}
}

class Son extends Parent
{
	int z;
	Son()
	{
//		super();	//상위클래스 디폴트 생성자 호출
		System.out.println("Son() 생성자 호출");
	}
	
	public Son(int x)
	{
//		super(10);	//상위클래스 인자 하나를 받는 생성자(parent(x)) 호출
		super(x);
		System.out.println("Son(int x) 생성자 호출");
	}
	
	public Son(int x, int y)
	{
		super(x, y);
		System.out.println("Son(int x, int y) 생성자 호출");
	}
	
	public Son(int x, int y, int z)
	{
		super(x, y);
		this.z = z;
		System.out.println("Son(int x, int y, int z) 생성자 호출");
	}

	@Override
	public String toString() {
		return "Son [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
}

public class C02InheritanceMain {

	public static void main(String[] args) {
		Son ob1 = new Son();
		System.out.println();
		Son ob2 = new Son(10);			//x멤버에 10값 넣기
		System.out.println();
		Son ob3 = new Son(10,20);		//x,y멤버에 10,20값 넣기
		System.out.println();
		Son ob4 = new Son(10,20,30);	//x,y,z멤버에 10,20,30 값 넣기
		System.out.println();
		
		System.out.println(ob4);
	}

}
