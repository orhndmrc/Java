package Review;


public class Inheritance {
    private static int additionPrivateStatic(int a, int b) {
        return a + b;
    }

    public static int additionPublicStatic(int a, int b) {
        return a + b;
    }

    private int additionPrivate(int a, int b) {
        return a + b;
    }

    public int additionPublic(int a, int b) {
        return a + b;

    }
}

    class Testinheritance{
        public static void main(String[] args) {
            Inheritance obj= new Inheritance();
            System.out.println(obj.additionPublic(5,4));
            System.out.println(Inheritance.additionPublicStatic(6,3));
        }
    }


