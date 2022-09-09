interface i1
{
	void f1();
}
interface i2
{
	void f2();

}
interface i3 extends i1,i2
{
	void f3();
}
 class Interface implements i1
{
	public void f1()
	{
		System.out.println("sachin deora");
	}
	public void f2()
	{
		System.out.println("sahil khan");

	}
	public void f3()
	{
		System.out.println("sanad khan");
	}
	public static void main(String args[])
	{
		Interface f=new Interface();
		f.f1();
		f.f2();
		f.f3();
	}
}
