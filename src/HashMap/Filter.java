package HashMap;

public class Filter {
    public static void main(String[] args) {
        String [] states={"Arizona","Nevada","CA","NY"};
        StatesNames(states,"abb");
        StatesNames(states,"full");

    }
    public static void StatesNames(String[] x, String y){
        if(y.equals("abb")){
        for(int i=0; i<x.length; i++){
         if(x[i].length()<=3){
             System.out.println(x[i]);
         }

            }
        }
        else if(y.equals("full")) {
            for (int i = 0; i < x.length; i++) {
                if (x[i].length() > 3) {
                    System.out.println(x[i]);
                }
            }
        }
        else{
            System.out.println("invalid parameter");
        }
    }
}
