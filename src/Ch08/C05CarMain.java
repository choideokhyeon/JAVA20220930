package Ch08;

class C05Car
{
	String owner;
	int speed;
	int fuel;
	String model;
	
	//기능
	//가속함수
	void Accel()
	{
		//1 fuel 확인
		//2 speed 10증가
		//3 200km/h 제한
		//4 fuel 5 감소
//		System.out.printf("현재 연료는 %d 입니다\n", fuel);
		if(fuel - 5 <= 0)
		{
			System.out.println("[ERR]가속불가 - 연료가 부족합니다.");
		}
		
		else
		{
			fuel -= 5;
			if(speed + 10 >= 200)
			{
				speed = 200;
				System.out.println("[WARN]최대속도입니다. 200km/h");
			}
			else
			{
				speed += 10;
				System.out.println("[INFO]가속합니다. 현재속도 : " + speed + "km/h");
			}
				
		}
		
	}
	
	//감속함수
	void Break()
	{
		//1 속도체크
		//2 속도감속
		if(speed - 5 <= 0)
		{
			speed = 0;
			System.out.println("[ERR]감속불가 합니다. 현재속도 : 0km/h");
		}
		else
		{
			speed -= 5;
			System.out.println("[INFO]감속합니다. 현재속도 : " + speed + "km/h");
		}
	}
	
	//정보확인
	void ShowInfo()
	{
		System.out.println("차주 : " + owner);
		System.out.println("속도 : " + speed);
		System.out.println("연료 : " + fuel);
		System.out.println("모델 : " + model);
	}
}

public class C05CarMain {

	public static void main(String[] args) throws InterruptedException {
		C05Car hong = new C05Car();
		hong.owner = "홍길동";
		hong.speed = 200;
		hong.fuel = 100;
		hong.model = "아반떼xd";


		while(true)
		{
//			hong.Accel();
			hong.Break();
			Thread.sleep(500);
		}	
		
	}

}
