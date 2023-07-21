package a2_variables;

public class local_variable {

	public static void main(String[] args) {
		demo();
		//System.out.println(a); -- a is local variable can not access out side function demo
	

	}
	public static void demo() {
		int a=20; //local variable---can not access outside the method or block or function
		System.out.println(a);
	}

}
