package Feb_9th;
import java.util.Scanner;
public class Review {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the size");
        String size = scanner.next();
        if(size.equals("S")){
            System.out.println("Price $9.99");
        }
        else if(size.compareToIgnoreCase("M")==0){    //size.compareToIgnoreCase("M")==0---->size.equals("M") but the first one ignores upper and lower case letters
            System.out.println("Price $10.99");
        }
        else if(size.equals("L")){
            System.out.println("Price $11.99");
        }
        else{
            System.out.println("Sorry only S/M/L");
        }
    }
}
