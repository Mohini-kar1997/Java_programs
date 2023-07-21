package string;

public class string1 {

	public static void main(String[] args) {
		//syntax= String abc="values";----by using string literal
		
		String str1="mohini";  //scp
		String str2="mohini";//scp
		
		System.out.println(str1); //mohini
		
		
		// by using new keyword---String str=new String("values");
		
		String str3=new String("isha");
		String str4=new String("isha");
		String str5=new String("mohini"); //heap
		
		System.out.println(str4);//isha
		
		System.out.println(str1==str2);//true
		System.out.println(str3==str4);//false
		System.out.println(str1==str5);//false

	}

}
