package HashMap;

public class Replacingvowels {
    public static void main(String[] args) {
        String x="orhan";
        vowels( x );
    }
    public  static void vowels(String x){
        String empty="";
        for(int i= x.length()-1; i>=0; i--){

            x=x.replaceAll("a","0");
            x=x.replaceAll("e","1");
            x=x.replaceAll("o","2");
           x= x.replaceAll("u","3");

            empty+=x.charAt(i);

        }

       empty+="aca";
        System.out.println(empty);
    }
}
