import java.util.*;
public class Swap
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the five elememnt of an array");
		for(int i=0;i<arr.length;i++)
		arr[i]=s1.nextInt();

		swap(arr,2,3);

		System.out.println("Swaping result is");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Elements is:-"+arr[i]);
		}
	}
	public static void swap(int arr[],int n,int d)
	{
		int temp;
		temp=arr[n];
		arr[n]=arr[d];
		arr[d]=temp;
	}
}