package main_method;

public class test3 {

	public static void main(String[] args) {
		// void- wont return anythig
		demo1(); //hello, mohinipatil
		test3.addition("hi","hi");
		System.out.println(addition("hi","hi"));
		//System.out.println(addition(10,20));--because it is string we cannot pass int value
		//int test=addition(10,20); not possible
		String test=addition("heelo","world");
		System.out.println(test);
      
	}
	public static void demo1() {
		System.out.println("hello");
		System.out.println(addition("mohini","patil"));
	}
	public static String addition(String a, String b) {
		String sum=a+b;
		System.out.println(sum);
		return sum;
	}

}
