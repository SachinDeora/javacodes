abstract class Normal
{
	abstract void f1();
}
public class AbstractMethod extends Normal
{
	public void f1()
	{
		System.out.println("saHIL KHAN");
	}
	public void f2()
	{
		System.out.println("sachin deora");
	}
	public static void main(String args[])
	{
		AbstractMethod s1=new AbstractMethod();
		s1.f1();
		s1.f2();
	}
}