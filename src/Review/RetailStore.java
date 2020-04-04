package Review;

public class RetailStore {
    private String ListofProduct;
   private static int totalInventory;
   private int InventoryQuantity;

    public RetailStore(String listofProduct, int inventoryQuantity) {
        ListofProduct = listofProduct;
        InventoryQuantity = inventoryQuantity;
    }

    public static int getTotalInventory() {
        return totalInventory;
    }

    public static void setTotalInventory(int totalInventory) {
        RetailStore.totalInventory = totalInventory;
    }

    public String getListofProduct() {
        return ListofProduct;
    }

    public void setListofProduct(String listofProduct) {
        ListofProduct = listofProduct;
    }

    public int getInventoryQuantity() {
        return InventoryQuantity;
    }

    public void setInventoryQuantity(int inventoryQuantity) {
        InventoryQuantity = inventoryQuantity;
    }
    public void receive(int quantity){
        this.InventoryQuantity+=quantity;
    }
    public void sell(int quantity2){
        this.InventoryQuantity-=quantity2;
    }


    public String showInventory () {
        return "RetailStore{" +
                "ListofProduct='" + ListofProduct + '\'' +
                ", InventoryQuantity=" + InventoryQuantity +
                '}';
    }

    public String showAllInventory(){
        return "RetailStore{" +
                "ListofProduct='" + ListofProduct + '\'' +
                "Total inventory= "+totalInventory+
                ", InventoryQuantity=" + InventoryQuantity +
                '}';
    }

}
class RetailStoreTest{
    public static void main(String[] args) {
        RetailStore mystore= new RetailStore(" Apples ",10);
        RetailStore mystore2= new RetailStore("Tables",20);
      mystore.receive(5);
        mystore2.sell(10);
        System.out.println(mystore2.getInventoryQuantity());
        System.out.println(RetailStore.getTotalInventory());
        System.out.println(mystore.showInventory());
        System.out.println(mystore2.showAllInventory());

    }
}
