abstract class Ab
{
	int x;
	Ab()
	{
		x=12;
		System.out.println("x="+x);
	}
}
public class AbstractConstructor extends Ab
{
	public void f2()
	{
		System.out.println("sahil khan");
	}
	public static void main(String args[])
	{
		AbstractConstructor f1=new AbstractConstructor();
		f1.f2();
	}
}