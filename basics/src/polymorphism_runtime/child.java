package polymorphism_runtime;

public class child extends father {

	public void bike() {
		System.out.println("bike---fz");
	}
	 public void car() {
		 System.out.println("car---suzuki"); //method overrided
	 }
	 
	 public void house() {
		 System.out.println("house---4bhk"); // method overrided
	 }
}
