package Ch16;

interface C01Remocon
{
	//필드
	int MAX_VOL = 10;
	int MIN_VOL = 0;
	
	//기능(추상메서드)
	void turnOn();
	void turnOff();
	void setVolumn(int vol);
}

class C01TV implements C01Remocon
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

class C01Radio implements C01Remocon
{
	int vol;

	//추상메서드를 받는 기능들
	@Override
	public void turnOn() {System.out.println("라디오를 켭니다");}

	@Override
	public void turnOff() {System.out.println("라디오를 끕니다");}

	@Override
	public void setVolumn(int vol) 
	{
		if(MAX_VOL <= vol)
			this.vol = MAX_VOL;
		
		else if(MIN_VOL >= vol)
			this.vol = MIN_VOL;
		
		else
			this.vol = vol;
		System.out.println("현재 라디오 볼륨 : " + this.vol);
	}
}

public class C01InterfaceMain {
	
	public static void turnOn(C01Remocon controller)
	{
		controller.turnOn();
	}
	
	public static void turnOff(C01Remocon controller)
	{
		controller.turnOff();
	}
	
	public static void setVol(C01Remocon controller, int vol)
	{
		controller.setVolumn(vol);
	}

	public static void main(String[] args) {
		C01TV tv = new C01TV();
		C01Radio radio = new C01Radio();
		
		turnOn(tv);
		turnOn(radio);
		setVol(tv, 11);
		setVol(radio, 7);
		turnOff(tv);
		turnOff(radio);
	}
}
