package String;

public class StrBuilding {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder();
        str.append(" Java is fun ");
        str.append("Isn't it");
        str.append(" how about phyton ? ");
        System.out.println(str);
        str.insert(18," ola");
        str.delete(0,5);
        str.replace(0,4,"Koitlin ");
        System.out.println(str);
        System.out.println(str.capacity());
        System.out.println(str.indexOf("Koitlin"));

    }

}
