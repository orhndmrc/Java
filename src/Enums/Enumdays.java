package Enums;

public class Enumdays {
    enum days {
        MON,
        TUE,
        WED,
        THR,
        FRI,
        SAT,
        SUN,
    }

    public static void main(String[] args) {
        for(days list : days.values()){
            System.out.println(list);
        }
    }
}
