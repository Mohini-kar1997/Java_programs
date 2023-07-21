package polymorphism_compiletime;

public class main_method_overload {

	public static void main(String[] args) {
		main_method_overload m1=new main_method_overload();
		m1.demo1(); // calling non static through object
		m1.demo2();
		
		main_method_overload.main('a');
		int arr[]= {13};
		main_method_overload.main(arr); // calling static through classname
		

	}
public static void main(int[] args) {
	main_method_overload m1=new main_method_overload(); // static overload
	m1.demo1();
	m1.demo2();
		

	}
public static void main(char args) { // static overload
	main_method_overload m1=new main_method_overload();
	m1.demo1();
	m1.demo2();
	

}
public void demo1() {
	System.out.println("demo1 method");// 1 non static
}
public void demo2() {  // 2 non static
	System.out.println("demo2 method");
}

}
