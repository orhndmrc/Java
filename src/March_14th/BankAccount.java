package March_14th;

public class BankAccount {
    String AccountName;
    int AccountBalance;
    int AccountNumber;
    public BankAccount(String name, int balance, int number){
         AccountName=name;
         AccountBalance=balance;
        AccountNumber=number;
    }

    public void AddMoney(int a){
        AccountBalance+=a;
        System.out.println( AccountBalance);
    }
    public void DrawMoney(int b){
        AccountBalance-=b;
        System.out.println( AccountBalance);
    }
    public void CheckBalance(){
        System.out.println(AccountBalance);
    }

}
