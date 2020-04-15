class BitOpUst
{
	public static void main (String[] args)
	{
		byte n1 = 45;
		byte  n2 = 60;
		int n3 =n1 & n2; //자료형이 byte였지만 연산과정을 거치면서 int형으로 변환
		System.out.println(n3);
	} 
}