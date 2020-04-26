class CircleIn
{
	static final double PI=3.14;
	private double rad;
	private double peri;
	private double ar;
	public CircleIn(double Rad)
	{
		rad = Rad;
	}
	public void showPerimeter ()
	{
		peri = 2*PI*rad;
		System.out.println("perimeter is :" + peri);
	}
	public void showArea ()
	{
		ar = PI*rad*rad;
		System.out.println("area is :" + ar);
	}
	
	
}
class CircleVarUse
{
	public static void main(String[] args)
 	{
		CircleIn c1 = new CircleIn(2.5);
		c1.showPerimeter();
		c1.showArea();
	}
}