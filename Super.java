class Parent
{
	int x;
	public void f1()
	{
		System.out.println("Sachin deora");
	}
}
public class Super extends Parent
{
	int x;
	public void f1()
	{
		super.f1();

		System.out.println("sanad");
	}

	public void f2()
	{
		int x=20;
		 this.x=30;
		 super.x=40;
		System.out.println("x="+x);
				System.out.println("x="+this.x);
						System.out.println("x="+super.x);
	}

	public static void main(String args[])
	{
		Super s1=new Super();
		s1.f1();
		s1.f2();
	}
}