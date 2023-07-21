package this_super;

public class this3 {//to call the default constructor of same class
	
	this3(){
		System.out.println("learn coding");
	}
	this3(int a){
		this();
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		this3 ref=new this3();
		this3 ref1=new this3(12);

	}

}
