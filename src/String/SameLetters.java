package String;

public class SameLetters {
    public static void main(String[] args) {
        StringBuilder strb = new StringBuilder("orhanxk");
        System.out.println(compare(strb,"anx"));

    }
    public static boolean compare(StringBuilder strb, String str){
        boolean isTrue = false;
        for(int i =0; i<strb.length(); i++){
           if(strb.substring(i).equals(str)){
               isTrue=true;

           }
        }

        return isTrue ;
    }
}
