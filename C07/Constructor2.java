class Number
{
	int num = 10;
	public Number (int n)
	{
		System.out.println("생성자 호출");
		System.out.println("현재 인자"+(num+n));		
		//빠져나오면 num은 소멸
	}
	public int getNumber ()
	{
		return num;
	}
}
class Constructor2
{
	public static void main(String[] args)
	{
		Number num1 = new Number(10);
		System.out.println("반환값 :"+ num1.getNumber());
		Number num2 = new Number(20);
		System.out.println("반환값 :"+ num2.getNumber());
	}
}