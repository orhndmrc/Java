package Feb_24th;

public class removeChar {
    public static void main(String[] args) {
        removeChar("Hello", 'e');
        removeCharStr("Orhan",'r');
    }

    public static void removeChar(String text, char c) {
        String s = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != c) {
                System.out.print(text.charAt(i));
            }
        }

    }

    public static String removeCharStr(String word, char letter) {
        String removed = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != letter) {

                System.out.print(word.charAt(i));
            }
        }
        return removed;
    }
}