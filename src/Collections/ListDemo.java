package Collections;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int roll;
    String name;
}
public class ListDemo {
    public static void main(String[] args) {
        // You can only add string to the list
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("John");
        list1.add("Jack");
        list1.add("Jenny");
        System.out.println("list 1 "+list1);
        Student s1 = new Student();
        s1.roll=101;
        s1.name="Mike";
        //You add any type of data
        ArrayList list2 = new ArrayList();
        list2.add(10);
        list2.add(2.2);
        list2.add("Orhan");
        list2.add(s1);
        System.out.println("list 2 "+list2);
        list1.set(2,"Fiona");
        System.out.println("List1 updated "+list1);
        if(list1.contains("Michelle")) {
            System.out.println("Michelle is in the list");
        }
            for(String str : list1){
                System.out.println(str);
            }
       Iterator<String> itr = list1.iterator();
            while(itr.hasNext()) {
                System.out.print(itr.next()+" ");
            }
        }
    }
