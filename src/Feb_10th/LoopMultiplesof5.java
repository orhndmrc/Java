package Feb_10th;
import java.util.Scanner;
public class LoopMultiplesof5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter start number  :");
        int start = scanner.nextInt();
        System.out.println("Please enter end number  :");
        int end = scanner.nextInt();
        if(start<end){
            for(int i =start ; i<=end ; i=i+5){
                System.out.println(i);
            }
        }
        else{
            for(int i =start ; i>=start ; i=i-5){
                System.out.println(i);
            }

        }
    }
}
