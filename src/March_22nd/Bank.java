package March_22nd;

public class Bank {
    protected int AccountNum;
    protected String AccountName;
    protected double Balance;

    public Bank(int accountNum, String accountName, double balance) {
       this. AccountNum = accountNum;
      this.  AccountName = accountName;
        this.Balance = balance;
    }
    public void AddMoney(int amount1){
        this.Balance +=amount1;
    }
    public void DrawMoney(int amount2){

        if(amount2<this.Balance){
            this.Balance -=amount2;
        }
        else{
            System.out.println("Balance is not enough for this amount");
        }
    }
    public void ChangeAccountName(String newAccount){
this.AccountName=newAccount;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "AccountNum=" + AccountNum +
                ", AccountName='" + AccountName + '\'' +
                ", Balance=" + Balance +
                '}';
    }
}
