package constructor;

public class rule5 {
	
	//anu number of constructor we can declare within class
	//but parameters shoould be different and name should be same as class name
	
	public rule5() {
		System.out.println("hello");
	}
	
	public rule5(int i) {
		System.out.println("one input parameter constructor");
	}
	public rule5(int i, int j) {
		System.out.println("two input parameter constructor");
	}
	public rule5(int i, int j, int k) {
		System.out.println("three input parameter constructor");
	}

	public static void main(String[] args) {
		
		rule5 r=new rule5();
		rule5 r1=new rule5();
		rule5 r2=new rule5();
		rule5 r11=new rule5(2);
		rule5 r12=new rule5(2, 3);
		rule5 r123=new rule5(2, 3, 5);
		

	}

}
