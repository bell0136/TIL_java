class OnlyExitReturn 
{
	public static void main(String[] args)
	{	
		divide(5,2);
		divide(3,0);
	}
	public static void divide(int num1,int num2)
	{
		if(num2==0)
		{
			System.out.println("can't divide by zero"); 
			//어떤수를 0으로 나누면 compiler에서 exception발생할 수 있다.
		}
	System.out.println(num1+"/"+num2+"의 몫 "+(num1/num2));
	}
}