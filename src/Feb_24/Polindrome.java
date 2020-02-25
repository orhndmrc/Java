package Feb_24;

public class Polindrome {
    public static void polindromeCheck(String text){
        String reversed="";
        for(int i =text.length()-1; i>=0;i--){
            reversed+=text.charAt(i);
        }
        if(reversed.equals(text)){
            System.out.println("Polindrome");
        }
        else{
            System.out.println("Not polindrome");
        }

    }
}

