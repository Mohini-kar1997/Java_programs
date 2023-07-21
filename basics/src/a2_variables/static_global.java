package a2_variables;

public class static_global {
	static int num=30; //static global variable ---always call it with classname.variablename
	static int num1=40;

	public static void main(String[] args) {
		System.out.println(num);//30
		demo();//30, 40
		static_global s=new static_global();
		s.demo1();//30 40
		System.out.println(static_global.num1);//40
		

	}
    public static void demo() {
    	System.out.println(num);
    	System.out.println(static_global.num1);
    	
    }
    public void demo1() {
    	System.out.println(num);
    	System.out.println(static_global.num1);
    	
    	
    }
}
