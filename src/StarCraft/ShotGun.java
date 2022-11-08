package StarCraft;

public class ShotGun extends Gun {

	ShotGun()
	{
		bulletCnt=10;	//저장된 총의 개수
		power=200;		//파워기본값
	}

	@Override
	void fire(Unit unit) {
		if(bulletCnt -1 < 0)
		{
			System.out.println("탄환 부족..");
			return ;
		}
		System.out.println("발사!");
		
//		unit.HP -= power;
		unit.UnderAttack(power);
		bulletCnt--;
	}

	@Override
	void reload() {
		System.out.println("재장전");
	}

}
