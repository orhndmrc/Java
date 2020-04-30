package Enums;

public class First {
    enum Level {
        LOW,
        MEDIUM,
        HIGH,
    }

    public static void main(String[] args) {
        Level myEnum = Level.LOW;
        System.out.println(myEnum);
    }
}
