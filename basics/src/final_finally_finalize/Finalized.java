package final_finally_finalize;

public class Finalized {

	public static void main(String[] args) {
		// finalize-method in java-used to perform cleanup processing just before object id garbage collected
		
		Finalized f=new Finalized ();
		f=null;
		System.gc();

	}
	
	public void demo() {
		System.out.println("demo method");
	}
	
	public void finalize() {
		System.out.println("finalized method executed");
	}

}
