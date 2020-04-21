package Review;
import java.util.Scanner;
public class ProductOfAllIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long product=1;
        for(long  i=a ; i<b ; i++){
            product*=i;
        }
        System.out.println((long)product);
    }
}
