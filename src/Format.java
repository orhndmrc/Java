public class Format {
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
