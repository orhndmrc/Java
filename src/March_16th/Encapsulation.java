package March_16th;

public class Encapsulation {
    private int door;
    private String model;
    private int cost;
public Encapsulation(int door, String model, int cost ){
    this.door=door;
    this.model=model;
    this. cost=cost;
}
    public int getDoor() {

        return door;
    }

    public void setDoor(int door) {
        this.door = door;
        if(this.door<0){
            System.out.println("The number of doors can not be negative");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
