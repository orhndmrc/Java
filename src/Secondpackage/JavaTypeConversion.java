package Secondpackage;

public class JavaTypeConversion {
    public static void main(String args[]){
        //Implicit Casting---->Widening   num2(integer number) = num1(byte number)
        byte number1 = 99;
        int number2 = 120;
        number2 = number1;
        System.out.println(number2);
// Explicit Casting--->Narrowing    Num2(short number)=(short)Num2(double number)
double Num1 = 456.7;
short Num2 = 23;
Num2 = (short)Num1;
System.out.println(Num2);

int myInt = 99;
System.out.println((char)myInt);






    }
}
