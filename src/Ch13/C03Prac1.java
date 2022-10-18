package Ch13;
//---------------------------------------
//Practice
//---------------------------------------
//shopService 객체를 싱글톤으로 만들어 보세요
//ShopServiceExample 클래스에서 shopService 의 getInstance() 메소드로 싱글톤을 얻을 수 있도록
//ShopService 클래스를 작성해보세요
class ShopService
{
	//싱글톤 구현
	public static ShopService instance;
	
	private ShopService() {};
	
	public static ShopService getInstance()
	{
		if(instance == null)
			instance = new ShopService();
		return instance;
	}
	
}

public class C03Prac1 {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		}

		else {
			System.out.println("다른 ShopService 객체 입니다.");
		}
	}
}
