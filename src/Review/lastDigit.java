package Review;

public class lastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(397));
        System.out.println(lastDigit(-39));
    }
    public static int lastDigit(int a){
        int x=Math.abs(a%10);

        return x;
    }
}
