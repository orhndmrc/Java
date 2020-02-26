package Review;

public class MethodOverloading {
    public static void scorecalculation(String name, int score){
        System.out.println(name+ " has "+score);
    }
    public static void scorecalculation( int score){
        System.out.println("Unnamed person"+ " has "+score);
    }
    public static void scorecalculation(String name){
        System.out.println(name+ " has no score");
    }

    public static void main(String[] args) {
        scorecalculation("john",1000);
        scorecalculation("jack");
        scorecalculation(1500);
    }
}
