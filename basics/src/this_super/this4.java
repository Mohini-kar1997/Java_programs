package this_super;

public class this4 {// to call parameterized constructor of own class
	this4(){
		this(12);
		
	}
	this4(int a){
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		this4 ref=new this4();

	}

}
