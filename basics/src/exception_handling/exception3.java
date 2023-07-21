package exception_handling;

public class exception3 {

	public static void main(String[] args) {
		System.out.println("program started");
		
		String name=null;
		
		try {
		System.out.println(name.length());
		}
		//we can add multiple catch blocks it will choose approriate one
		catch(ArithmeticException r1) {
			System.out.println(r1.getMessage());
			r1.printStackTrace();
		}
		catch(NullPointerException r) {
			System.out.println(r.getMessage());
			r.printStackTrace();
		}
		
		System.out.println("program completed");

	}

}
