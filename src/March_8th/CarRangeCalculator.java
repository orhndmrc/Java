package March_8th;

public class CarRangeCalculator {
    public static void main(String[] args) {
        System.out.println("Range: "+CaRange(3.5, 30));
    }
    public static int CaRange(double MPG, double gasamount){
        int range= (int)(MPG*gasamount);

        return range;
    }
}
