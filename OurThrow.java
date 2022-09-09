import java.util.*;
public class OurThrow
{
	public static void main(String args[])
	{
	 	Scanner s1=new Scanner(System.in);
	 	System.out.println("Just Please Enter the Balance:- ");
	 	int bal=s1.nextInt();
	 	System.out.println("Please Enter the withdrawl amount:- ");
	 	int w=s1.nextInt();
	 	try
	 	{
	 		if(bal<=w)
	 	{
	 	    throw new ArithmeticException("Insufficient Balance");
	 	}
	 	bal=bal-w;
	 	System.out.println("Transiction Completed");
	 	}
	 	catch(ArithmeticException e)
	 	{
	 		System.out.println("Exception is:- "+e.getMessage());
	 	}
	 	System.out.println("Program Continue..");



	}
}