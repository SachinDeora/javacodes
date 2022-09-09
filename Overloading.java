class a
{
	//private int x,y;
	public void f1(int x)
	{
		System.out.println("sachin deora");
	}
	
}
public class Overloading extends a {
	
	public void f1(int x,int y)
	{
		System.out.println("shruti");
	}
	public static void main(String args[])
	{
		Overloading s1=new Overloading();
		s1.f1(12);
		s1.f1(23,24);
	}
}