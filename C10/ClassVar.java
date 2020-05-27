class StaticVar
{
	static int num=0;
	public StaticVar ()
	{
		num++;
		System.out.println("static num is " + num);
	}
}
class ClassVar
{
	public static void main (String[] args)
	{
		StaticVar up = new StaticVar();
		StaticVar up1 = new StaticVar();
		StaticVar up2 = new StaticVar();
	}
}
