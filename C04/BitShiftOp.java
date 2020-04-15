class BitShiftOp
{
	public static void main(String[] args)
	{
		System.out.println(4 << 1); //8
		System.out.println(2 << 3); //16
		System.out.println(16 >> 3); //2
		System.out.println(-8 >> 2); //-2
		System.out.println(5 >> 2); //0000 0101 -> 0000 0001
		System.out.println(5 << 2); //0000 0101 -> 0001 0100 20
		System.out.println(5 >>> 2); //0000 0101 ->0000 0001 1
	}
}