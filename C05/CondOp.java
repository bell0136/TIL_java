class CondOp
{
	public static void main(String[] args)
	{
		int num1 = 500;
		int num2 = 50;
		int big = 0;
		int diff = 0;
		
		big = (num1 > num2) ? num1 : num2; 
		System.out.println(big);
		diff = (num1 > 0) ? (num1-num2) : (num2-num1);
		System.out.println(diff);
		
	}
}