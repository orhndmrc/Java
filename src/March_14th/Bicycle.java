package March_14th;

public class Bicycle {
    String BicycleColor;
    int BicycleSize;
    public Bicycle(String color, int size){
                BicycleColor= color;
                BicycleSize=  size;
    }
    public  void Gofast(){
        System.out.println("Go fast");
    }
    public void Gofaster(){
        System.out.println("Go faster");
    }
    public  void Goslow(){
        System.out.println("Go slowly");
    }
    public  void Slowdown(){
        System.out.println("Slow Down");
    }
}
