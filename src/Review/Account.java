package Review;

public class Account {
    private String username;
    private String password;
    private int balance;

    public Account(String username, String password, int balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {

        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
        System.out.println(this.balance);
    }
    public void Withdrawal(int amount){
        this.balance-=amount;
        if(balance-amount<0){
            System.out.println("No enough money ");
        }
        else{

            System.out.println("New balance "+this.balance);
        }


    }
    public void Deposit(int amount1){
        this.balance+=amount1;
        System.out.println("New balance "+this.balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}

