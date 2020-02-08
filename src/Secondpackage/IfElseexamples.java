package Secondpackage;
import java.util.Scanner;
public class IfElseexamples {
    public static void main(String[] args) {
        Scanner myKeyword = new Scanner(System.in);

       /* int year = 2019;
        if(year>1999){
            System.out.println("After Milenium");
        }
        else{
            System.out.println("Before milenium");
        } */
        System.out.println("Enter a number:");
int num = myKeyword.nextInt();
        if(num%2==1){
            System.out.println(num+" is odd");
        }
        else{
            System.out.println( num +" is even");}
            System.out.println("Put the temperature: ");
            short temp = myKeyword.nextShort();
            if(temp<=30){
                System.out.println("Wear a jacket");
            }
            else{
                System.out.println("Wear a hat");
            }
        }
    }

