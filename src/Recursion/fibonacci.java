package Recursion;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number value : ");
        int n = scan.nextInt();// to show a fibonacci series until nth term
        for(int i =1; i<=n; i++) {//---> to show the fibonacci series
            String numberPostFix ="";
            switch(i){
                case 1:
                    numberPostFix = "st";
                    break;
                case 2:
                    numberPostFix = "nd";
                    break;
                case 3:
                    numberPostFix = "rd";
                    break;
                default:
                    numberPostFix = "th";
                    break;
            }
            System.out.println(i+numberPostFix+" term "+f(i));//---> to find a specific fibonacci number use sout(f(10)) for example
        }
    }
    public static int f(int n){
        if(n==1 || n==2) return 1; //or if(n<=1) return n;
        return f(n-1)+f(n-2);

    }
}
