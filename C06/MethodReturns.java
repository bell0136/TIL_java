class MethodReturns
{
	public static void main(String[] args)
	{
		System.out.println("add is "+ Add(5,4));
		System.out.println("square is "+ Square(6));
	}
	public static int Add(int num1, int num2)
	{	
		return num1+num2;
	}
	public static int Square(int num1)
	{	
		return num1*num1;
	}
	
}