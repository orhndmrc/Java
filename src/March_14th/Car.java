package March_14th;

public class Car {
    int Modelyear;
    String Modelname;
    String Modelcolor;
    public Car(int year, String name, String color){
        Modelyear=year;
        Modelname=name;
        Modelcolor=color;
    }

    public static void main(String[] args) {
        Car myCar= new Car(2010, "Honda", "blue");
        Car myCar2= new Car(2009, "Nissan", "yellow");
        System.out.println("First Car: "+myCar.Modelyear+" " +myCar.Modelname+" "+myCar.Modelcolor);
        System.out.println("Second Car: "+myCar2.Modelyear+" " +myCar2.Modelname+" "+myCar2.Modelcolor);
    }
}
