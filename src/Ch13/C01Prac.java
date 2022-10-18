package Ch13;

//다음 2개의 static 가진 ArrayUtil 클래스를 만들어보자.
//다음 코드의 실행 결과를 참고하여 concat()와 print()를 작성하여 ArrayUtil 클래스를 완성하라.

class ArrayUtil {
	
   public static int[] concat(int[] a, int[] b)
   {
//	   int[] temp = new int[a.length + b.length];
//	   for(int i = 0; i < a.length + b.length; i++)
//	   {
//		   if(i > a.length-1)
//		   {
//			   temp[i] = b[i-a.length];
//		   }
//		   
//		   else
//		   {
//			   temp[i] = a[i];
//		   }
//	   }
//	   return temp;
	   
	   
	   //다른풀이
	   int len = a.length + b.length;
	   int[] arr = new int[len];
	   int i = 0;
	   while(i < a.length)
	   {
		   arr[i] = a[i];
		   i++;
	   }
	   
	   while(i < len)
	   {
		   arr[i] = b[i-a.length];
		   i++;
	   }
	   
	   return arr;
   }
   
   public static void print(int[] a)
   {
	   System.out.print("[");
	   for(int n : a)
	   {
		   System.out.print(n + " ");
	   }
	   System.out.print("]");
   }
}

public class C01Prac {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int[] array1 = {1, 5, 7, 9};
      int[] array2 = {3, 6, -1, 100, 77};
      int[] array3 = ArrayUtil.concat(array1, array2);
      ArrayUtil.print(array3);
      
      System.out.println();
      int[] arr1 = {2, 4, 6, 8, 10};
      int[] arr2 = {3, 6, 9};
      int[] arr3 = ArrayUtil.concat(arr1, arr2);
      ArrayUtil.print(arr3);
   }
}