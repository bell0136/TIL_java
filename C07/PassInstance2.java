class Number
{
	int num;
	int total;

	public void addNum(int num)
	{
		total+=num;		
	}
	public int result()
	{		
		return total;
	}
}
class PassInstance2
{
	public static void main(String[] args)	
	{
		Number nInst = new Number();
		System.out.println("메소드 호출 전의 함수 : "+nInst.result());
		nInst.addNum(12);
		//simple(nInst);
		System.out.println("메소드 호출 후의 함수 : "+nInst.result());
	}
	
}