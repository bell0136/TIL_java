class ex6_2pro1
{
	public static void main(String[] args)
	{
		System.out.println("CircleArea is "+ CircleArea(3.5));
		System.out.println("CirclePerimeter is "+  CirclePerimeter(6));
	}
	public static double CircleArea(double rad)
	{	
		return 3.14*rad*rad;
	}
	public static double CirclePerimeter(double rad)
	{	
		return 3.14*rad*2;
	}
	
}