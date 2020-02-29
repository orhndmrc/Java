package Feb_29th;

public class FoodCloth {
    public static void Food() {
        int choice = (int) (Math.random() * 3) + 1;
        if (choice == 1) {
            System.out.println("Drink soup");
        } else if (choice == 2) {
            System.out.println("Eat hamburger");
        } else {
            System.out.println("Enjoy salad");

        }
    }
    public static void Cloth() {
        int choice = (int) (Math.random() * 3) + 1;
        if (choice == 1) {
            System.out.println("red shirt");
        } else if (choice == 2) {
            System.out.println("blue jeans");
        } else {
            System.out.println("white hat");

        }
    }
    public static void main(String[] args) {
        Food();
        Cloth();
    }
}