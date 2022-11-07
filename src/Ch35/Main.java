package Ch35;

public class Main {

	public static void main(String[] args) {
		Temporary tmp = new Temporary("박치기", 21, 20, 90000);
		Regular reg = new Regular("홍길동", 23, 1234000);
		Sales sal = new Sales("한송이", 25, 2345000, 3000, 0.25);
		Manager mng = new Manager("한국인", 27, 2555000);
		
		tmp.showinfo();
		reg.showinfo();
		sal.showinfo();
		mng.showinfo();

	}

}
