package March_22nd;

public class DesignPaint_Test {
    public static void main(String[] args) {
        DesignPaint myPaint=new  DesignPaint("zero gravity", 280);
        System.out.println(myPaint.toString());
        CustomPaint custom= new  CustomPaint("glossy","durable", "Pink", 100, 0);
        System.out.println(custom.toString());
        System.out.println(custom.PriceCalculation());
    }
}
