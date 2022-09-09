package def;	
 class Bo
{
	 int x;
	 void sac(int y)
	{
		x=y;
	}
	void print()
	{
		System.out.println("value of x is:-"+x);
	}

}
public class Default
{
	public static void main(String args[])
	{
		Bo s1=new Bo();
		s1.sac(12);
		s1.print();
	}
}