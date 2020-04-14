public class CastingOperation{

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 'z';
		int num1 = ch1;
		int num2 = (int)ch2;
		System.out.println("num1의 유니코드 : "+num1);
		System.out.println("num2의 유니코드 : "+num2);
	}

}
