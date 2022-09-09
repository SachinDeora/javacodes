public class Boxes
{
	private int breadth,height,depth;
	public void setbreadth(int b,int h,int d)
	{
		breadth=b;height=h;depth=d;

	}
	public void setDimension()
	{
		System.out.println("Breadth is:="+breadth+ "Height is:="+height+ "Depth is="+depth);
	}
	public static void main(String args[])
	{
		Boxes s1=new Boxes();
		s1.setbreadth(1,2,3);
		s1.setDimension();
		s1=new Boxes();
		s1.setDimension();
	}
}