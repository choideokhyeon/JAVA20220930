package Ch14;

class Pen	//펜
{
	private int amount;
	
	public int getAmount()
	{
		return amount;
	}
	
	public void setAmount(int amount)
	{
		this.amount = amount;
	}
}

class SharpPencil extends Pen	// 샤프펜슬
{
   private int width;	//펜의 굵기
}


class Ballpen extends Pen	//볼펜
{
   private String color;	//볼펜의 색
   public String getColor()
   {
	   return color;
   }
   public void setColor(String color)
   {
	   this.color = color;
   }
}


class FountainPen extends Ballpen	//만년필
{
	public void refill (int n)
	{
	   setAmount(n);
	}
}
	

public class C99Prac {

	public static void main(String[] args) {

	}

}
