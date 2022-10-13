package Ch08;

class C10Person
{
	//속성(=필드,멤버변수)
	String name;
	int age;
	String addr;
	
	//기능(멤버메서드)
	void setPerson(String sname)
	{
		this.name = sname;
		System.out.println("setPerson(str) 출력");
	}
	
	void setPerson(String sname, int ageS)
	{
		this.name = sname;
		this.age = ageS;
		System.out.println("setPerson(str,int) 출력");
	}
	
	void setPerson(String sname, int ageS, String saddr)
	{
		this.name = sname;
		this.age = ageS;
		this.addr = saddr;
		System.out.println("setPerson(str,int,str) 출력");
	}
	
	void ShowInfo()
	{
		System.out.printf("이름 : %s\n나이 : %d\n주소 : %s\n", name, age, addr);
	}
	
}

public class C10PersonMain {

	public static void main(String[] args) {
		C10Person obj = new C10Person();
		
		obj.setPerson("홍길동");	//멤버변수 name에 "홍길동" 저장
		obj.ShowInfo();
		System.out.println();
		
		obj.setPerson("서길동",10);	//멤버변수 name,age에 각각 저장
		obj.ShowInfo();
		System.out.println();
		
		obj.setPerson("강호동",55,"서울");	//멤버변수 name,age,addr에 각각 저장
		obj.ShowInfo();
		System.out.println();
		
	}

}
