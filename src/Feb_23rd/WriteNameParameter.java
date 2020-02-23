package Feb_23rd;

public class WriteNameParameter {
    public static void main(String[] args) {
        printName();
        System.out.println(Name("orhan"));
        System.out.println(printMyname4("I love java as well"));
    }
    public static void printName(){
        System.out.println("Orhan");
    }
    public static String Name(String name){
        return "Demirci";
    }

    public static String printMyname4(String name){
        return name;
    }
}
