package ChPractice;

class man <G>
{
	private G name;
	private G bloodtype;
	private G age;
	
	public G getName() {return name;}
	public void setName(G name) {this.name = name;}
	public G getBloodtype() {return bloodtype;}
	public void setBloodtype(G bloodtype) {this.bloodtype = bloodtype;}
}

public class Practice_Generic2 {

	public static void main(String[] args) {
		man<String> man1 = new man<>();
		man1.setName("홍길동");
		man1.setBloodtype("A");
		
		System.out.println(man1.getName());
		System.out.println(man1.getBloodtype());
	}

}
