package Assignments;
//wrong
public class JavaFirstAssignment {
    public static void main(String args[]){
        double id123 = 2.49;
        double id124 = 4.79;
        double id125 = 1.65;
        int quantity1 = 1;
        int quantity2 = 2;
        int quantity3 = 3;
        System.out.println("The receipt");
        System.out.println("Item id\t\tquantity\t\tprice");
        System.out.println("----------------------------------");
        System.out.println("123\t\t\t\t1\t\t\t"+quantity1*id123);
        System.out.println("124\t\t\t\t2\t\t\t"+quantity2*id124);
        System.out.format("125\t\t\t\t3\t\t\t%.2f\t\t\n",quantity3*id125 );
        System.out.format("TOTAL\t\t\t"+(quantity1+quantity2+quantity3)+"\t\t\t"+(quantity1*id123+quantity2*id124+quantity3*id125));
    }
}
