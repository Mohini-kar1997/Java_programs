package static_methods;

public class method3 {

	public static void main(String[] args) {
		//method with parameters
		method3.additon(12, 12);//through classname
		method3.additon(13, 12);
		additon(14,14); //direct calling
		substraction(10,5);
	method3.substraction(4, 4);
	
	method3 m=new method3();
	m.multi(3, 3);

	}
	public static void additon(int a, int b) { // static with parameters
		int c=a+b;
		System.out.println(c);
		
	}
	public static void substraction(int a, int b) {
		int c=a-b;
		System.out.println(c);
	}
	public void multi(int a, int b) {
		int c=a*b;
		System.out.println(c);;
	}

}
