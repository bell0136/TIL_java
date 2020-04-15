class ex6_1pro1
{
	public static void main(String[] args)
	{
		int num1 = 5;
		int num2 = 2;
		System.out.println("start");
		Add(num1, num2);
		Min(num1, num2);
		Mul(num1, num2);
		Division(num1, num2);
		Remainder(num1, num2);
		System.out.println("finish");	

	}
	public static void Add(int num1, int num2)
	{		
		System.out.println(num1 +"+"+num2+"="+(num1+num2));
	}
	public static void Min(int num1, int num2)
	{		
		System.out.println(num1 +"-"+num2+"="+(num1-num2));
	}
	public static void Mul(int num1, int num2)
	{		
		System.out.println(num1 +"X"+num2+"="+(num1*num2));
	}
	public static void Division(int num1, int num2)
	{		
		System.out.println(num1 +"/"+num2+"="+(num1/num2));
	}
	public static void Remainder(int num1, int num2)
	{		
		System.out.println(num1 +"%"+num2+"="+(num1%num2));
	}
}