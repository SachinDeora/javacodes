import java.util.*;
public class Array
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int [] arr=new int[5];
		System.out.println("Enter the 5 element of an array");
		for(int i=0;i<arr.length;i++)
		arr[i]=s1.nextInt();

		System.out.println("Printing elements is :-");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Elements is:-"+arr[i]);
		}

		int [] b=arr;
		b[2]=123;
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Array is:-"+b[i]);
		}
				System.out.println("Printing elements is :-");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Elements is:-"+arr[i]);
		}

	}
}