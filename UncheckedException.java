import java.util.*;
public class UncheckedException
{
	public static void main(String args[])
	{	
		Scanner s1=new Scanner(System.in);
	     int x=s1.nextInt();
	     int y=s1.nextInt();
	     String s2=null;
	     try
	    {
	     	System.out.println("Program is started");
	     	System.out.println("Result is:-"+x/y);
	     	System.out.println("Result is:-"+s2.length());
	     	System.out.println("Program is not saved");
	    }

	   	catch(ArithmeticException e)
	   	{
	   		System.out.println("Exception is:-"+e.getMessage());
	   	}
	   	catch(NullPointerException e)
	   	{
	   		System.out.println("Exception is:-"+e.getMessage());
	   	}
	   	finally
	   	{
	   		System.out.println("sachin deora");
	     	
		}
	}	
}