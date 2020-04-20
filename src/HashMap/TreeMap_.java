package HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMap_ {
    public static void main(String[] args) {
        TreeMap<String, Integer> grades = new TreeMap<String, Integer>();
        grades.put("Beyza", 100);
        grades.put("Erol", 100);
        grades.put("Azra", 100);
        grades.put("Recep", 100);
        grades.put("Havva", 100);
        grades.put("Berrin", 100);
        /* Iterator<String> myIter = grades.keySet().iterator();
        while (myIter.hasNext()) {
            System.out.println(myIter.next() + " = " + grades.get(myIter.next())); */

            for (Map.Entry<String, Integer> entry : grades.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }


        }
    }
