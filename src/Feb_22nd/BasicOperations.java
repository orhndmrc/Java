package Feb_22nd;

public class BasicOperations {
    public static double returnSmth(){
        return 3.5;
    }
    public static int addTwo(int a,int b){
        int c=a+b;
        return c;
    }
    public static int substTwo(int a, int b){
        int c= a-b;
        return c;
    }
    public static double multiplyTwo(int a,int b){
        return a*b;
    }
    public static double divideTwo(int a,int b){
        double result = a/b;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(returnSmth());
        System.out.println(addTwo(10,15));
        System.out.println(substTwo(7,4));
        System.out.println(multiplyTwo(3,4));
        System.out.println(divideTwo(100,20));
    }
}
