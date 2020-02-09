package Feb_9th;
import java.util.Scanner;
public class NestedIfExample_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you subscribed?(Y/N)");
        String Subscription = scanner.nextLine();

        if(Subscription.compareToIgnoreCase("Y")==0){
            System.out.println("Enter usage:");
            int usage = scanner.nextInt();
            if(usage>=0 && usage<100){
                System.out.println("$10");
            }
            else if(usage>=100){
                System.out.println("$40");
            }
            else{
                System.out.println("not valid usage");
            }
        }
        else{
            System.out.println("Please visit subscription page");
        }
    }
}
