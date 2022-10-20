package ChPractice;

class CellPhone
{
	String model;
	String color;
	
	void PowerOn() {System.out.println("전원을 켭니다");}
	void PowerOff() {System.out.println("전원을 끕니다");}
	void bell() {System.out.println("벨이 울립니다");}
	
	void sendVoice(String message)
	{
		System.out.println("본인 : " + message);
	}
	
	void receiveVoice(String message)
	{
		System.out.println("상대 : " + message);
	}
	
	void hangUp() {System.out.println("전화를 끊습니다");}
}

class DmbCellPhone extends CellPhone
{
	int channel;
	
	DmbCellPhone(String model, String color, int channel)
	{
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb()
	{
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다");
	}
	
	void ChangeChannelDmb(int channel)
	{
		this.channel = channel;
		System.out.println("채널 + " + channel + "번으로 바꿉니다");
	}
	
	void turnOffDmb()
	{
		System.out.println("DMB 방송 수신을 종료합니다");
	}
}

public class Practice_extends {
	
	public static void ShowInfo(CellPhone obj)
	{
		if(obj instanceof DmbCellPhone)
		{
			DmbCellPhone down = (DmbCellPhone)obj;
			System.out.printf("모델 : %s\n색상 : %s\n채널 : %d\n", down.model, down.color, down.channel);
		}
	}
	
	public static void TurnOn(CellPhone obj)
	{
		if(obj instanceof DmbCellPhone)
		{
			DmbCellPhone down = (DmbCellPhone)obj;
			obj.PowerOn();
		}
	}
	
	public static void TurnOff(CellPhone obj)
	{
		if(obj instanceof DmbCellPhone)
		{
			DmbCellPhone down = (DmbCellPhone)obj;
			obj.PowerOff();
		}
	}
	
	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone("자바폰","검정",10);
		
		ShowInfo(dmb);
		TurnOn(dmb);
		TurnOff(dmb);
		dmb.sendVoice("야");
		dmb.receiveVoice("왜");
		dmb.sendVoice("수영장");
		dmb.hangUp();
	}

}
