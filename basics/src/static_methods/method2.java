package static_methods;

public class method2 {

	public static void main(String[] args) {
		//method without parameter
		method2 m=new method2();
		m.addition();
		//m.addition2(); // we can access static method through object but it will show warning message that it should be accessed in static way
		method2.addition2();

	}
	public void addition() { //non static
		int a=20;
		int b=20;
		int c=a+b;
	System.out.println(c); //40
	}
	public static void addition2() { //static
		int a=10;
		int b=20;
		int c=a+b;
	System.out.println(c); //30
	}

}
