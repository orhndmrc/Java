package Review;

public class Car {
    public void m1() {
        System.out.println("car 1");
    }

    public void m2() {
        System.out.println("car 2");
    }

    public String toString() {
        return "vroom";
    }
}
 class Truck extends Car {
    public void m1() {
        System.out.println("truck 1");
    }

    public void m2() {
        super.m1();


    }

    public String toString() {
        return super.toString() + super.toString();
    }
}
class MonsterTruck extends Truck {
    @Override
    public void m1() {
        System.out.println("monster 1");
    }

    @Override
    public void m2() {
        super.m1();
        super.m2();

    }

    @Override
    public String toString() {
        return "monster vroomvroom";
    }
}
class K {
    public static void main(String[] args) {
        Car car=new Car();
        Truck truck=new Truck();
        MonsterTruck monstertruck = new MonsterTruck();
        monstertruck.m1();
        monstertruck.m2();
        System.out.println(monstertruck.toString());

    }
}
