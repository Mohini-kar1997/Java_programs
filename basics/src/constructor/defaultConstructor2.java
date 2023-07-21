package constructor;

public class defaultConstructor2 {
	
	public defaultConstructor2 (){
		super();
	}
	
	//rules-
	//always without argument
	// access modifiers are always same as class modifiers
	//contains only one line that is super() class/keyword
	
	//provide default values to the object
	

	public static void main(String[] args) {
		defaultConstructor2 d=new defaultConstructor2();
		defaultConstructor2 d1=new defaultConstructor2();
		d.m1();
		d1.m1();
		d.addition();
		d1.addition();

	}
	
	public void m1() {
		System.out.println("hello");
	}
	
	public void addition() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

}
