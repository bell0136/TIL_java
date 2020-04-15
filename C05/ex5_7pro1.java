class ex5_7pro1
{
	public static void main(String[] args)
	{
		int i = 0;
		int j = 0;
		
		for(i = 2; i < 10; i++)
		{	
			if(i%2 == 0)
			{		
				for(j=1; j < 10 ; j++)
				{
					System.out.println(i+"X"+j+"="+i*j);	
					if(i==j)
					{
						break;	
					}
							
				}
			}		
		}
		
	}
}