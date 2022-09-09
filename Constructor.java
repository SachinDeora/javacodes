public class Constructor
{
	private int l,b,h;
	public Constructor()
	{
		l=10;
		b=20;
		h=30;
	}
	public Constructor(int l,int b,int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public void print()
	{
		System.out.println(" length is:-"+l+" Breadth is:-"+b+" Height is="+h);
	}
	public static void main(String args[])
	{
		Constructor s1=new Constructor();
		s1.print();		
	}
}