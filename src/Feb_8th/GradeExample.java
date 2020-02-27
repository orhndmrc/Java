package Feb_8th;
import java.util.Scanner;
public class GradeExample {
    public static void main(String[] args) {
        Scanner GradeCal = new Scanner(System.in);
        System.out.println("Enter the score:");
        int grade = GradeCal.nextInt();

        if(grade>=90 && grade<=100){
            System.out.println("Grade: A+");
        }
        else if(grade<90 && grade>=80){
            System.out.println("Grade: A");
        }
        else if(grade<80 && grade>=70){
            System.out.println("Grade: B");
        }
        else if(grade<70 && grade>=60){
            System.out.println("Grade: C");
        }
        else if(grade<60 && grade>=50){
            System.out.println("Grade: D");
        }
        else if(grade<50 && grade>=0) {
            System.out.println("Fail");
        }
        else{
            System.out.println("Invalid Score");
        }
    }
}
