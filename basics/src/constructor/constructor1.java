package constructor;

public class constructor1 {
	int a;
	String name;
	boolean b;
	
	public constructor1 () {
		a=12;
		name=null;
		}
	
	
	void show() {
		System.out.println(a+" "+name+" "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructor1 c=new constructor1();
		c.show();

	}

}
