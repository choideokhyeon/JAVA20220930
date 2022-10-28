package Ch26;

public class C03Task2 implements Runnable{

	C01GUI gui;
	C03Task2(C01GUI gui){
		this.gui = gui;
	}
	
	@Override
	public void run() {
		while(true) {
			gui.area2.append("Task02.......\n");
			try {Thread.sleep(500);}
			catch(Exception e)
			{
				break;
			}
		}
		
	}

}
