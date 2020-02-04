package Firstpackage;
import java.util.Scanner;
public class ExampleKeyboard4 {
    public static void main(String args[]){
        Scanner myKeyword = new Scanner(System.in);
        float radius;
        float pi;
        System.out.println("the radius is = ");
        radius = myKeyword.nextFloat();
        System.out.println("pi =\t");
        pi = myKeyword.nextFloat();

        System.out.println("the area of circle =\t"+(pi*radius*radius));


    }
}
