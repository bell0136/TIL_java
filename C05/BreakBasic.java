class BreakBasic
{
	public static void main(String[] args)
	{
		int num = 1;
		while(num<100)
		{
			if((num%5==0)&&(num%7==0))
			{
				System.out.println("number is "+ num);
				break;
			}
			num++;
		}
	}
}