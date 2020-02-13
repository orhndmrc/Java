package Feb_eight;
import java.util.Scanner;
public class CompareTo2 {
    //Creating scanner object to read from keyword
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter C,R, or T :");
        //Receiving answer from the user
        String shape= myScan.next();
        //IgnoreCase = ignoring cases whether it is capital or lower like "T or t"
      if(shape.compareToIgnoreCase("c")==0){
          System.out.println("please enter radius = ");
          double radius = myScan.nextDouble();
          System.out.println(2*3.24*radius);
      }
      else if(shape.compareToIgnoreCase("r")==0){
          System.out.println("please enter width = ");
          double width = myScan.nextDouble();
          System.out.println("please enter length = ");
          double length  = myScan.nextDouble();
          System.out.println(2*(width+length));
      }
      else if(shape.compareToIgnoreCase("t")==0){    //shape.compareToIgnoreCase("t")==0--->ASCII t.compareToT = 0
          System.out.println("please enter side1 = ");
          double side1 = myScan.nextDouble();
          System.out.println("please enter side2 = ");
          double side2  = myScan.nextDouble();
          System.out.println("please enter side3 = ");
          double side3  = myScan.nextDouble();
          System.out.println(side1+side2+side3);
      }
      else{
          System.out.println("Please C,R, or T");
      }
    }
}
