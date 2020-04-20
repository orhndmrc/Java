package Review;
import java.util.Scanner;
import java.util.Arrays;
public class fsdf {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
String s = str.substring(num1,num2+1);
        System.out.println(s);
    }
}