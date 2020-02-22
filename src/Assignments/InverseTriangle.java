package Assignments;

public class InverseTriangle {
    public static void main(String[] args) {
        for (int k=20;k>0;k--) {
            for (int i = 0; i < (20-k); i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
