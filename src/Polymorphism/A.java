package Polymorphism;

 public class A {
    protected void printMessage(){
        System.out.println("kk");
    }
}
  class B extends A {
     @Override
     protected void printMessage() {
         System.out.println("Hello World");
     }
 }
 class BTest {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        A c = new B();
        a.printMessage();
        b.printMessage();
        c.printMessage();
    }
}