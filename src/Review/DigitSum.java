package Review;
import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int x =scan.nextInt();
        int sum=0;
        do{

           sum +=x % 10;
           x=x / 10;
            System.out.println(x);

        }while(x>0);
        System.out.println("The sum of the digits: "+sum);


    }
}