package Firstpackage;
import java.util.Scanner;
public class ExampleKeyboard3 {
    public static void main(String args[]){
        Scanner theArea = new Scanner(System.in);
        int length;
        int width;
        System.out.println("The length= ");
        length= theArea.nextInt();
        System.out.println("The width");
        width = theArea.nextInt();

        System.out.println("The area="+length*width);


    }
}
