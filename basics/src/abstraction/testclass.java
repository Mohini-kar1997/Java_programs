package abstraction;

public class testclass {

	public static void main(String[] args) {
		hdfc h=new hdfc();
		h.funds();
		h.creditcard();
		h.debitcard();
		h.loan();
		
		System.out.println();
		
		RBI_BANK rb=new hdfc();
		rb.loan();
		rb.creditcard();
		rb.debitcard();
		

	}

}
