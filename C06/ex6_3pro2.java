class ex6_3pro2
{
	public static void main(String[] args)
	{		
		int num = 4;
		System.out.println(Binary(num));
		
	}
	public static String Binary(int num)
	{	
		if(num == 1)
		{
			//System.out.println(num);
			return "1";
		}
		//System.out.println(num%2);
		return Binary(num/2)+(num%2);
	}
}
