package ChPractice;

class PrCCar
{
	int gas;
	
	void setGas(int gas)
	{
		this.gas = gas;
	}
	
	boolean isLeftGas()
	{
		if(gas == 0)
		{
			System.out.println("gas가 없습니다");
			return false;
		}
		System.out.println("gas가 있습니다");
		return true;
	}
	
	void run()
	{
		while(true)
		{
			if(gas > 0)
			{
				System.out.println("달립니다.(gas 잔량 : " + gas + ")");
				gas -= 1;
			}
			else
			{
				System.out.println("멈춥니다.(gas 잔량 : " + gas + ")");
				return;
			}
		}
	}
	
}
public class PracticeC {

	public static void main(String[] args) {
		PrCCar mycar = new PrCCar();
		
		mycar.setGas(5);;
		
		boolean gasState = mycar.isLeftGas();
		if(gasState)
		{
			System.out.println("출발합니다");
			mycar.run();
		}
		
		if(mycar.isLeftGas())
		{
			System.out.println("gas를 주입할 필요가 없습니다");
		}
		else
		{
			System.out.println("gas를 주입하세요");
		}
		
		mycar.setGas(10);
		mycar.isLeftGas();
		mycar.setGas(0);
		mycar.isLeftGas();
	}

}
