package String;

import java.util.ArrayList;
import java.util.Arrays;

public class Eid_Mubarek {
    public static void main(String[] args) {
        String best_mentor = "Rasul";
        ArrayList<String> cyberx = new ArrayList<>(Arrays.asList("Gokhan","Gulsen","Umedi","Shohrat","Derya","Inci"));
        String group_members = "";
        for (int i = 0; i <cyberx.size() ; i++) {
            group_members +=cyberx.get(i)+" ";

        }
        System.out.println("Eid mubarek to best mentor "+best_mentor+" and "+group_members);
    }
}
