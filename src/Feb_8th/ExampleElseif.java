package Feb_8th;
import java.util.Scanner;
public class ExampleElseif {
    public static void main(String[] args) {
        Scanner electricUsage = new Scanner(System.in);
        System.out.println("Electric consumption in kw:");
       double usage;
        double electricBill = 0;
        usage = electricUsage.nextDouble();


        if(0<usage && usage<500){
            electricBill = usage*0.3;
        }
       else if(500<=usage && usage<1000){
            electricBill = usage*0.4;
        }
        else if(1000<=usage && usage<2000){
            electricBill = usage*0.5;
        }
        else if( usage>=2000){
            electricBill = usage*0.6;
        }

        else{
            System.out.println("please enter a valid usage");
        }
        System.out.println(electricBill);
}

}

