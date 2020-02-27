package Feb_5th;
import java.util.Scanner;
public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type square side:");
        int squareSide = input.nextInt();
        System.out.println("Type the radius of circle:");
        int circleRadius = input.nextInt();
        System.out.println("Type rectangle side1:");
        int rectangleSide1 = input.nextInt();
        System.out.println("Type rectangle side2:");
        int rectangleSide2 = input.nextInt();
        System.out.println("Perimeter of a cube is\t" +(squareSide*4));
        System.out.println("Perimeter of a circle is\t"+(2*3.14*circleRadius));
        // format is used to add %d,s thingy in to strings
        System.out.format("Perimeter of a rectangle with %d and  %d sides is %d",rectangleSide1, rectangleSide2, (rectangleSide1+rectangleSide2)*2);
    }
}
