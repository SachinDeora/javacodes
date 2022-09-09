package world;
import info.Protect;

class Sahil
{
	private int x;
	public void name(int y)
	{
		x=y;
	}
	public void show()
	{
		System.out.println(x);
	}
}
public class Access extends Sahil
{
		public static void main(String args[])
		{
			Protect s1=new Protect();
			s1.get(12);
			System.out.println("The rollno is:-"+s1.gets());
		}
}