class ex6_3pro1
{
	public static void main(String[] args)
	{		
		int num = 5;
		System.out.println("2의 "+num+" 승은 "+Square(num));
	}
	public static int Square(int num)
	{	
		if(num == 0)
		{
			return 1;
		}
		
		return 2*Square(num-1);
	}
}