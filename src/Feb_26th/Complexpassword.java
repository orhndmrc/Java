package Feb_26th;

public class Complexpassword {
    public static void Complex(int a, int b) {
        for (int i = 0; i <= a; i++) {
            System.out.print((char) (97 + (int) (Math.random() * 26)));
        }
            for (int j = 0; j <= b; j++) {

                System.out.print( (int) (Math.random() * 10));
            }

    }
        public static void main(String[] args){
            Complex(2,2);
        }

}
