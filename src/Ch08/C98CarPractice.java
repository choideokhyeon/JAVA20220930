package Ch08;

class C98Car
{
	String owner;
	int speed;
	int fuel;
	String model;
	
	//기능
	C98Car()
	{
		System.out.println("디폴트 생성자 호출");
	}
	
	C98Car(String owner, int speed, int fuel, String model)
	{
		this.owner = owner;
		this.speed = speed;
		this.fuel = fuel;
		this.model = model;
		System.out.println("C98Car(str,int,int,str) 생성자 호출");
	}
	
	C98Car(String owner, int fuel, String model, int speed)
	{
		this.owner = owner;
		this.fuel = fuel;
		this.model = model;
		this.speed = speed;
		System.out.println("C98Car(str,int,str,int) 생성자 호출");
	}
	
	C98Car(String owner, String model, int fuel, int speed)
	{
		this.owner = owner;
		this.model = model;
		this.fuel = fuel;
		this.speed = speed;
		System.out.println("C98Car(str,str,int,int) 생성자 호출");
	}

	@Override
	public String toString() {
		return "C98Car [owner=" + owner + ", speed=" + speed + ", fuel=" + fuel + ", model=" + model + "]";
	}
	
 
}
public class C98CarPractice {

	public static void main(String[] args) throws InterruptedException {
	
		//다음 코드가 문제 없도록 클래스 구성을 합니다
		//toString() 코드 삽입으로 멤버변수 값 확인합니다
		
		C98Car ob1  = new C98Car("홍길동",0,100,"코나"); //owner,speed,fuel,model
		System.out.println(ob1.toString());
		C98Car ob2  = new C98Car("서길동",50,"아반떼",0);	//owner,fuel,model,speed
		System.out.println(ob2.toString());
		C98Car ob3  = new C98Car("김철수","그렌저",0,0); //owner,model,fuel,speed
		System.out.println(ob3.toString());
	}

}