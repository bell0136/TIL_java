class ex6_3pro2
{
	public static void main(String[] args)
	{		
		int num = 8;
		Binary(8);
	}
	public static int Binary(int num)
	{	
		if(num == 1)
		{
			System.out.println(num);
			return 0; 
		}
		System.out.println(num%2);
		return 2*Binary(num/2);
	}
}