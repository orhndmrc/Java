package Assignments;

public class ConvertingUpperandLowercaseofString {
    public static void main(String[] args) {
        Conversion("BURHAN");
    }


    public static void Conversion(String name) {

        for (int i = 0; i < name.length(); i++) {
            int ch = name.charAt(i);
            if (ch >96&&ch<123){
                ch=ch-32;
                System.out.print((char)ch);
            }
            else if(ch>64 && ch<91){
                ch=ch+32;
                System.out.print((char)ch);
            }
            else{
                ch=32;
                System.out.print(" ");
            }

        }
    }
}