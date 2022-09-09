import java.util.*;
public class RangeOfPrime
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please Enter the low number");
		int low=s1.nextInt();
		
		int max=s1.nextInt();
		for(int i=low;i<=max;i++)
		{
			int count=0;
		    for(int z=2;z*z<=i;z++)
		    {
		    	if(i%z==0)
		    	{
		    		count++;
		    		break;
		    		
		    	}
		    }
				if(count==0)
				{
				System.out.println("prime");
				}    
				else
				{
				System.out.println("Not prime");
				}
		}
	}
}