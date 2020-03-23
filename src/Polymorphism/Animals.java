package Polymorphism;

  class Animals {
      protected String name;

      public Animals(String name) {
          this.name = name;
      }



      public String makeSound() {
          return "Animals are making sound...";
      }
  }
      class Cat extends Animals {
          public Cat(String name) {
              super(name);
          }

          @Override
          public String makeSound() {
              return this.name + " is meowing...";
          }
      }

      class Dog extends Animals {
          public Dog(String name) {
              super(name);
          }

          @Override
          public String makeSound() {
              return this.name + " is barking...";
          }
      }

      class Horse extends Animals {
          public Horse(String name) {
              super(name);
          }

          @Override
          public String makeSound() {
              return this.name + " is snickering...";
          }
      }

       class Main {
public static void LettinMakeSound(Animals animal){
    System.out.println(animal.makeSound());
}
          public static void main(String[] args) {
              /*Animals animal1 = new Animals("Limon");
              System.out.println(animal1.makeSound());
              Animals animal2 = new Cat("Tekir");
              System.out.println(animal2.makeSound());
              Animals animal3 = new Dog("Karabas");
              System.out.println(animal3.makeSound());
              Animals animal4 = new Horse("Sahbatur");
              System.out.println(animal4.makeSound());*/
              LettinMakeSound(new Cat("Tekir"));
              LettinMakeSound(new Dog("Karabas"));
              LettinMakeSound(new Horse("Sahbatur"));
          }
      }




