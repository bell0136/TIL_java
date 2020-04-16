class ReculFactorial
{
	public static void main(String[] args)
	{	
		boolean scope = true;	
		System.out.println("3 Factorial is "+Factorial(3));
		System.out.println("12 Factorial is "+Factorial(12));
	}
	public static int Factorial(int num)
	{	
		if(num==1)
		{
			return 1;
		}
		else 
		{
			return num*Factorial(num-1);
		}	
	}
}