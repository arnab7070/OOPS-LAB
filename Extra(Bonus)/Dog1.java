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
    public class Dog1 extends Animal {
       public String color;
       public Dog1(String name, int age, String color){
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
      Animal animal = new Dog1("Leo", 2, "Black");//beacuse of Dynamic method Dispatching
       //during runtime animal is invoked with dogINfo method but it will not be found so error if not downcasted properly from child(dog) to parent(animal)//
          Dog1 dog = new Dog1("Tiger",22,"YellowStripes");
          dog.animalInfo();
          dog.dogInfo();
          dog=(Dog1)animal;//downcasting//
          dog.animalInfo();//runs both animalinfo method of parent (animal) class//
          dog.dogInfo();// and dogINfo method of child(dog)class with the data of animal object declared on line 27//
        
       }
    }