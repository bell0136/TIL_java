class ex4_2pro2
{
	public static void main(String[] args)
	{
		int num = 15678;
		int result = num%2;
		num/=2;
		result = num%2;
		num/=2;
		result = num%2;
		num/=2;
		System.out.println(result);
		result = num%2;
		num/=2;
		result = num%2;
		num/=2;
		System.out.println(result);
	}
}