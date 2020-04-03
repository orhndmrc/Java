package Assignments;

public class RemovingCharacter {
    public static void main(String[] args) {
        //System.out.println(Remove("Java is fun", 5,7));
        Remove2("Java is fun",4,7);
    }

    public static String Remove(String s, int x, int y) {
return s.substring(0,x)+s.substring(y,s.length());
    }
    public static void Remove2(String s, int start, int end){
        for(int i=start ; i<=end; i++){
            System.out.print(s.charAt(i-start));
            System.out.print(s.charAt(s.length()-end));
        }

    }

}