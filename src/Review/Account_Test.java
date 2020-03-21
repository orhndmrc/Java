package Review;

public class Account_Test {
    public static void main(String[] args) {
        Account myaccount= new Account("orhndmrc","12345",1000);
        System.out.println(myaccount.toString());
        myaccount.getBalance();
        myaccount.setBalance(1000);


        myaccount.Withdrawal(500);
        myaccount.Deposit(300);

        System.out.println(myaccount.getBalance());

    }
}
