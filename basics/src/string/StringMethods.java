package string;

public class StringMethods {
	public static void main(String[] args) {
		//1. charAt method/function=return char values for the particular/specified index
		
		String s1="velocity";
		System.out.println("index--->" +s1.charAt(5));
		System.out.println("index--->" +s1.charAt(2));
		//System.out.println("index--->" +s1.charAt(15));=StringIndexOutOfBoundsException
		//System.out.println("index--->" +s1.charAt(-1));=StringIndexOutOfBoundsException
		
		
		//2. length()= returns length
		System.out.println(s1.length()); //8
		
		//3. eqals=check the eqality of string with given objcet
		
		String s2="velocity";
		String s3="velocity";
		String s4=new String("velocity"); 
		
		
		System.out.println(s2.equals(s3));//true
		System.out.println(s2.equals(s4));//true
		
		
		//4. isempty- check wheather string is empty or not 
		String s5="automation";
		System.out.println(s5.isEmpty()); // false
		String s6=" ";
		System.out.println(s6.isEmpty());//false--space is there
		String s7="";
		System.out.println(s7.isEmpty()); //true
		
	}

}
