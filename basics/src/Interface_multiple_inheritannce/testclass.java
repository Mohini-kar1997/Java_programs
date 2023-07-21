package Interface_multiple_inheritannce;

public class testclass {

	public static void main(String[] args) {
		HSBC_BANK h=new HSBC_BANK();
		h.homeloan();
		h.goldloan();// its own
		System.out.println();
		h.creditcard();
		h.debitcard();
		h.money_transfer();//rbi
		System.out.println();
		h.mutualfunds();
		h.carloan();//us
		System.out.println();
		h.bikeloan();
		h.personal_loan();
		System.out.println(h.min_balance);
		
		RBI_BANK r=new HSBC_BANK();
		r.creditcard();
		r.debitcard();
		r.money_transfer();
		
		BRAZIL_BANK b=new HSBC_BANK();
		b.bikeloan();
		b.personal_loan();
		
		US_BANK u=new HSBC_BANK()
;
		u.carloan();
		u.mutualfunds();

	}

}
