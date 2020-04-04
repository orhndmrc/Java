package Assignments;

public class RemovingCharacter {
    public static void main(String[] args) {
        //System.out.println(Remove("Java is fun", 5,7));
        System.out.println(Remove("Java is fun",5,7));
        Remove2("orhan",1,3);

    }

    public static String Remove(String s, int x, int y) {
return s.substring(0,x)+s.substring(y,s.length());
    }
    public static void Remove2(String str, int start, int end){
        StringBuilder sb= new StringBuilder(str);
        System.out.println(sb.delete(start,end));




    }

}