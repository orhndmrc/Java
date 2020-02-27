package Review;
import java.util.Scanner;
public class maxnumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("First number:");
        int num1=scan.nextInt();
        System.out.print("Second number:");
        int num2=scan.nextInt();
        System.out.print("Third number:");
        int num3=scan.nextInt();
        int max=-1;
        if(num1>=num2 && num1>=num3){
            max=num1;
        }
        else if(num2>=num3 && num2>=num1){
            max=num2;
        }
        else{
            max=num3;
        }
        System.out.println("Maximum nunber: "+max);
    }
}
