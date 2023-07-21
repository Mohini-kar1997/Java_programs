package non_static_methods;

public class non_static_diff1 {

	public static void main(String[] args) {
		nonstatic_differe n=new nonstatic_differe();
		n.demo();
		n.demo1();// object of that class in which methods are present
		// by that classname is not possible
		
		
		
		System.out.println();
		 non_static_diff1 n1=new  non_static_diff1 ();
		 n1.demo2();
		

	}
   public void demo2() {
	   System.out.println("demo2");
   }
}
