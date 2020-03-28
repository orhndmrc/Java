package Abstraction;

abstract class Quete {
  private String Name;
    private int SquareFeet;
    private double Price;

    public Quete(String name, int squareFeet) {
        this.Name = name;
        this.SquareFeet = squareFeet;
        this.Price=0;
    }

    abstract double totalPrice();
    abstract void PrintQuete();

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSquareFeet() {
        return SquareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        SquareFeet = squareFeet;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Quete{" +
                "Name='" + Name + '\'' +
                ", SquareFeet=" + SquareFeet +
                ", Price=" + Price +
                '}';
    }
}
class Tiling extends Quete{
    private String Materials;

    public Tiling(String name, int squareFeet, String materials) {
        super(name, squareFeet);
        this.Materials = materials;
    }
    public double CalculateMaterialPrice(){
        if(this.Materials.equalsIgnoreCase("wood")){
            return this.getSquareFeet()*2.4;
        }
        else if(this.Materials.equalsIgnoreCase("tile")){
            return this.getSquareFeet()*1.99;
        }
        else{
            System.out.println("wrong material");
            return 0.0;
        }
    }

    public double totalPrice(){
return this.CalculateMaterialPrice()+4* this.getSquareFeet();
    }
    public void PrintQuete(){
        System.out.println(""+
                "Customer name: \t"+this.getName()+" -"+
                " Total sqrFeet:\t"+this.getSquareFeet()+" -"+
                " Material Price: \t"+this.CalculateMaterialPrice()+" -"+
                " total price: \t"+this.getPrice());
    }

    @Override
    public String toString() {
        return "Tiling{" +
                "Materials='" + Materials + '\'' +
                '}';
    }
}
class TilingTest{
    public static void main(String[] args) {
        Tiling mytiles= new Tiling("Orhan",5000,"wood");
        mytiles.toString();
        System.out.println(mytiles.CalculateMaterialPrice());
        mytiles.PrintQuete();
    }
}
