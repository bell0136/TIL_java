class Triangle
{
	double base;
	double high;
	public Triangle(int Base, int High)
	{
		base = Base;
		high = High;
	}
	public void baseChange(int Base)
	{
		base = Base;
	}
	public void highChange(int High)
	{
		high = High;
	}	
	public double triangleArea()
	{
		return (base*high)/2;	
	}
	
}
class ex7_1pro1
{
	public static void main(String[] args)
	{
		Triangle tri1 = new Triangle(5,6);
		System.out.println("area is "+tri1.triangleArea());
		tri1.baseChange(2);
		System.out.println("area is "+tri1.triangleArea());
		tri1.highChange(10);
		System.out.println("area is "+tri1.triangleArea());
	}	
}