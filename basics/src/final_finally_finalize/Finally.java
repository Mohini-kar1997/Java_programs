package final_finally_finalize;

public class Finally {

	public static void main(String[] args) {
		
		//Finally.div();
		Finally.test();
	}
	
	public static void test() {
		try {
			System.out.println("try block");
		}catch(Exception e) {
			System.out.println("catch block");
		}finally {
			System.out.println("finally block");
		}
	}
	
	public static void div() {
		int i=100;
		
		
		try {
			int k=100/0; //arithmatic exception
			System.out.println("try block");
		}catch(ArithmeticException e) {
			System.out.println("inside the catch block");
			System.out.println("devide by zero");
			
		}finally {
			System.out.println("executed finaly block");
		}
	}

}
