package control_statements;

public class switch2 {

	public static void main(String[] args) {
		char ch='a';
		switch(ch) {
		case 'n':
			System.out.println("matched a");
			break;
		case 'b':
			System.out.println("matched b");
			break;
		case 'c':
			System.out.println("matched c");
			break;
		case 'd':
			System.out.println("matched d");
			break;
			default:System.out.println("no match");
		}

	}

}
