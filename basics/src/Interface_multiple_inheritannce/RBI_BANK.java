package Interface_multiple_inheritannce;

public interface RBI_BANK {
  int min_balance=1000; // static and final
  
  public void debitcard();
  public void creditcard();
  public void money_transfer();
}
