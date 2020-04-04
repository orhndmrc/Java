package Review;

public class Shapes {


    public static void calculatePerimeter(double x, double y, double z) {

        double TrianglePerimeter = (x+y+z);
        System.out.println("Triangle's perimeter is : " + TrianglePerimeter);
    }
    public static void calculatePerimeter(int x) {
        double SquarePerimeter = 4 * (x);
        System.out.println("Square's perimeter is : " + SquarePerimeter);
    }
    public static void calculatePerimeter(double x) {
        double Circumference = 2 * Math.PI * x;
        System.out.println("Circle's perimeter is : "+Circumference);
    }

    public void calculateArea(int a, int b) {

        double TriangleArea = (double) (a * b) / 2;
        System.out.println("Triangle's area is : " + TriangleArea);
    }
        public void calculateArea(int a){
            double SquareArea = a * a;
            System.out.println("Square's area is : " + SquareArea);
        }
    public void calculateArea(double r){
        double AreaCircle = Math.PI * r * r;
        System.out.println("Circle's area is : "+AreaCircle);
    }
}


    class ShapesTest{
        public static void main(String[] args) {
            Shapes geometry= new Shapes();
            geometry.calculateArea(4);
            geometry.calculateArea(5);
            geometry.calculateArea(3,4);
        }
    }

