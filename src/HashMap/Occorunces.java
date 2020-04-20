package HashMap;

import java.util.HashMap;

public class Occorunces {
    public static void main(String[] args) {
        String str = "aaabcdeef";
        System.out.println(findOccurrences(str));
    }
    public static HashMap<Character, Integer> findOccurrences(String str) {
        HashMap<Character, Integer> arr = new HashMap<>();
        for (char word : str.toCharArray()) {
            if (arr.containsKey(word)) {
                arr.put(word, arr.get(word) + 1);
            } else {
                arr.put(word, 1);
            }
        }
        return arr;
    }
}
