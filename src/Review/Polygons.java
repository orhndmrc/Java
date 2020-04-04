package Review;

public class Polygons {

    public void calculatePerimeter(int side) {
        System.out.println("Side is "+side);
    }

}
 class Triangle extends Polygons{
    @Override
    public void calculatePerimeter(int side) {

        System.out.println("Triangle's perimeter is :"+3*side);
    }
}
class Square extends Polygons{
    @Override
    public void calculatePerimeter(int side) {

        System.out.println("Square's perimeter is "+4*side);
    }
}
class PolygonsTest{
    public static void main(String[] args) {
        Polygons myshape= new Polygons();
        myshape.calculatePerimeter(10);
        Triangle myshape2= new Triangle();
        myshape2.calculatePerimeter(4);
        Square myshape3 = new Square();
        myshape3.calculatePerimeter(5);
        Polygons newshape= new Triangle();
        newshape.calculatePerimeter(2);
    }
}