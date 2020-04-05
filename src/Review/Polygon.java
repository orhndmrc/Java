package Review;

public interface Polygon {
    public void CalculatePerimeter(int side);

}
class triangle implements Polygon{
    @Override
    public void CalculatePerimeter(int side) {
        System.out.println("Triangle's perimeter is "+(3*side));

    }
}
class square implements Polygon{
    @Override
    public void CalculatePerimeter(int side) {
        System.out.println("Square's perimeter is "+(4*side));
    }
}
class Polygontest{
    public static void main(String[] args) {
        triangle myshape=new triangle();
        myshape.CalculatePerimeter(3);
        square myshape2=new square();
        myshape2.CalculatePerimeter(4);
       // Polygon k= new square ();
       // k.CalculatePerimeter(5);
    }
}