package ChPractice;

class People
{
	String name;
	String ssn;
	
	People(String name, String ssn)
	{
		this.name = name;
		this.ssn = ssn;
	}
}

class Student extends People
{
	int studentNo;
	Student(String name, String ssn, int studentNo)
	{
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
}

public class Practice_extends2 {

	public static void main(String[] args) {
		Student student = new Student("홍길동" , "123456-1234567", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("StudentNo : " + student.studentNo);
	}

}
