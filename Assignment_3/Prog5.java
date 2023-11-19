// Create a class EMP having instance variable name and id. Create its subclass (say Scientist) which has instance variable
// no_of_publication and experience. Now create its subclass, say Dscientist which has instance variable award. Put a method: public String toString () { } in every class where you describe about the class and from main create object of each class and print
// each object
class EMP{
    String name;
    int id;
    EMP(String name,int id){
        this.name=name;
        this.id=id;
    }
    public String toString(){
        return("EMP class: "+"Name: "+name+", Id: "+id);
    }
}
class Scientist extends EMP{
    int no_of_publication;
    int experience;
    Scientist(String name,int id,int no_of_publication,int experience){
        super(name,id);
        this.no_of_publication=no_of_publication;
        this.experience=experience;
    }
    public String toString(){
        return super.toString()+(" Scientist Class :"+" No of publications:"+no_of_publication+" Experience: "+experience);
    }
}
class Dscientist extends Scientist{
    int award;
    Dscientist(String name,int id,int no_of_publication,int experience,int award){
        super(name,id,no_of_publication,experience);
        this.award=award;
    }
    public String toString(){
        return super.toString()+(" Dscientist class:" + " Awards: "+award);
    }
}
class Prog5{
    public static void main(String[]args){
        EMP obj= new EMP("Supratik",103);
        System.out.println(obj.toString());
        EMP obj1 = new Scientist("Shyamal",165,143,40);//Dynamic method Dispatching//
        //(parent class refernce to child class object)
        System.out.println(obj1.toString());
       Scientist obj2 = new Dscientist("Kakali",145,246,50,6);//Dynamic method Dispatching//
        System.out.println(obj2.toString());
        // in line numbers  41 and 43 we are referncing to the child class obujects through their immediate parent class refernces.
        // Beacuse the toString method is overridden inevery class //
        // the Dynamic method sispatching follows that the resolution of overridden methods in java happens at runtime by JVM(Java virtual Machine) on the basis of the runtime object and no on the refernce types pointing to that object//
        // so at line number 43 and 45 we even though are referncing to the scietist and sdceintist classs throguh their superclass refernces so obj1.toString( refers to the sceintist toStinr method)
        //similarly for dscientist class//
    }
}