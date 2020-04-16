class ex6_2pro2
{
	public static void main(String[] args)
	{
		boolean result;
		for(int i = 1; i <= 100; i++)
		{
			result = Prime(i);
			if(result == true)
			{
				System.out.println(i);
			}
		}
		
	}
	public static boolean Prime(int num1)
	{		
		int i = num1-1;
		while(i > 1)
		{
			if(num1 % i==0)
			{
				return false;	
			}
			i--;			
		}
		return true;
	}
	
	
}