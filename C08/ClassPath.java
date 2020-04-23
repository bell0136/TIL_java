class AAA
	{
		public void printName()
		{
			System.out.println("here is AAA");
		}
	}
class BBB
	{
		public void printName()
		{
			System.out.println("here is BBB");
		}
	}
class ClassPath
	{
		public static void main(String[] args)
		{
			AAA aaa = new AAA();
			aaa.printName();
			BBB bbb = new BBB();
			bbb.printName();
		}
	}