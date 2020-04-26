class Point
{
	private int xpos;
	private int ypos;
	public Point (int x,int y)
	{
		xpos = x;
		ypos = y;
	}
	void PosInfo()
	{
		System.out.println("["+xpos+","+ypos+"]");
		
	}
}
class Circle
{
	private Point p1;
	private int rad;
	
	public Circle(int Xpos,int Ypos,int Rad)	
	{
		p1 = new Point(Xpos,Ypos);
		rad = Rad;
	}
	void CircleInfo()
	{					
		System.out.println("radius : "+rad);
		p1.PosInfo();		
	}	
}
class Ring
{	
	private Circle c1;//inner
	private Circle c2;//outter
	public Ring (int innerXpos,int innerYpos,int innerRad,int outterXpos,int outterYpos,int outterRad)
	{
		c1 = new Circle(innerXpos, innerYpos, innerRad);
		c2 = new Circle(outterXpos, outterYpos, outterRad);			
	}
	void RingInfo()	
	{
		System.out.println("Inner Circle Info");
		c1.CircleInfo();
		System.out.println("Outter Circle Info");
		c2.CircleInfo();
	}
}
class ex9_2pro1
{
	public static void main (String[] args)
	{
		Ring ring1 = new Ring(1,1,4,6,7,8);		
		ring1.RingInfo();

		
	}
}