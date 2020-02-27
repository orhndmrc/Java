package Review;
import java.util.Scanner;
public class Basicalculator_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("**********************");
        String operators="1.Sum\n"
                         +"2.Subtraction\n"
                         +"3.Multiplication\n"
                         +"4.Divison";
        System.out.println(operators);
        System.out.println("************************");
        System.out.println("Choose the operation");
        String operator =scan.nextLine();
        int a;
        int b;
        switch(operator){
            case "1":
                System.out.print("First number ");
                 a=scan.nextInt();
                System.out.print("Second number ");
                b=scan.nextInt();
                System.out.println(a+b);
                break;
            case "2":
                System.out.print("First number ");
                a=scan.nextInt();
                System.out.print("Second number ");
                b=scan.nextInt();
                System.out.println(a-b);
                break;
            case "3":
                System.out.print("First number ");
                a=scan.nextInt();
                System.out.print("Second number ");
                b=scan.nextInt();
                System.out.println(a*b);
                break;case "4":
                System.out.print("First number ");
                a=scan.nextInt();
                System.out.print("Second number ");
                b=scan.nextInt();
                System.out.println((double)a/b);
                break;
            default:
                System.out.println("N/A");
                break;
        }
    }
}
