class ex5_6pro2
{
	public static void main(String[] args)
	{
		int num = 1;
		int sum = 0;
		while(true)
		{
			if(num%2==0 && num%3==0)
			{
				sum+=num;
				if(sum>1000)
				{
					System.out.println("number is "+ num);
					System.out.println("sum is "+ sum);	
					break;
				}
									
			}
			num++;
		}
		
	}
}