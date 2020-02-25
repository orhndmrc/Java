package Feb_24;

public class  Nonrepeating {
    public static void nonrepeating(String a){

        a+=" ";
        for(int i =0;i<a.length()-1;i++){

            if(a.charAt(i)!=a.charAt(i+1)){
                System.out.print(a.charAt(i));
            }
        }

    }

    public static void main(String[] args) {
        nonrepeating("aaabbbccccc");
    }
}
