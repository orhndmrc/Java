package Review;
import java.util.Scanner;

public class fsdf {
    public static void main(String[] args) {
        // put your code here
         Scanner scanner = new Scanner(System.in);
         long num = scanner.nextLong();

        long fact = 1;
        long number = 1;

        while (fact < num){


            for (long i = 2L; i <= number; i++) {
                fact = fact * i ;
            }
            number++;
        }

        System.out.println(number);
    }
}



