package orange.cal;

public class Calculator
{
	private Adder adder;
	private Subtractor sub1;
	//adder 호출/stubstractor 호출/횟수
	public Calculator ( )
	{
		Adder adder = new Adder ( );
		Subtractor sub1 = new Subtractor ( );
	} 
	public void showCal ( )
	{
		System.out.println("plus count is "+adder.addCount());
		System.out.println("sub count is "+sub1.subCount());
	}	
}

public class Adder
{
	private int addCnt;
	Adder ()
	{
		addCnt = 0;
	}
	int adderResult (int num1, int num2)
	{
		addCnt++;
		return num1+num2;
	}
	int addCount ( )
 	{
		return addCnt;
	}

}
public class Subtractor
{
	private int subCnt;
	Subtractor ()
	{
		subCnt = 0;
	}
	int subResult (int num1,int num2)
	{
		subCnt++;
		return num1-num2;		
	}
	int subCount ( )
 	{
		return subCnt;
	}
}