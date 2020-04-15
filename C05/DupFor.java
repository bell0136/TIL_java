class DupFor
{
	public static void main(String[] args)
	{
		int i = 0;
		int j = 0;
		for(i = 0; i < 3; i++)
		{
			System.out.println("i is "+i);
			for(j=0;j<3;j++)
			{
				System.out.println("j is "+j);
			}
		}
		
	}
}