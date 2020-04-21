
class Circle
{
	double rad;
 	final double PI;

	public Circle (double r)
	{
		rad = r;
		PI = 3.14;
	}
	public double Circle ()
	{
		return rad*rad*PI;
	}	
}
class CircleArea
{
	public static void main(String[] args)
	{
		Circle A = new Circle(5);
		System.out.println("원의 둘레 : "+A.Circle());
	}
}