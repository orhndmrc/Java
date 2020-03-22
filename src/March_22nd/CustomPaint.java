package March_22nd;

public class CustomPaint extends  DesignPaint {
    protected String paintGloss;

    protected String durability;


    public CustomPaint(String paintGloss,  String durability,  String colorName, double squareFeet, double totalPrice) {
        super(colorName,squareFeet);

        this.paintGloss = paintGloss;

        this.durability = durability;


    }
    public void ChangeGloss(String newGloss){
        this.paintGloss=newGloss;

    }
    public void Durability(String newDurability ){

        this.durability=newDurability;
    }
    public double PriceCalculation(){
       double priceGallon=32.99;
        if( this.paintGloss.equalsIgnoreCase("Glossy")){
            priceGallon+=2;

        }
        else if( this.paintGloss.equalsIgnoreCase("Extra Glossy")){
            priceGallon+=3;

        }
        if(this.durability.equalsIgnoreCase("Durable")){
            priceGallon+=2;
        }
        else if(this.durability.equalsIgnoreCase("Super Durable")){
            priceGallon+=3;
        }
        super.totalPrice=super.squareFeet/100* priceGallon;
        return super.totalPrice;
    }

    @Override
    public String toString() {
        return "CustomPaint{" +
                "paintGloss='" + paintGloss + '\'' +
                ", durability='" + durability + '\'' +
                ", colorName='" + colorName + '\'' +
                ", squareFeet=" + squareFeet +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
