package Review;
import java.util.Scanner;
public class DicivisibleByFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int num = scanner.nextInt();
        int x=scanner.nextInt();
        int max=0;
        for(int i=1; i<13; i++){

            if(x%4==0) {
                if(x>max){
                    max=x;
                }

            }
            x=scanner.nextInt();
        }
        System.out.println(max);
    }
}
