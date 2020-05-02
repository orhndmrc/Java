package String;

public class StringBuldr {
    public static void main(String[] args) {
        String str = "java";
        System.out.println(toUpperCaseMethod(str));

    }

    public static String toUpperCaseMethod(String str) {
        StringBuilder strbd = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            strbd.append((char) (str.charAt(i) - 32));
        }
        str = "" + strbd;
        return str;

    }
}