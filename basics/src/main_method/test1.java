package main_method;

public class test1 {// class body

	public static void main(String[] args) {//main method body
		
		//public-access modifier-call by jvm from anywhere
		// static--class level method not related to object
		/* test1 t=new test1();
		 * t.main();-----not allowed
		 * */
		//void-doesnot have return type
		//main-method name(name configured in jvm)
		//(String[] args--String array/command line arguments
		
		System.out.println("hello");// printing statement 
	


	}
	public static void Main(String[] args) {
		
		System.out.println("juat another method not main method because capital M");
	}

}
