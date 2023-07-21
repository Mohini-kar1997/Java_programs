package control_statements;

public class nested_if {

	public static void main(String[] args) {
		String un="abz";
		String password="xyz";
		
		if(un=="abc") {
			System.out.println("correct un");
			if(password=="xyz") {
				System.out.println("correct password");
				System.out.println("login successfull");
			}
			else {
				System.out.println("incorrect password");
				System.out.println("correct un");
			}
		}
		else {
			System.out.println("incorrect un");
			System.out.println("login failed");
		}

	}

}
