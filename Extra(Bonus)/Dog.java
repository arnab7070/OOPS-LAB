class Animal{
       protected String name;
       protected int age;
       public Animal(String name, int age){
          this.name = name;
          this.age = age;
       }
       public void animalInfo() {
          System.out.println("Animal class info: ");
          System.out.println("Name: "+this.name);
          System.out.println("Age: "+this.age);
       }
    }
    public class Dog extends Animal {
       public String color;
       public Dog(String name, int age, String color){
          super(name, age);
          this.color = color;
       }
       public void dogInfo() {
          System.out.println("Dog class: ");
          System.out.println("Name: "+this.name);
          System.out.println("Age: "+this.age);
          System.out.println("Color: "+this.color);
       }
       public static void main(String[] args) {
        Dog dog = new Dog("Leo", 2, "Brown");
          Animal animal = new Animal("Casper", 3);
          animal = dog; //implicit casting Object of dog to Animal\\(Upcasting)
        //   animal.dogInfo();//error as animal has no method called doginfo//
        animal.animalInfo();//not casper but trimmin happens for the dog class//
        Animal animal2=new Dog("Tiger",21,"Yellow");
        animal2.animalInfo();//Tiger,21//
        dog=(Dog)animal2;//downcasting//
        dog.animalInfo();
        dog.dogInfo();
       }
    }