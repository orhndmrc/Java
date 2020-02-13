package Feb_12th;
import
        java.util.Scanner;
public class NestedLoop_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter start num:");
            int start= scanner.nextInt();
            System.out.println("Enter end num:");
            int end= scanner.nextInt();
            System.out.println("Enter what you want to print:");
            String toPrint = scanner.nextLine();
        for(int i =start; i<end;i++){
            System.out.println(toPrint);
        }

    }
}
