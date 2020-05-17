package Review;

public class StringExample {
    public static void main(String[] args) {
        System.out.println(sumOfChars("Orhan"));
        StrngBuilder();
        System.out.println(reverse("orhan"));
    }
    public static int sumOfChars(String str){
        int sum=0;
        for (int i = 0; i <str.length() ; i++) {
            sum+=str.charAt(i);

        }
      return sum;
    }
    public static void StrngBuilder() {
        StringBuilder builder = new StringBuilder("Orhan");
        builder.setCharAt(0,'B');
        builder.append(6);
        System.out.println(builder);
    }
    public static String reverse(String str){
        String x="";
        for (int i = str.length()-1;i >=0 ; i--) {
            x+=str.charAt(i);


        }
        return x;
    }
}
