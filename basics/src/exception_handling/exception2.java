package exception_handling;

public class exception2 {

	public static void main(String[] args) {
		System.out.println("automation");
		
		int num=10;
	try {
		System.out.println(num/0);
		}
	catch(ArithmeticException e) {
		System.out.println("hello");
		System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		//finally- used to write important code wheteher exception is handled or not
		
		finally {
			System.out.println("this is finally block");
		}

	}

}
