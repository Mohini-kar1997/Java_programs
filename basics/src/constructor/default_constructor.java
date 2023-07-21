package constructor;

public class default_constructor {
	
	String Name; //global variable
	int rollNo; // global variable
	
	public default_constructor() {
		System.out.println("default constructor");
		System.out.println(Name);
	}

	public static void main(String[] args) {
		
		default_constructor d=new default_constructor();
		default_constructor d1=new default_constructor();
		default_constructor d2=new default_constructor();
		d.method();

	}
	
	public void method() {
		System.out.println(Name);
	}

}
