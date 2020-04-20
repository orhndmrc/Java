package HashMap;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        Map<Integer,String> map2 = new java.util.LinkedHashMap<Integer, String>();
        Map<Integer,String> map3= new java.util.TreeMap<Integer, String>();
        mapPrint( map);
        System.out.println("******************************");
        mapPrint( map2);
        System.out.println("******************************");
        mapPrint( map3);

    }
    public static void mapPrint(Map<Integer,String> map){
        map.put(10, "java");

        map.put(5,"C++");
        map.put(2,"php");
        map.put(1,"Python");
       /* for(int numbers:map.keySet()){
            System.out.println(numbers);
        }
        for(String s:map.values()){
            System.out.println(s);
        } */
       for(Map.Entry<Integer,String> entry: map.entrySet()){
           System.out.println("Key "+ entry.getKey()+" Value : "+entry.getValue());
       }
    }
}
