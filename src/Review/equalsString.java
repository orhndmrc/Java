package Review;

public class equalsString {
    public static void main(String[] args) {
        String[] k = {"a", "b", "c"};
        String[] l = {"a", "b", "z"};
        System.out.print(equals(k, l));

    }

    public static boolean equals(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=(b[i]) ) {
                return false;
            }
        }
        return true;
    }
}
