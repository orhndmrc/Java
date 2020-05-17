package March_22nd;

public class Loan  extends Bank{
    double interestRate;
    int numberOfPayment;
    double loanAmount;

    public Loan (int accountNum, String accountName, double balance, double interestRate, int numberOfPayment, double loanAmount  ){
        super( accountNum, accountName,  balance);
        this.interestRate = interestRate;
        this.numberOfPayment = numberOfPayment;
        this.loanAmount = loanAmount;
    }
   public double calculateMonthlyPayment(){
        double monthly= this.loanAmount*this.interestRate/this. numberOfPayment;
        return monthly;
   }
    public double  calculateTotalPayment(){
        double total=this.loanAmount*this.interestRate;
        return total;

    }
}
