package Review;
import java.util.Scanner;

public class RoomsSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please choose roomtype : ");
        String roomType = scanner.nextLine();

        switch (roomType) {
            case "triangle":
                System.out.print("Please enter side1 : ");
                double a = scanner.nextDouble();
                System.out.print("Please enter side2 : ");
                double b = scanner.nextDouble();
                System.out.print("Please enter side3 : ");
                double c = scanner.nextDouble();

                double u = (a+b+c)/2;
                System.out.println((Math.sqrt(u*(u-a)*(u-b)*(u-c))));
                break;
            case "rectangle":
                System.out.print("Please enter side1 : ");
                double d = scanner.nextDouble();
                System.out.print("Please enter side2 : ");
                double e = scanner.nextDouble();

            System.out.println(d*e);
            break;
            case "circle":
                System.out.print("Please enter radius : ");
                double r = scanner.nextDouble();
            System.out.println((3.14*r*r));
            break;
            default:
        }
    }

}
