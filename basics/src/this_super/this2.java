package this_super;

public class this2 { //whenever instance and local variable name is same
	//to point to the instance variable
	int a; //instance/global variable
	public this2(int a) {  //local variable
		this.a=a;
		
	}
	void show() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		this2 ref=new this2(123);
		ref.show();

	}

}
