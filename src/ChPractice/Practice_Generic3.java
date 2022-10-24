package ChPractice;

class women <A, B>
{
	private A name;
	private A bloodtype;
	private B age;
	
	public A getName() {return name;}
	public void setName(A name) {this.name = name;}
	public A getBloodtype() {return bloodtype;}
	public void setBloodtype(A bloodtype) {this.bloodtype = bloodtype;}
	public B getAge() {return age;}
	public void setAge(B age) {this.age = age;}
	
}

public class Practice_Generic3 {

	public static void main(String[] args) {
		//		<A,		B>
		women<String, Integer> women1 = new women<>();
		women1.setName("영희");
		women1.setBloodtype("AB");
		women1.setAge(20);
		
		System.out.println(women1.getName());
		System.out.println(women1.getBloodtype());
		System.out.println(women1.getAge());
	}

}
