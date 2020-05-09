package Sorting_Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
public static class IdSorting implements Comparator<Student>{
        public int compare(Student st1, Student st2){
            if(st1.id==st2.id){
                return 0;
            }
            else{
                return -1;
            }

        }
    }
}
class test{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>(10);
        students.add(new Student(100,"Vahit",27) );
        students.add(new Student(102,"Sibel",16) );
        students.add(new Student(101,"Ismail",25) );
        students.add(new Student(104,"Birsen",14) );
        Collections.sort(students, new Student.IdSorting());
        for(Student st:students){
            System.out.println(st.id+"\t"+st.name+"\t"+st.age);
        }
    }


}
