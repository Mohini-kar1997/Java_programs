package exception_handling;

public class exception1 {

	public static void main(String[] args) {
		//unchecked exceptions- jvm
		System.out.println("good evevning");
		
		int num=100;
		//System.out.println(100/0); //ArithmeticException
		
		//System.out.println("good evening"); //this code will not be executed
		
		String str="mohini";
	//	Integer.parseInt(str); //NumberFormatException:
		
		String test=null;
	//	System.out.println(test.length()); //NullPointerException
		
	//	int arr[]=new int[-5]; //NegativeArraySizeException
		
		int arr[]=new int[2];
		
		arr[3]=122; //ArrayIndexOutOfBoundsException
		
		//exception handling- mechanism to handle runtime exception
		
		
		

	}

}
