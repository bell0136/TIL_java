class AAA
{
	int num;
	public AAA(int Num)
	{
		num = Num;
		System.out.println("hereA is "+num);

	}
	public static void main(String[] args)
	{
		AAA Anum = new AAA(12);
		AAA Anum2 = new AAA(24);

		

	}
}
class BBB
{
	int num;
	public BBB(int Num)
	{
		num = Num;
		System.out.println("hereB is "+num);

	}
	public static void main(String[] args)
	{
		BBB Bnum = new BBB(10);
		BBB Bnum2 = new BBB(20);

	}
}