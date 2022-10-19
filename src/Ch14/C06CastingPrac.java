package Ch14;

class employee	//직원
{
	String name;
	String age;
	String addr;
	public employee(String name, String age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
}

class parttimer extends employee	//시간제
{
	int hourpay;

	public parttimer(String name, String age, String addr, int hourpay)
	{
		super(name, age, addr);
		this.hourpay = hourpay;
	}

	@Override
	public String toString() {
		return "parttimer [hourpay=" + hourpay + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

}

class regular extends employee 	//정규직
{
	int salary;

	public regular(String name, String age, String addr, int salary)
	{
		super(name, age, addr);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "regular [salary=" + salary + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

}

public class C06CastingPrac {
	
	public static void ShowInfo(employee emp)
	{
		//다운캐스팅을 통해서 parttimer or regular를 선별해서 모든 정보를 출력하시오
		if(emp instanceof parttimer)
		{
			parttimer down = (parttimer)emp;
			System.out.printf("이름 : %s\n나이 : %s\n지역 : %s\n시급 : %d\n", down.name, down.age, down.addr, down.hourpay);
		}
		
		if(emp instanceof regular)
		{
			regular down = (regular)emp;
			System.out.printf("이름 : %s\n나이 : %s\n지역 : %s\n연봉 : %d\n", down.name, down.age, down.addr, down.salary);
		}
	}
	
	public static void main(String[] args) {
		parttimer emp1 = new parttimer("홍길동", "25", "대구", 20000);
		regular emp2 = new regular("서길동", "45", "부산", 50000000);
		ShowInfo(emp1);
		System.out.println("------------------");
		ShowInfo(emp2);
		
		//1 상속관계 만들기
		//2 적절한 생성자 만들기(super 예약어 사용)
		//3 ShowInfo 함수 안에서 Downcasting을 통해서 모든 멤버변수정보 출력하기
	}

}
