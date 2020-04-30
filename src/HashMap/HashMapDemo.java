package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>(Map.of(1,"A",2,"B",3,"C"));
        map.put(4,"D");
        System.out.println(map);
        for(Map.Entry<Integer,String> k:map.entrySet()){
            System.out.println("Keys "+k.getKey()+" Values "+k.getValue());
        }
        for(Integer x:map.keySet()){
            System.out.println(x);
        }
        for(String y:map.values()){
            System.out.println(y);
        }

    }
}
