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
		Arith ar = new Arith();
		double result = Rad*Rad;		
		System.out.println("circle area is : "+ar.mul(result,Arith.PI));
		
	}
	public void calRacAr(double Base, double high)
	{
		Arith ar2 = new Arith();
		System.out.println("ractangle area is : "+ar2.mul(Base,high));
		

	}
	
}
class Perimeter
{
	public void calCirPe(double Rad)
	{
		Arith ar3 = new Arith();
		double result = 2*Rad;
		System.out.println("circle perimeter is :"+ar3.mul(Rad*2,Arith.PI));		
	}
	public void calRacPe(double Base, double high)
	{
		Arith ar4 = new Arith();
		System.out.println("ractangle perimeter is : " +ar4.mul(2,(Base+high)));
	}
}
class HowMethod
{
	public static void main(String[] args)
	{
		Area a1= new Area();
		Perimeter p1= new Perimeter();
		a1.calCirAr(3.4);
		p1.calRacPe(4,2);
	}
}