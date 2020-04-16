package HashMap;

import java.util.HashMap;

public class Second {
    public static void main(String[] args) {
        HashMap<String,String> mine= new HashMap<>();
        mine.put("java", "medium");
        mine.put("sql", "entry");
        mine.put("selenium", "master");
        mine.put("cucumber", "expert");
        System.out.println(mine);

        HashMap<String,Integer> weather= new HashMap<>();
        weather.put("LA", 85);
        weather.put("Chicago", 30);
        weather.put("Denver",55);
        weather.put("Orlando", 90);
        System.out.println(weather);
        for(String cities:weather.keySet()){
            System.out.println(cities);
        }
        for(int values:weather.values()){
            System.out.println(values);
        }
        int sum=0;
        for(double avg:weather.values()){
            sum+=avg;
        }
        System.out.println("Average temperature : "+sum/weather.size());
    }
}
