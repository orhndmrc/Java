package Review;

public class Increment {
    public static void main(String[] args) {
        int i=10;
        int j =10;
        int newNum = 10*++i;
        int newNum2 = 10*j++;
        System.out.println(newNum);
        System.out.println(newNum2);
    }
}
