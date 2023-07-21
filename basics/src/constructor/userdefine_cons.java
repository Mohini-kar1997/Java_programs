package constructor;

public class userdefine_cons { 
	//user defined constructor without parameter
	int num1;
	int num2; // non static global variable
 
	
	public userdefine_cons() { //without parametr
		num1=10; // var initialization
		num2=20;
		int add=num1+num2;
		
		//use 
		System.out.println(add);
		
	}
	public userdefine_cons(int a, int b) {
		System.out.println("two parameter constructor");
		
		//System.out.println(a+b);
		num1=a;
		num2=b;
		int add=a+b;
		System.out.println(add);
		
	}
	public static void main(String[] args) {
		
		userdefine_cons u=new userdefine_cons();
		userdefine_cons u1=new userdefine_cons(2,3);
		
		
		u.addition();
	}
	
	public void addition() {
		
		int sum=num1+num2; //it will take values from constructor
		System.out.println(sum);
	}

}
