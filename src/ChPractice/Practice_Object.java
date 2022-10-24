package ChPractice;

import java.util.Objects;

class Object
{
	int x;
	int y;
	
	public Object(int x, int y)
	{
		super();
		this.x = x;
		this.y = y;
	}

	public int hashCode(Object obj)
	{
		return Objects.hash(obj);
	}

	@Override
	public boolean equals(java.lang.Object obj)
	{
		if(obj instanceof Object)
		{
			Object down = (Object)obj;
			return this.x + this.y == down.x + down.y;
		}
		return false;
	}
	
}

public class Practice_Object {

	public static void main(String[] args) {
		Object ob1 = new Object(10, 20);
		Object ob2 = new Object(30, 0);
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.hashCode());
	}

}
