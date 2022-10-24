package Ch18;

public class C02ArrayIdxException {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30};
		
		try {
		for(int i = 0; i < 5; i++)
		{
			System.out.println(arr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException a)
		{
			a.printStackTrace();
		}
		
		System.out.println("실행코드1");
		System.out.println("실행코드2");
	}

}
