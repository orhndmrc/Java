package Secondpackage;

import java.util.Scanner;
public class Lessonelseif {
    public static void main(String[] args) {


        Scanner checkAge = new Scanner(System.in);
        /* if(condition 1){
        // block of code to be executed if the condition is true
        }
           else if(condition 2){
            //block of code to be executed if the condition1 is false and condition 2 is true
            }
            else{
             //block of code to be executed if the condition 1 and2  are false
            }
         */
        System.out.println("Enter age:");
        int age = checkAge.nextInt();
        if (age < 0) {
            System.out.println("Age can not be negative");

        }
        else if(age>120){
            System.out.println("Age can not be larger than 120");
        }
        else{
            System.out.println("Valid age");
        }
    }
}
