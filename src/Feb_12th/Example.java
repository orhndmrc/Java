package Feb_12th;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 5;
        int input=0;
        //Asking user until user guesses the number
        while (input!=a) {

            System.out.println("Guess that number:");
             input = scanner.nextInt();
            if (input > a) {
                System.out.println("Larger try again");
            } else if (input < a) {
                System.out.println("Smaller try again");
            } else {

                System.out.println("Congratulations");

            }

        }
    }
}