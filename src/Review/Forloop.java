package Review;
import java.util.Scanner;
public class Forloop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int factoriel =1;
        int number = scan.nextInt();
        for(int i =1;i<=number;i++){
             factoriel *=i;

        }
        System.out.println("Factoriel: "+ factoriel);
    }
}
