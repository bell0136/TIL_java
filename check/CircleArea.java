class CircleInfo
{
	int rad;
	final double PI;
	public CircleInfo(int r)
	{
		rad = r;
		PI=3.14;	
	}
	public double CircleArea()
	{
		return rad*rad*PI;
	}

}
class CircleArea
{
	public static void main(String[] args)
	{
		CircleInfo A = new CircleInfo(7);
		System.out.println("원의 넓이 :"+ A.CircleArea());
	}
}
