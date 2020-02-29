package Review;
import java.util.Scanner;
public class ATMproject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = 1000;
        String transactions = "1. Transaction : Getting Balance Info\n"
                              +"2. Transaction : Withdrawal\n"
                              +"3.Transaction : Deposit\n"
                              +"4. Transaction : Exit";
        System.out.println("************************************************");
        System.out.println(transactions);
        System.out.println("************************************************");
        while(true){
            System.out.println("Choose the transaction: ");
            String transaction = scan.nextLine();
            if(transaction.equals("q")) {
                System.out.println("Exit");
                break;
            }
                else if(transaction.equals("1")){
                System.out.println("Your balance : "+balance);
                }
            else if(transaction.equals("2")){
                System.out.println("Withdrawal amount :");
                int withdrawal = scan.nextInt();
                scan.nextLine();
                if(balance-withdrawal<0){
                    System.out.println("Insufficient balance"+balance);
                }
                else{
                    balance -=withdrawal;
                    System.out.println("New balance: "+balance);
                }
            }
            else if(transaction.equals("3")){
                System.out.println("Amount of many you want to deposit:  ");
                    int deposit = scan.nextInt();
                     scan.nextLine();
                balance += deposit;
                System.out.println("New balance : "+balance );
            }
            else{
                System.out.println("Not a valid transaction");
            }

        }
    }
}
