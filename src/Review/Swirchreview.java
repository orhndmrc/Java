package Review;
import java.util.Scanner;
public class Swirchreview {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put the season:");
        String season = input.next();
        switch(season){
            case "Spring":
                System.out.println("1st");

                break;
            case "Summer":
                System.out.println("2nd");
                break;
            case "Autumn":
                System.out.println("3rd");
                break;
            case "Winter":
                System.out.println("4th");
                break;
            default:
                System.out.println("Please enter a valid season ");

        }

    }
}
