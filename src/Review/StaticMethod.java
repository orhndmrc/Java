package Review;

import java.util.Arrays;

public class StaticMethod {
    public static void main(String[] args) {
String text ="Orhan will like javacourse";
        System.out.println(Arrays.toString(getBigWords(text)));
    }
    public static String[] getBigWords(String text){
        String[] arr2=new String[text.length()];
        String[] arr=text.split("");
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length; i++){
            if(arr[i].length()>5){
                arr2[i]+=arr[i];
            }
        }
        return arr2;
    }
}
