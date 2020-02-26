package Review;
import java.util.Scanner;
public class Methods {
    public static void Enter(){
        System.out.println("Hello World");
    }
    public static void factoriyel(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scan.nextInt();
        int factoriyel =1;
        while(number>0){
            factoriyel *=number;
            number--;
        }
        System.out.println("Factoriyel "+ factoriyel);
    }
    public static void main(String[] args) {
        Enter();
        factoriyel();
    }
}
