package Feb_10th;

public class LoopEvenNumbers {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Number\t" + i);
            }
            else {
                if (i % 2 != 0) {
                    System.out.println("Odd Number\t" + i);

                }
            }
        }
    }
}
