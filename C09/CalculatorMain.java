import orange.cal.Calculator;
class CalculatorMain
{
	public static void main(String[] args)
	{
		Adder adder1 = new Adder();
		Subtractor subner1 = new Subtractor();
		Calculator cal1 = new Calculator();
		System.out.println("2+4="+adder1.adderResult(2,4));
		System.out.println("10-6="+subner1.subResult(10,6));
		cal1.showCal();
	
		
	}
}