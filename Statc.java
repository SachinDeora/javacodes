public class Statc
{
	int x;
	static int y;
	public void fun(int z)
	{
		x=z;
		System.out.println("value of x is:-"+x);
	}
	public static void fun1(int y)
	{

		System.out.println("value of y is"+y);
	}
	static class Test
	{
		public static int n=10;
	}
	public static void main(String args[])
	{
		Statc s1=new Statc();
		s1.fun(2);
		//y=5;
		Statc.fun1(3);

		System.out.println(Statc.Test.n);
		/**System.out.println(y);*/
	}

}