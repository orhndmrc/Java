package Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveString {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        ArrayList<String> oldArray = new ArrayList<String>(Arrays.asList("Java", "is", "my", "main", "Language"));
        System.out.println(oldArray);
        System.out.print("Enter item to remove : ");
        String item=scn.next();
        ArrayList<String> newList = new ArrayList<>();
        for(String element :oldArray){
            if(!element.equals(item)){
                newList.add(element);
            }
        }
        System.out.println(newList);
    }
    public static ArrayList<String> removeItem(ArrayList<String> listOrg, String itemToRemove){
        ArrayList<String> updatedList = new ArrayList<String>();
        for(String item :listOrg){
            if(!item.equals(itemToRemove)){
                updatedList.add(item);
            }
        }
        return updatedList;
    }

    }


