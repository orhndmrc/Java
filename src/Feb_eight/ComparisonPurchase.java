package Feb_eight;
import java.util.Scanner;
public class ComparisonPurchase {
    public static void main(String[] args) {
        Scanner purchaseDecision = new Scanner(System.in);
        System.out.println("Please enter the color :");
        String Color = purchaseDecision.nextLine();
        System.out.println("Please enter tag price :");
       double price = purchaseDecision.nextDouble();
        System.out.println("Please enter discount percentage(0.1-0.9):");
        double discount = purchaseDecision.nextDouble();
       int colorValue = 0;
        if(Color.compareToIgnoreCase("red")==0){  //Color.compareToIgnoreCase("red")==0---->size.equals("red") but the first one ignores upper and lower case letters
            colorValue = 20;
        }
      else if(Color.compareToIgnoreCase("blue")==0){
            colorValue = 10;
        }
      else{
            System.out.println("red or blue only");
        }
      double productPoint = price*discount-colorValue;
        System.out.println(productPoint);
      if(productPoint>=100){
          System.out.println("Don not buy it");
      }
       else if(productPoint>50 && productPoint<99){
            System.out.println("You can buy it later");
        }
       else if(productPoint<50){
          System.out.println("buy it right now");

      }
    }
}
