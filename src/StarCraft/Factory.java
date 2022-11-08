package StarCraft;

public class Factory extends Building implements Lift {

	public FactoryAddOn extendOn;
	
	void ExtendFactory()
	{
		extendOn = new FactoryAddOn();
	}
	
	void Construct() {
		
	}

	@Override
	void UnderAttack(Unit unit) {
		
	}

	@Override
	public void Move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Land() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		
	}
}
