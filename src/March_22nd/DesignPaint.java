package March_22nd;

public class DesignPaint {
    protected String colorName;
    protected double squareFeet;
    protected double totalPrice;
    public DesignPaint (String colorName, double squareFeet) {
        this.colorName = colorName;
        this.squareFeet = squareFeet;
        this.totalPrice = 0;
    }
    public double calculatePrice (){
        this.totalPrice=(this.squareFeet/100)*32.99;
        return this.totalPrice;
    }
    @Override
    public String toString() {
        return "Paint{" +
                "colorName='" + colorName + '\'' +
                ", squareFeet=" + squareFeet +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
