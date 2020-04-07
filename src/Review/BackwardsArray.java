package Review;

public class BackwardsArray {
    public static void main(String[] args) {
        int[] y = {1, -3, 4, 7, 2};
        PrintBackwardsArray(y);
    }

    public static void PrintBackwardsArray(int[] x) {
        if (x.length == 0) {
            System.out.println("[]");
        } else {

            for (int i = x.length - 1; i >= 0; i--) {
                System.out.println("element [" + i + "] is " + x[i]);
            }

        }
    }
}