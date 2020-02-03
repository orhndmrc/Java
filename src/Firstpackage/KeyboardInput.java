package Firstpackage;
import java.util.Scanner;
public class KeyboardInput {
    public static void main(String args[]){
        Scanner myKeyword = new Scanner(System.in);
        /*int userInput = ;
        userInput=myKeyword.nextInt();
        System.out.println(userInput);*/
        int side1;
        int side2;
        int side3;
        side1 = myKeyword.nextInt();
         side2 = myKeyword.nextInt();
         side3 = myKeyword.nextInt();
        System.out.print("Triangle Perimeter= ");
        System.out.println(side1+side2+side3);
    }
}
