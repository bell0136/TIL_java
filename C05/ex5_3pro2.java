class ex5_3pro2
{
	public static void main(String[] args)
	{
		int n = 24;
		int num = n/10;
		switch(num)
		{
			case 0:
			System.out.println("n은 0이상 10미만");
			break;
			case 1:
			System.out.println("n은 10이상 20미만");
			break;
			case 2:
			System.out.println("n은 20이상 30미만");
			break;
			case 3:
			System.out.println("n은 30이상");
			break;
		}
		
		System.out.println("finish");	
	}
}