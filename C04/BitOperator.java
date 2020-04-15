class BitOperator
{
	public static void main(String[] args)
	{
		int num1 = 17;  //0001 0001
		int num2 = 7;   //0000 0111
		int num3 =-1;   //1111 1111
		System.out.println(num1^num2); // 0001 0110 22
		System.out.println(~num3); // 0000 0000 0
		System.out.println(num2|num3); // 1111 1111 -1
		System.out.println(num1&num3); // 0001 0001 17
	}
}