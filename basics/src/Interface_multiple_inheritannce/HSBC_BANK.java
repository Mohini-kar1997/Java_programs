package Interface_multiple_inheritannce;

public class HSBC_BANK implements RBI_BANK, US_BANK, BRAZIL_BANK  {

	@Override
	public void bikeloan() {
		System.out.println("hsbc--bikeloan");
		
	}

	@Override
	public void personal_loan() {
		System.out.println("hsbc--persoanal loan");
		
	}

	@Override
	public void mutualfunds() {
		System.out.println("hsbc--mutual funds");
		
	}

	@Override
	public void carloan() {
		System.out.println("hsbc--car loan");
		
	}

	@Override
	public void debitcard() {
		System.out.println("hsbc--debitcard");
		
	}

	@Override
	public void creditcard() {
		System.out.println("hsbc--creditcard");
		
	}

	@Override
	public void money_transfer() {
		System.out.println("hsbc--money transfer");
		
	}
	
	public void goldloan() {
		System.out.println("hsbc--gold loan");
	}
	public void homeloan() {
		System.out.println("hsbc--home loan");
	}

}
