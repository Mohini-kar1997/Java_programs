package static_methods;

public class method1 {

	public static void main(String[] args) {
		// by direct calling
		demo1();
		demo2();
		demo3();
		
		// by classnae
		 method1.demo1();
		 method1.demo2();
		 method1.demo3();

	}
	public static void demo1() {
		System.out.println("demo1");
	}
	public static void demo2() {
		System.out.println("demo1");
	}
	public static void demo3() {
		int a=10;
		int b=10;
		int sum=a+b;
		System.out.println(sum);
	}
}
