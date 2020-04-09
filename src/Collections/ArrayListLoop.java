package Collections;
import java.util.ArrayList;
public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<Integer> mylist= new ArrayList<>();
        mylist.add(4);
        mylist.add(10);
        mylist.add(50);
        for(int i=0; i<mylist.size(); i++){
            System.out.println(mylist.get(i));
        }
        for(int numbers:mylist){
            System.out.println(numbers);
        }

    }
}
