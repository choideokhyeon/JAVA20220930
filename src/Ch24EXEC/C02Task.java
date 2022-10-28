package Ch24EXEC;

import java.util.Random;

public class C02Task implements Runnable {
	
	GUI gui;
	C02Task(GUI gui)
	{
		this.gui = gui;
	}
	
	@Override
	public void run() {
		try{
			Random rand = new Random();
			for(int i = 1; i <= 10; i++)
			{
				int gacha = rand.nextInt(100)+1;
				if(1 <= gacha && gacha <= 3)
				{
					gui.area.append("★SSR★\n");
				}
				else if(4 <= gacha && gacha <= 13)
				{
					gui.area.append("SR\n");
				}
				else
				{
					gui.area.append("R\n");
				}
				Thread.sleep(500);
				gui.scroll.getVerticalScrollBar().setValue(gui.scroll.getVerticalScrollBar().getMaximum());
			}
			}catch(Exception e1) {e1.printStackTrace();}
				
		
	}

}
