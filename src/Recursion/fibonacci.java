package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        for(int i =1; i<=10; i++) {//---> to show the fibonacci series
            System.out.println(f(i));//---> to find a specific fibonacci number use sout(f(10)) for example
        }
    }
    public static int f(int n){
        if(n==1 || n==2) return 1; //or if(n<=1) return n;
        return f(n-1)+f(n-2);

    }
}
