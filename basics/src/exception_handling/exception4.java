package exception_handling;

public class exception4 {

	public static void main(String[] args) {
		int a[]=new int[2];
		try {
		System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println(b.getMessage());
			b.printStackTrace();
		}
		finally {
			System.out.println("finally executed");
		}
	}

}
