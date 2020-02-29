package Feb_29th;
import java.util.Scanner;
public class FoodMenu {

        public static void designMenu() {
            Scanner scan = new Scanner(System.in);
            String soup, meal, salad = " ";
            double priceSoup, priceMeal, priceSalad = 0;
            System.out.printf("Menu\n");
            System.out.printf("\tSOUPS\n");
            System.out.println("Lentil \t"+"$3.99");
            System.out.println("Tomato \t"+"$4.99");
            System.out.println("Fish \t"+"$8.99");
            System.out.printf("\tMEAL\n");
            System.out.println("Rice \t"+"$3.99");
            System.out.println("Chicken\t"+"$5.99");
            System.out.println("Beef \t"+"$7.99");
            System.out.printf("\tSALAD\n");
            System.out.println("Ceaser \t"+"$3.99");
            System.out.println("Waldorf\t"+"$7.99");
            System.out.println("-----------------\n");
            System.out.println("What do you want as a soup?");
            String order1 = scan.next();
            if (order1.equalsIgnoreCase("Lentil")) {
                soup = "Lentil";
                priceSoup = 3.99;
            } else if (order1.equalsIgnoreCase("Tomato")) {
                soup = "Tomato";
                priceSoup = 4.99;
            } else {
                soup = "Fish";
                priceSoup = 8.99;
            }
            System.out.println("What do you want as a meal?");
            String order2 = scan.next();
            if (order2.equalsIgnoreCase("Rice")) {
                meal = "Rice";
                priceMeal = 3.99;
            } else if (order2.equalsIgnoreCase("Chicken")) {
                meal = "Chicken";
                priceMeal = 5.99;
            } else {
                meal = "Beef";
                priceMeal = 7.99;
            }
            System.out.println("What do you want as a salad?");
            String order3 = scan.next();
            if (order3.equalsIgnoreCase("Ceaser")) {
                salad = "Ceaser";
                priceSalad = 3.99;
            } else {
                salad = "Waldorf";
                priceSalad = 7.99;
            }
            double total = priceSoup + priceMeal + priceSalad;
            System.out.println("RECEIPT\n");
            System.out.println( soup + "\t" + "$"+priceSoup );
            System.out.println(  meal +  "\t"+  "$"+priceMeal );
            System.out.println( salad + "\t"+ "$"+priceSalad);
            System.out.format("Total:  $%s \t", total);
        }
        public static void main(String[] args) {
            designMenu();
        }
    }

