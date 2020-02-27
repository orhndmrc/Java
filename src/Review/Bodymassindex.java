package Review;
import java.util.Scanner;
public class Bodymassindex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your weight(kg):");
        double weight = scan.nextDouble();
        System.out.print("Please enter your height (m):");
        double height = scan.nextDouble();
        double BMI=weight/(height*height);
        System.out.println("BMI= "+BMI);
        if( BMI<18.5){
            System.out.println("You are slim");
        }
        else if( BMI>=18.5 && BMI<25){
            System.out.println("You are good");
        }
        else if( BMI>=25 && BMI<30){
            System.out.println("You are overweight");
        }
        else{
            System.out.println("You are obese");
        }
    }
}
