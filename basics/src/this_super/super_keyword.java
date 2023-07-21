package this_super;

// superkeyword -- to acess global variable from different class /super class

public class super_keyword extends super_key {
	

	public static void main(String[] args) {
		int num=10;
		System.out.println(num);
	//	System.out.println(super.num); -- cannot use in static method
		super_keyword a=new super_keyword ();
		a.demo();
		

	}
	
	public void demo() {
		int num=80;
		int number=90;
		System.out.println(num);//80
		System.out.println(number);//90
		System.out.println(super.num);//30
		System.out.println(super.number); //60
		
	}

}
