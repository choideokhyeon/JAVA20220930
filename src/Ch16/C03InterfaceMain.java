package Ch16;

interface C03Remocon
{
	//필드
	int MAX_VOL = 10;
	int MIN_VOL = 0;
	
	//기능(추상메서드)
	void turnOn();
	void turnOff();
	void setVolumn(int vol);
}

class C03TV implements C03Remocon
{
	int vol;

	//추상메서드를 받는 기능들
	public void turnOn() {System.out.println("TV를 켭니다");}
	
	public void turnOff() {System.out.println("TV를 끕니다");}

	public void setVolumn(int vol) 
	{
		if(MAX_VOL <= vol)
			this.vol = MAX_VOL;
		
		else if(MIN_VOL >= vol)
			this.vol = MIN_VOL;
		
		else
			this.vol = vol;
		System.out.println("현재 TV 볼륨 : " + this.vol);
	}
}

//다중상속 코드 추가
interface SearchURL
{
	void Search(String url);
}

class C03SmartTV extends C03TV implements SearchURL
{

	@Override
	public void Search(String url)
	{
		System.out.println(url + " 검색 시작합니다");
	}
	
}

public class C03InterfaceMain {
	
	public static void turnOn(C03Remocon controller)
	{
		controller.turnOn();
	}
	
	public static void turnOff(C03Remocon controller)
	{
		controller.turnOff();
	}
	
	public static void setVol(C03Remocon controller, int vol)
	{
		controller.setVolumn(vol);
	}
	
	public static void Search(SearchURL product, String url)
	{
		product.Search(url);
	}


	public static void main(String[] args) {
		C03SmartTV tv = new C03SmartTV();
		turnOn(tv);
		setVol(tv, 5);
		Search(tv, "www.naver.com");
	}
}
