package Feb_9th;
import java.util.Scanner;
public class CarExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type(X or Y)");
        String carType = scanner.next();
        int Msrp=30000;
        if(carType.equalsIgnoreCase("X")) {


            System.out.println("Do you want body package?(Y/N)");
            String body = scanner.next();
            if(body.equalsIgnoreCase("y")){
                System.out.println("Total price:"+(Msrp+5000));
        }
            else if(body.equalsIgnoreCase("n")){
            System.out.println("Total price:"+(Msrp+3000));
        }
        }
else if(carType.equalsIgnoreCase("Y")){
            System.out.println("Do you want entertainment package?(Y/N)");
            String entertainment = scanner.next();
            if(entertainment.equalsIgnoreCase("y")){
                System.out.println("Total price:"+(Msrp+8000));
            }
            else if(entertainment.equalsIgnoreCase("n")) {
                System.out.println("Total price:"+(Msrp + 4000));
            }

        }
else{
            System.out.println("Please select the type(X or Y)");

        }
    }
}
