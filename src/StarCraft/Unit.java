package StarCraft;

public abstract class Unit {
	public int HP;
	public String name;
	public boolean isalive;
	
	abstract void Move();
	
	void UnderAttack(int damage)
	{
		if(HP-damage <= 0)
		{
			System.out.println(name + "이 전사했습니다");
			isalive = false;
			return ;
		}
		HP -= damage;
		System.out.println(name + "이 공격받고 있습니다. 현재 HP : " + HP);
	}
} 