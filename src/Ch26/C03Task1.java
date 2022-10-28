package Ch26;

public class C03Task1 implements Runnable{

	C01GUI gui;
	C03Task1(C01GUI gui)
	{
		this.gui = gui;
	}
	@Override
	public void run() {	
		
		while(true) 
		{		
			try {
				gui.area1.append("TASK1......\n");

			
				Thread.sleep(500);	//인터럽트 발생시 예외객체생김 catch넘겨짐
			}
			catch(Exception e)
			{
				//e.printStackTrace();
				System.out.println("예외발생!");
				//System.out.println("인터럽트걸림");
				break;	//인터럽트가 발생하면 while문을 벗어나도록 하기 위함
			}
			
		}	
		 
	}
	


}
