package this_super;

public class this_keyword {
	int number=20;// non static global variable
	static int num=40;// static global
	//this--global variable from the same class

	public static void main(String[] args) {
		int number=30; // local variable
		int num=60; // local variable
		System.out.println(number); //30
		System.out.println(num); //60
		this_keyword t=new this_keyword();
		t.demo();
		

	} 
	public void demo() {
		int number=30; // local variable
		int num=60; // local variable
		System.out.println(number); //30
		System.out.println(this.number);//20
		System.out.println(this.num); //40
		System.out.println(this_keyword.num); //40
		
	}
	public static void demo1() {
		// System.out.println(this.number); ---this keyword is not used in static
	}

}
