package non_static_methods;

public class method1 {

	public static void main(String[] args) {
		
		method1 m=new method1(); // copy of all the non static methods will be stored in object
		m.demo();
		m.demo1(); // by creating an object
		//direct calling is not possible
		//by classname calling is not possible
		// can i access static method by creating an object ?/---yes
		// but it will throw warning message---should be accessed in static way

	}
	public void demo() {
		System.out.println("demo");
	}
	public void demo1() {
		System.out.println("demo1");
	}

}
