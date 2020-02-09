package Feb_9th;
import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter month number:");
        /* int --- = ---;
        switch(-----){          ------->instead of we use "if" statement, use switch statement which is shortcut
        case1 :
        break;
        case 2:
        break;
        case 3:
        break;
        default:
        break;
        }
                        */
        int Months = scanner.nextInt();
        switch(Months){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Only 1-12");
                break;
        }
    }
}
