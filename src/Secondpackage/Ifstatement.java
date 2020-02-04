package Secondpackage;
import java.util.Scanner;
public class Ifstatement {
    public static void main(String args[]){
        Scanner MyKeyword= new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = MyKeyword.nextInt();
        int remainder = number%2;
        if(remainder==1){
            System.out.println("odd");
        }
    }
}
