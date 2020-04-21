package HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class PhoneBook {
    public static void main(String[] args) {
        TreeSet<Integer> phone = new TreeSet<Integer>();
        phone.add(9);
        phone.add(5);
        phone.add(1);
        phone.add(6);
        phone.add(8);
        phone.add(7);
        phone.add(0);
        phone.add(0);
        phone.add(3);
        phone.add(2);
        Iterator<Integer> iter = phone.iterator();
        System.out.print( "John Doe : ");
        while(iter.hasNext()){
            System.out.print(iter.next());
        }


    }
}
