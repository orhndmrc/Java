package HashMap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_ {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        Set<String>   set2 = new LinkedHashSet<String>();
        Set<String>   set3 = new TreeSet<String>();
        set1.add("Java");
        set1.add("Phyton");
        set1.add("C++");
        set2.add("Java");
        set2.add("Phyton");
        set2.add("C++");
        set3.add("Java");
        set3.add("Phyton");
        set3.add("C++");
        System.out.println(" HashSet*********************************");

        for(String s: set1){
            System.out.println(s);
        }
        System.out.println(" LinkedHashSet*********************************");
        for(String s: set2){
            System.out.println(s);
        }
        System.out.println(" TreeSet*********************************");
        for(String s: set3){
            System.out.println(s);
        }
    }

}
