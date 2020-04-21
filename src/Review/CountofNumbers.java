package Review;
import java.util.Scanner;
public class CountofNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int divisibleBy = scanner.nextInt();
        int count=0;
        for(int i=start ; i<=end ; i++){
            if(i%divisibleBy==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
