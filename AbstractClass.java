abstract  class Neil
{
   private int x,y;
   public void f1(int s,int z)
   {
   		x=s;
   		y=z;
   }
   public void print()
   {
   	System.out.println("The value of x is:-"+x);
   	System.out.println("The value of y is:-"+y);
   }
}

public class AbstractClass extends Neil
{
	public void f3()
	{
		System.out.println("sahil khan");
	}
	public static void main(String args[])
	{
		Neil s1=new AbstractClass();
		s1.f1(23,2);
		s1.print();
		//s1.f3();
	}
}