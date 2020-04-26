class StaticVal 
{
	static int num=0;
	public StaticVal ()
	{
		num++;
		System.out.println("static num is " + num);
	}
}
class ClassVal
{
	public static void main (String[] args)
	{
		StaticVal up = new StaticVal();
		StaticVal up1 = new StaticVal();
		StaticVal up2 = new StaticVal();
	}
}
