package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Winner {
    public static void main(String[] args) {
String[] canditates= {"john","johnny","jackie","johnny","john","jackie","jamie","jamie","john",
        "johnny","jamie","john"};
        System.out.println(findWinner(canditates));
    }
    public static String findWinner(String[] candidates){
        HashMap<String,Integer> votes= new HashMap<>(10);

        String winner="";
        for(String person: candidates){
            if(votes.containsKey(person)){
                votes.put(person,votes.get(person)+1);
            }
            else{
                votes.put(person,1);
            }
        }
        //System.out.println(votes);
        Iterator totalVotes = votes.entrySet().iterator();
        String index="";
        int maxVote=0;
        String key;
        int value;
        while(totalVotes.hasNext()){
            Map.Entry mapEl = (Map.Entry)totalVotes.next(); //fetch the elements
            key = mapEl.getKey().toString();
            value = (int)mapEl.getValue();
            if(value>maxVote){
                maxVote=value;
                index=key;
            }
        }
        //System.out.println(index+"="+maxVote);
        winner="Winner is... "+ index+" with total "+maxVote + " votes ";
        return winner;

    }

}

