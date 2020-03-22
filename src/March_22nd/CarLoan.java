package March_22nd;

public class CarLoan extends Loan {
    private double APR;
    private int creditScore;

    public CarLoan(int accountNum, String accountName, double balance, double interestRate, int numberOfPayment, double loanAmount, double APR, int creditScore) {
        super(accountNum, accountName, balance, interestRate, numberOfPayment, loanAmount);
        this.APR = APR;
        this.creditScore = creditScore;
    }
    public double calculateMonthlyPayment(){
        double monthly=super.loanAmount*this.APR/super.numberOfPayment-(this.creditScore/10);

        return monthly;
    }
}
