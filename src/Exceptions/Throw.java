package Exceptions;

public class Throw {
    public static void main(String[] args) {
        int age= 30;
        if (age<21){
            throw new ArithmeticException("Under 20");

            }

        else{
            System.out.println("it is okay");
        }
    }
}
