package Enums;

public class seasons {
    enum terms {
        SUMMER,
        FALL,
        WINTER,
        SPRING,

    }

    public static void main(String[] args) {

       for(terms k : terms.values() ){
           System.out.println(k);
       }


    }
}
