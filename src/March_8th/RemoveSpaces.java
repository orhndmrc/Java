package March_8th;

public class RemoveSpaces {
    public static void main(String[] args) {
        spaceRemove("hello good bye bye");
    }
    public static void spaceRemove(String text){
        String result = "";
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) != ' '){
                result += text.charAt(i);
            }
        }
        System.out.println(result);
    }
}
