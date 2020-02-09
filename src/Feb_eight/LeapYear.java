package Feb_eight;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner LeapYear = new Scanner(System.in);
        System.out.println("Enter the year:");
      int year = LeapYear.nextInt();
      if(year%4==0 || year%400==0 && year%100!=0){
          System.out.println("leap year");
      }
      else{
          System.out.println("Not a leap year");
      }
    }
}