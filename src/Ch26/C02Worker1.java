package Ch26;

public class C02Worker1 extends Thread{

	@Override
	public void run()
	{
		for(int i = 0; i < 5; i ++)
		{
			System.out.println("TASK1");
			try{Thread.sleep(500);} catch(Exception e){e.printStackTrace();}
		}
	}

}
