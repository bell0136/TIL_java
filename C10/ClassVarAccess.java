class AccessWay
{
	static int num = 0;
	void AccessWay()
	{
		incrCnt();
	}
	public void incrCnt()
	{
		num++;
	//	System.out.println("here is "+ num);
		
	}
	
}
class ClassVarAccess
{
	public static void main(String[] args)
	{
		AccessWay way1 = new AccessWay();
		way1.num++;
		AccessWay.num++;
		System.out.println("num is : "+ AccessWay.num);

	}
}