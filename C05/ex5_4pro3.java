class ex5_4pro3
{
	public static void main(String[] args)
	{
		int num = 1;
		int sum = 0;
		while(num<=1000)
		{	
			if((num%2==0)&&(num%7==0))
			{
				System.out.println("num is "+num);
				sum += num;
			}
			num++;
		}
		System.out.println("sum is "+sum);	
	}
}