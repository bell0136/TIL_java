class Method2Param
{
	public static void main(String[] args)
	{
		System.out.println("start");
		hiEveryone(23,170.4);
		hiEveryone(34,160);	
		System.out.println("finish");	

	}
	public static void hiEveryone(int age,double height)
	{
		System.out.println("good morning");
		System.out.println("my age is "+age+"my height is "+height);
	}
	public static void byeEveryone()
	{
		System.out.println("see you");
	}
}