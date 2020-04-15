class ex5_7pro2
{
	public static void main(String[] args)
	{
		int i = 0;
		int j = 0;
		int result = 0;		
		for(i = 0; i < 10; i++)
		{			
			for(j=0; j < 10 ; j++)
			{
				result = (i*10+j)+(j*10+i);					
				if(result == 99)
				{
					System.out.println("i is "+i+"j is "+j);	
				}							
			}		
		}
	}
}