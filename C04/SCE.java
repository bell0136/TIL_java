class SCE
{
	public static void main(String[] args)
	{
		int num1=0; 
		int num2=0;
		boolean result;
		result = (num1+=10)<0 && (num2+=10)>0;
		System.out.println("num1의 값"+num1+"num2의 값"+num2);
		result = num1>0 || (num2+=10)>0;
		System.out.println("num1의 값"+num1+"num2의 값"+num2);
	}	
}