class AccessWay
{
	static int num = 0;
	AccessWay()
	{
		incrCnt();
	}
	public void incrCnt()
	{
		num++;		
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