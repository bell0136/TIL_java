class ex6_1pro2
{
	public static void main(String[] args)
	{
		Compare(5,3);
		Compare(7,10);
	}
	public static void Compare(int num1, int num2)
	{	
		int result = 0;
		result = (num1>num2) ? (num1-num2) : (num2-num1);	
		System.out.println("result is "+ result);
	}
	
}