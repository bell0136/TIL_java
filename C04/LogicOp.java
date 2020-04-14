class LogicOp
{
	public static void main (String[] args)
	{
		int num1 = 20;
		int num2 = 30;
		boolean result1 = (num1 == 10&&num2 == 30);
		boolean result2 = (num1 > 10 || num2 != 40);
		System.out.println(result1);
		System.out.println(result2);
		if(num1==num2)
		{
			System.out.println("num1와 num2는 같다.");
		}
		else
		{
			System.out.println("num1와 num2는 다르다.");
		}	

	}
}