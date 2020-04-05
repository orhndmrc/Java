package Exceptions;
import java.util.Scanner;
public class DivideTwoNumbers {
    public static void main(String[] args) {
        divide();
    }
    public static void divide(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first=scan.nextInt();
        System.out.println("Enter the second number: ");
        int second=scan.nextInt();
        try {
            System.out.println(first / second);
        }
        catch(Exception e){
            System.out.println("We can not do that");

        }
    }
}
