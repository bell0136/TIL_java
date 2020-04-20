class Number
{
	int num = 10;
	public Number ()
	{
		System.out.println("생성자 호출");
	}
	public int getNumber ()
	{
		return num;
	}
}
class Constructor1
{
	public static void main(String[] args)
	{
		Number num1 = new Number();
		System.out.println("반환값 :"+ num1.getNumber());
		Number num2 = new Number();
		System.out.println("반환값 :"+ num2.getNumber());
	}
}