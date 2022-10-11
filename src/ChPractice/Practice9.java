package ChPractice;

class Car
{
	String company;
	String model;
	String color;
	int maxSpeed;
	
	Car(String company, String model, String color, int maxSpeed)
	{
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

public class Practice9 {

	public static void main(String[] args) {
		Car car1 = new Car("현대자동차", "자가용", "빨강", 200);
		
		System.out.println("회사 : " + car1.company);
		System.out.println("모델 : " + car1.model);
		System.out.println("색상 : " + car1.color);
		System.out.println("최대속도 : " + car1.maxSpeed);
		
		Car car2 = new Car("기아자동차", "택시", "주황", 300);
		System.out.println("회사 : " + car2.company);
		System.out.println("모델 : " + car2.model);
		System.out.println("색상 : " + car2.color);
		System.out.println("최대속도 : " + car2.maxSpeed);
	}

}
