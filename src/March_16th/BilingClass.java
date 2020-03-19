package March_16th;

public class BilingClass {
    int memberID;
    int counter;
    String name;
    double billAmount;


    public BilingClass(int memberID, int counter, String name, double billAmount) {
        this.memberID = memberID;
        this.counter = counter;
        this.name = name;
        this.billAmount = billAmount;
    }

    public void displayBill() {
        this.billAmount = this.counter * 1.9;
        System.out.println(this.billAmount);
    }

    public void readCounter() {
        System.out.println(this.counter);
    }

    public void addConsumption(int consumption) {
        this.counter += consumption;
    }

    @Override
    public String toString() {
        return "ElectricBill :\n" +
                "memberID=\t" + memberID +
                ", counter=\t" + counter +
                ", name=\t'" + name + '\'' +
                ", billAmount=\t" + billAmount;
    }

    public static void main(String[] args) {
        BilingClass myBill = new BilingClass(9876999, 0, "veteran", 0);
        System.out.println(myBill.toString());
        myBill.addConsumption(100);
        myBill.readCounter();
        myBill.displayBill();
        myBill.addConsumption(33);
        myBill.readCounter();
    }
}