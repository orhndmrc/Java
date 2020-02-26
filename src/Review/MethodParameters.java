package Review;

public class MethodParameters {
    public static void Text(String name){
//name = parameter
        System.out.println("Hello"+name);
    }
    public static void sum(int a, int b, int c){
        System.out.println("Sum: "+(a+b+c));
    }

    public static void main(String[] args) {
        Text(" World");
        sum(3,4,5);
    }
}
