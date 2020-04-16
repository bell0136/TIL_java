class RightRecul
{
	public static void main(String[] args)
	{		
		SayHi(4);
	}
	public static int SayHi(int num)
	{	
		if(num == 1)
		{
			return 0;
		}
		System.out.println("Hi~");
		return SayHi(num-1);
	}
}