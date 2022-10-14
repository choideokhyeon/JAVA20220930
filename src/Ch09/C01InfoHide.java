package Ch09;


//접근한정자
//public	: 모든 클래스에서 접근 가능
//defualt	: 동일 패키지에 속한 클래스에서만 접근 가능
//private	: 현재 클래스에서만 접근 가능
//protected : 동일 패키지에 속한 클래스 or 상속관계에서 하위클래스에서만 접근 가능

class C01Person
{
	//속성
	public String name;		//이름
	private String id;		//주민등록번호
	private int age;		//나이
	private float weight;	//몸무게
	private double height;	//신장
	private int salary;		//연봉
	
	
	//생성자
	public C01Person(String name, String id, int age, float weight, double height, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.salary = salary;
	}
	
	
	//Setter함수
	void setId(String id) {this.id = id;}
	//Getter함수
	public String getId() {return id;}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "C01Person [name=" + name + ", id=" + id + ", age=" + age + ", weight=" + weight + ", height=" + height
				+ ", salary=" + salary + "]";
	}
	
}

public class C01InfoHide {

	public static void main(String[] args) {
		C01Person hong = new C01Person("홍길동", "020202-1234567", 20, 50.45f, 180.12, 5000);
		hong.name="남길동";
//		hong.id = "123456-1234567" //[ERROR]private라서 다른 클래스에서는 접근 불가능
		hong.setId("030303-9876543");
		System.out.println(hong.toString());
		hong.getId();
		
	}

}
