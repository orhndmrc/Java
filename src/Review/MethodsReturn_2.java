package Review;

public class MethodsReturn_2 {
    public static int multiplytwo(int a){
        return 2*a;
    }
    public static int sumtwo(int a){
        return a+2;
    }
    public static int multiplyfour(int a){
        return 4*a;
    }

    public static void main(String[] args) {
        System.out.println(multiplyfour(sumtwo(multiplytwo(8))));
    }
}
