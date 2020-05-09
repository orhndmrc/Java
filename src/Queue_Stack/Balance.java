package Queue_Stack;

import java.util.Stack;

public class Balance {
    public static void main(String[] args) {
        String str="{{}}}";
        System.out.println(balance(str));
    }
    public static boolean balance(String str){
        Stack<Character> curly = new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            curly.push(str.charAt(i));
        }
        System.out.println(curly);
        int openCurly=0;
        int closedCurly=0;
        char ch;
        for (int i = 0; i <str.length() ; i++) {
            ch=curly.pop();
            if(ch=='{'){
                openCurly++;
            }
            else{
                closedCurly++;
            }
        }
        if(openCurly==closedCurly){
            return true;
        }

        return false;
    }
}
