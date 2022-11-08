package StarCraft;

public class Main {

	public static void main(String[] args) throws Exception{
		Marine mar1 = new Marine(new Rifle(), "마린1");
		Marine mar2 = new Marine(new Rifle(), "마린2");
		Marine mar3 = new Marine(new ShotGun(), "마린2");
		
		
		while(true)
		{
			Thread.sleep(500);
			mar1.Attack(mar2);
		}
		
	}

}
