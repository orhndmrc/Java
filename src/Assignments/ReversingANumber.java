package Assignments;
import java.util.Scanner;
public class ReversingANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer num1 = new StringBuffer(scanner.next());
        System.out.println(num1.reverse());
    }
}
