package Review;

public class BankAccount {
}
class SavingsAccount extends BankAccount{
   private double interestRate;

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }
}