package March_14th;

public class BankAccount_Test {
    public static void main(String[] args) {
        BankAccount myAccount= new BankAccount("Chase", 1000,123456789);
        System.out.println(myAccount.AccountName+" "+myAccount.AccountBalance+" "+myAccount.AccountNumber);
        myAccount.AddMoney(500);
        myAccount.DrawMoney(250);
        myAccount.CheckBalance();
    }
}
