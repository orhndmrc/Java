package HackerRank;

public class Repeating {
    public static void main(String[] args) {
        System.out.println(repeat("word","x",3));
    }
    public static String repeat(String word,String sep, int count){
        String x="";
        for(int i=0; i<count; i++){
            x+=word+sep;
        }
        return x;
    }
}
