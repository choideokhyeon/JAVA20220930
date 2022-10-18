package Ch13;

import java.util.Scanner;

class Circle
{
	private double x, y;
	private int radius;
	public Circle(double x, double y, int radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void show()
	{
		System.out.printf("(%.1f %.1f)%d\n", x, y, radius);
	}
}

public class C98Prac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c[] = new Circle[3];
		for(int i = 0; i < c.length; i++)
		{
			System.out.printf("%d번째 x,y,radius 입력 >> ", i+1);
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		
		for(int i = 0; i < c.length; i++)
		{
			c[i].show();
		}
		
		sc.close();
		
	}

}
