class s
{
	public void f1(int x)
	{
		System.out.println("It is an sachin");
	}
}
public class Overriding
{
	public void f1(int x)
	{
		System.out.println("it is an object");
	}
	public static void main(String args[])
	{
		Overriding s1=new Overriding();
		s1.f1(1);
	}
}