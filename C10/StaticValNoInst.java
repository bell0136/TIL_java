class Init
{
	static int num = 50;
	public void Init()
	{
		num++;
		System.out.println("num is "+num);
	}
}
class StaticValNoInst
{
	public static void main(String[] args)
	{
		Init init1 = new Init();
		init1.num-=34;
		init1.Init();
	}
}
