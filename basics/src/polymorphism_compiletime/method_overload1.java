package polymorphism_compiletime;

public class method_overload1 {

	public static void main(String[] args) {
		method_overload1 m1=new method_overload1();
		m1.demo1();
		m1.demo1(2);
		m1.demo1(24,4);
		m1.demo1(4, 50, 60);
		m1.demo1("heelo");

	}
	public void demo1() { //overloading non static methods
		System.out.println("no argument method");
	}
	public void demo1(int i, int j) {
		System.out.println("two argument method");
	}
	public void demo1(String h) {
		System.out.println("string argument method");
	}
	public void demo1(int i, int j, int k) {
		System.out.println("three argument method");
	}
	public void demo1(int k) {
		System.out.println("one argument method");
	}


}
