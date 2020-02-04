package Firstpackage;

public class PineTree {
    public static void main(String args[]){
      System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
    }

    public static class Format {
        public static void main(String args[]){
            double item1 = 1.99;
            double item2 = 2.49;
            System.out.format("\tReceipts\n");
            System.out.format("--------------------\n");
            System.out.format("item 1 :\t $%.2f", item1);
            System.out.format("\nitem 2 :\t $%.2f\n", item2);
            System.out.format("Today I am \"happy\"");
        }
    }

    public static class Triangle {
        public static void main(String args[]){
         System.out.println("*");
            System.out.println("**");
            System.out.println("***");
            System.out.println("****");
            System.out.println("*****");
            System.out.println("******");
            System.out.println("*******");
        }
    }

    public static class Opereations {
        public static void main(String args[]){

           String myString = "Hello World";
           int firstNum = 15;
           int secondNum = 7;
                   float myFloat1 = 37;
                   float myFloat2 = 3;
                   boolean myBool = true;
                   System.out.println(myString);
            System.out.println(firstNum+secondNum);
            System.out.println(firstNum/secondNum);
            System.out.println(myFloat1+myFloat2);
            System.out.println(myFloat1/myFloat2);
            System.out.println(myBool);

        }
    }
}
