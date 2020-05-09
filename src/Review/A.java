package Review;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfCompanies = scan.nextInt();
        LinkedList<Integer> incomes = new LinkedList<>();
        for (int i = 0; i <numberOfCompanies ; i++) {
        incomes.add(scan.nextInt());
        }
        LinkedList<Integer> percentages = new LinkedList<>();
        for (int i = 0; i <numberOfCompanies ; i++) {
           percentages.add(scan.nextInt());
        }
       int[] tax = new int[numberOfCompanies];
        int max=0;
        for (int i = 0; i <numberOfCompanies ; i++) {
            tax[i]=((incomes.get(i)*percentages.get(i))/100);

            if(tax[i]>max){
                max=tax[i];

                System.out.println(i);
            }

        }
        System.out.println(max);
    }
}