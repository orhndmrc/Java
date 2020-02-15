package Assignments;

public interface MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("\t\t");
        //for upper numbers 1-9
        for (int n = 1; n < 10; n++) {
            System.out.print("   " + n);
        }
        System.out.println("\n");

        //for dash
        for (int d = 1; d < 55; d++) {
            System.out.print("-");
        }
        System.out.print("\n");

        // multiplication table

        System.out.println(" \t:");
        for (int i=1;i<=9;i++){
            System.out.print(i+"\t: \t");
            for (int j=1;j<=9;j++){
                System.out.print(("\t"+i*j));
            }
            System.out.println();
        }


    }
}
