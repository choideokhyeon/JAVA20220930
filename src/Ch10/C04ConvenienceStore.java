package Ch10;

class Guest
{
	int gmoney;
	int gdrink;
	
	void pay(cvstore store, int money)
	{
		gmoney -= money;
		int cnt = store.returndrink(money);
		gdrink += cnt;
	}

	public Guest(int gmoney, int gdrink) {
		super();
		this.gmoney = gmoney;
		this.gdrink = gdrink;
	}
	
	@Override
	public String toString() {
		return "Guest [gmoney=" + gmoney + ", gdrink=" + gdrink + "]";
	}
}

class cvstore
{
	int smoney;
	int sdrink;
	int price;
	
	int returndrink(int money)
	{
		smoney += money;
		int cnt = money / price;
		sdrink -= cnt;
		return cnt;
	}

	public cvstore(int smoney, int sdrink, int price) {
		super();
		this.smoney = smoney;
		this.sdrink = sdrink;
		this.price = price;
	}

	@Override
	public String toString() {
		return "cvstore [smoney=" + smoney + ", sdrink=" + sdrink + ", price=" + price + "]";
	}
}

public class C04ConvenienceStore {

	public static void main(String[] args) {
		cvstore Daegu = new cvstore(100000, 100, 1000);
		Guest people1 = new Guest(10000, 0);
		
		people1.pay(Daegu, 5000);
		System.out.println(people1);
		System.out.println(Daegu);
	}

}
