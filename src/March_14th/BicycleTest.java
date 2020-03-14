package March_14th;

public class BicycleTest {
    public static void main(String[] args) {
        Bicycle newbike= new Bicycle("blue", 3);
        System.out.println("My bicycle is "+newbike.BicycleColor+" "+newbike.BicycleSize+" feet long");
        newbike.Gofast();
        newbike.Gofaster();
        newbike. Goslow();
        newbike.Slowdown();
    }
}
