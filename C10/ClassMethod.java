class NumPrinter
{
	static void showInt (int num)	
	{
		System.out.println("int is "+num);
	}
	static void showDouble (double num2)
	{
		System.out.println("double is "+num2);
	}
}
class ClassMethod
{
	public static void main (String[] args)
	{
		NumPrinter.showInt(4);
		NumPrinter n1 = new NumPrinter();
		n1.showDouble(6.444);
	}
}