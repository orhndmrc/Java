package Interface;

public interface Animal {

 void makeSound();
 void sleep();

}
class Cat implements  Animal {
    public void makeSound() {
        String s= "ali";
       
        System.out.println("meow");
    }

    public void sleep() {
        System.out.println("Mirr");
    }
}
    class CatTest{
        public static void main(String[] args) {
            Cat mycat= new Cat();
            mycat.makeSound();
            mycat.sleep();
        }
    }

