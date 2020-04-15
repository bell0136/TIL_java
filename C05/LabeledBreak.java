class LabeledBreak
{
	public static void main(String[] args)
	{
		int i = 0;
		int j = 0;
		outerLoop :
		for(i = 1; i < 10; i++)
		{			
			for(j=1;j<10;j++)
			{
				System.out.println("["+i+","+j+"]");
				if(i%2==0&&j%2==0)
				{
					break outerLoop;		
				}
			}
		}
		
	}
}