public class SimpleJavaProgram{


	public static void main(String[] args) {
		
		System.out.println("One"/*One is 1*/);  //주석처리됨
		System.out.println("Two/*Two is 2*/"); //주석안됨
		System.out.println("Three"); 

		/*
		//System.out.println("2"); //주석처리됨
		System.out.println("2");
		*/

		/*
		/*System.out.println("2");*/ //에러발생!
		System.out.println("2");
		*/
	}

}
