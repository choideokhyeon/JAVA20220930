package StarCraft;

public class Barrack extends Building implements Lift{

	@Override
	void Construct() {
		
	}
	
	@Override
	void UnderAttack(Unit unit)
	{
		
	}
	
	Marine makeMarine(String name)
	{
		return new Marine(new Rifle(), name);
	}
	
	Medic makeMedic()
	{
		return new Medic();
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
