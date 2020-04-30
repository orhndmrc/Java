package Enums;

public class enumWithIf {
    enum months{
        JUNE,
        MARCH,
        DECEMBER,
        SEPTEMBER
    }
   private String s;
   enumWithIf(String s) {
       this.s=s;
    }

    public static void main(String[] args) {
        months list = months.DECEMBER;
        if(list==months.DECEMBER){
            System.out.println("Snow time");
        }
        if(list==months.JUNE){
            System.out.println("Summer time");
        }
        if(list==months.MARCH){
            System.out.println("Welcome Spring");
        }
        if(list==months.SEPTEMBER){
            System.out.println("Fall leaves");
        }

    }
}
