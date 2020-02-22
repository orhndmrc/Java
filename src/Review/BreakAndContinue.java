package Review;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        for (int j = 1; j < 9; j++) {
            if (j == 3) {
                continue;
            }
            System.out.println(j);
        }
    }
}