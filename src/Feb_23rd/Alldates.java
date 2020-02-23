package Feb_23rd;

public class Alldates {
    public static void main(String[] args) {
        dates();
    }
    public static void dates(){
        for(int i =1; i<13;i++){
            for(int j =1;j<31;j++){
                System.out.println(i+"/"+j+"/"+2020);
            }
            System.out.println();
        }
    }
}
