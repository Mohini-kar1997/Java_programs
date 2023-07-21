package polymorphism_compiletime;

public class method_overload2 {

	public static void main(String[] args) {
		method_overload2 m1=new method_overload2() ;
		m1.addition(3, 40);
		m1.addition(1, 1, 1);
		method_overload2.demo("mohini");
		method_overload2.demo(5, 5.5f);

	}
	
	public void addition(int i, int j) { //non static overloading
		System.out.println(i+j);
	}
	
	public void addition(int i, int j, int k) { // non static overloading
		System.out.println(i*j*k);
	}
	
	public static void demo(String name) { // static overloading
		System.out.println("name is--"+name);
	}
	public static void demo(int k, float f) { // static overloading
		System.out.println(k+f);
	}
   
}
