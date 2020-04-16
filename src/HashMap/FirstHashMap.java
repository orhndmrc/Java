package HashMap;

import java.util.HashMap;

public class FirstHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> first= new HashMap<>();
        first.put("Java",1000);
        first.put("Selenium",150);
        System.out.println(first);
        for(String key:first.keySet()){
            System.out.println(key);
        }
        for(int values:first.values()){
            System.out.println(values);
        }
    }
}
