package March_18th;

public class CoffeeMakerTest {
    public static void main(String[] args) {
        CoffeeMaker myMaker = new CoffeeMaker(6);
        System.out.println(myMaker.toString());
        myMaker.setTimer(20);
        System.out.println(myMaker.getTimer());
        myMaker.brewCoffee();
        myMaker.resetTimer();
        myMaker.brewCoffee();
    }

}
