class Person
{
	private int a;
	private String s;
	public void getroll(int x)
	{
		a=x;
	}
	public void getName(String v)
	{
		s=v;
	}
	public int get()
	{
		return (a);
	}
	public String naem()
	{
		return(s);
	}
}
public class Inheritance extends Person
{
	private int b;
	public void getage(int a)
	{
		b=a;
	}
	public int as()
	{
		return(b);

	}
	public static void main(String args[])
	{
		Inheritance s1=new Inheritance();
		s1.getroll(12);
		s1.getage(23);
		s1.getName("sachin");
		System.out.println("rollno number is:-"+s1.get());
		System.out.println("Name  is:-"+s1.naem());
		System.out.println("Age is:-"+s1.as());


	}

}