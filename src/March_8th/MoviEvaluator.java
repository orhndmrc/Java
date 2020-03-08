package March_8th;

public class MoviEvaluator {
    public static void Preferences(double imdb, int votes, int boxffice){
        double preference;
        preference =  (imdb*votes)/boxffice;
        System.out.println("Preference degree "+preference);
        if( preference>10){
            System.out.println("Watch movie");
        }
        else{
            System.out.println("Not watch movie");
        }

    }

    public static void main(String[] args) {
        Preferences(2,3,4);
    }
}
