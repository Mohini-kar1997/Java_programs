package casting;

public class casting4 extends casting3 { //child class
	public void demo3() {
		System.out.println("demo3---method");
	}
  public static void main(String[] args) {
	casting4 c4=new casting4();//child class object and child class reference variable
	c4.demo1(); //static binding+ctp+early binding
	c4.demo2();
	c4.demo3();
	
	System.out.println();
	
	//upcasting
	casting3 c3=new casting4();//parent class reference variable and child class object
	// upcasting+top casting+dynamicpoly+rtp+late binding
	c3.demo1();
	c3.demo2();// only parent class methods
	System.out.println();
	
	//downcasting
	
	casting4 c41=(casting4) new casting3(); //ClassCastException
	c41.demo1();
	c41.demo2();
	c41.demo3();
}
}
