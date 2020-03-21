package Review;

public class QuadraticRoots {
    public static void main(String[] args) {
        quadratic(1, -7, 12);
        quadratic(4, 10, 5);
    }

    public static void quadratic(int a, int b, int c){
        double root = Math.sqrt((b * b) - 4 * a *c);
     double x1=(-b+root)/(2*a);
        double x2=(-b-root)/(2*a);
        System.out.println("First root = "+x1);
        System.out.println("Second root = "+x2);
}


    }

