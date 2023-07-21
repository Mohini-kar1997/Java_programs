package abstraction;
////concrete class provide def to all incomplete methods in abstract class
public class hdfc extends RBI_BANK {

	@Override
	public void creditcard() {
		System.out.println("hdfc-creditcard");
		
	}

	@Override
	public void debitcard() {
		System.out.println("hdfc--debitcard");
		
	} 
	public void funds() {
		System.out.println("hdfc--funds");
	}

	
}
