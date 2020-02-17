package Assignments;
import java.util.Scanner;
public class ShippingPrice {
    public static void main(String[] args) {
        Scanner Shipping = new Scanner(System.in);
        System.out.println("Enter the package weight:");
        int weight = Shipping.nextInt();
        if (weight >= 1 && weight < 6) {
            weight = 12;
        }
        else if (weight >= 6 && weight < 13) {
            weight = 29;
        }
        else if (weight >= 13) {
            weight = 50;
        }
        else {
            System.out.println("Please enter a valid weight");
        }
            System.out.println("Enter the package volume:");
            int volume = Shipping.nextInt();
            if (volume >= 5 && volume < 11) {
                volume = 20;
            } else if (volume >= 11 && volume < 21) {
                weight = 45;
            }
            else{
                System.out.println("Please enter a valid volume");
            }
            System.out.println("Enter the distance as mile:");
            int distance = Shipping.nextInt();
            if(distance<0){
                System.out.println("Please enter a valid distance");
            }
            System.out.println("Price Ground=\t" + ((weight * volume) / 11) * distance / 100 + "$");
            System.out.println("Price Urgent=\t" + ((weight * volume) / 5) * distance / 100 + "$");
        }
    }
