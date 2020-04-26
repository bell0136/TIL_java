class Arith	
{
	int n1;	
	int n2;
	static final double PI = 3.14;
	public static double add(double n1,double n2)
	{
		return n1+n2;
	}
	public static double min(double n1,double n2)
	{
		return n1 - n2;
	}
	public static double mul(double n1,double n2)
	{
		return n1 * n2;
	}
}
class Area
{
	
	public void calCirAr(double Rad)
	{
		double result = Rad*Rad;		
		System.out.println("circle area is : "+Arith.mul(result,Arith.PI));
		
	}
	public void calRacAr(double Base, double high)
	{
		System.out.println("ractangle area is : "+Arith.mul(Base,high));
	}
	
}
class Perimeter
{
	public void calCirPe(double Rad)
	{
		double result = 2*Rad;
		System.out.println("circle perimeter is :"+Arith.mul(Rad*2,Arith.PI));		
	}
	public void calRacPe(double Base, double high)
	{
		System.out.println("ractangle perimeter is : " +Arith.mul(2,(Base+high)));
	}
}
class ChangeToStaticMethod
{
	public static void main(String[] args)
	{
		Area a1= new Area();
		Perimeter p1= new Perimeter();
		a1.calCirAr(3.4);
		p1.calRacPe(4,2);
	}
}