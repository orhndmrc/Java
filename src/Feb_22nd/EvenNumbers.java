package Feb_22nd;

public class EvenNumbers {
    public static void EvenNumbers(int k, int l) {
        for (int j = k; j < l; j++) {
            if (j % 2 == 0) {
                System.out.println(j);

            }
        }
    }

    public static void main(String[] args) {
        EvenNumbers(11, 20);
    }
}