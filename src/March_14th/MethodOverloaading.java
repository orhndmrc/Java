package March_14th;

public class MethodOverloaading {
    public static void main(String[] args) {
        printString();
        printString("Java");
        printString( "Java", 20);
    }
    public static void printString(){
        for(int i =0; i<100; i++){
            System.out.println("Hello World");
        }
    }
    public static void printString(String java){

        for(int i =0; i<100; i++){
            System.out.println(java);
        }
    }
    public static void printString( String java, int a){
        for(int i =0; i<a; i++){
            System.out.println("Java");
        }
    }
}
