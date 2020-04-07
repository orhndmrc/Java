package Exceptions;

public class Throws {
    public static void main(String[] args) {

    }
    public static void checkAge(int age) throws ArithmeticException{
        if(age<21){
            throw new ArithmeticException("Under 21");
        }
    }
}
