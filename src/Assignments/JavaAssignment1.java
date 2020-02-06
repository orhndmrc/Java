package Assignments;
import java.util.Scanner;
public class JavaAssignment1 {
    public static void main(String[] args) {
        Scanner MyKeyword = new Scanner(System.in);
        int id1;  int id2; int id3;  //id1 = first item's id, id2= second item's id
        int q1;    int q2;  int q3; //q1 = first item's quantity
        double p1; double p2; double p3; // p1 = first item's price
        System.out.println("Enter item1 id number:");
        id1 = MyKeyword.nextInt();
        System.out.println("Enter item1 quantity:");
        q1 = MyKeyword.nextInt();
        System.out.println("Enter item1 price:");
        p1 = MyKeyword.nextDouble();
        System.out.println("Enter item2 id number:");
        id2 = MyKeyword.nextInt();
        System.out.println("Enter item2 quantity:");
        q2 = MyKeyword.nextInt();
        System.out.println("Enter item2 price:");
        p2 = MyKeyword.nextDouble();
        System.out.println("Enter item3 id number:");
        id3 = MyKeyword.nextInt();
        System.out.println("Enter item3 quantity:");
        q3 = MyKeyword.nextInt();
        System.out.println("Enter item3 price:");
        p3 = MyKeyword.nextDouble();
        System.out.println("The receipt");
        System.out.println("Item id\t\tquantity\t\tprice");
        System.out.println("----------------------------------");
        System.out.println(id1+"\t\t\t\t"+q1+"\t\t\t$"+q1*p1);
        System.out.println(id2+"\t\t\t\t"+q2+"\t\t\t$"+q2*p2);
        System.out.println(id3+"\t\t\t\t"+q3+"\t\t\t$"+q3*p3);
        System.out.format("TOTAL\t\t\t"+(q1+q2+q3)+"\t\t\t$"+((q1*p1)+(q2*p2)+(q3*p3)));
    }
}
