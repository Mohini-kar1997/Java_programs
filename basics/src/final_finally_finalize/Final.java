package final_finally_finalize;

public class Final {

	public static void main(String[] args) {
		//final=keyword and access modifier used to restrict variables,methods,class
		//final class can not be inherited to child class
		//final methods connot be overried in sublass
		// a variable declared as final cannot be modified
		
		
		int num=10;
		System.out.println(num); //10
		
		num=20;
		System.out.println(num);//20
		
		final int number=12;
		System.out.println(number);
		
	//	number=13; error

	}
	
	

}
