package a2_variables;

public class non_static_global {
	
	// non static variable calling is always with object
	int num=30; // non static global variable
	int num1=40;

	public static void main(String[] args) { // cant call non static variable to static method
		 non_static_global obj=new  non_static_global();
		System.out.println(obj.num);
		demo();
		obj.demo1();
	

	}
    public static void demo() {
    	 non_static_global obj=new  non_static_global();
    	System.out.println(obj.num);
    }
    public void demo1() {
    	non_static_global obj=new  non_static_global();
    	System.out.println(obj.num);
    	System.out.println(num1);// non_static to non_static direct all
    }
}
