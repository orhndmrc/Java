package HashMap;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapReview {
    public static void main(String[] args) {
        TreeMap<String,Integer> phoneBook = new TreeMap<String,Integer>(Collections.reverseOrder());
        phoneBook.put("Ali",941235678);
        phoneBook.put("Veli",12345678);
        phoneBook.put("Josh",908765345);
        System.out.println(phoneBook);
        phoneBook.get("Ali");
        for(Map.Entry<String,Integer> entry: phoneBook.entrySet() ){
            System.out.println(entry.getValue()+" "+entry.getKey());
        }
        Iterator<String> itr= phoneBook.keySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
