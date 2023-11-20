// // Create a class EMP having instance variable name and id. Create its subclass (say Scientist) which has instance variable
// // no_of_publication and experience. Now create its subclass, say Dscientist which has instance variable award. Put a method: public String toString () { } in every class where you describe about the class and from main create object of each class and print
// // each object
// class EMP{
//     String name;
//     int id;
//     EMP(String name,int id){
//         this.name=name;
//         this.id=id;
//     }
//     public String toString(){
//         return("EMP class: "+"Name: "+name+", Id: "+id);
//     }
// }
// class Scientist extends EMP{
//     int no_of_publication;
//     int experience;
//     Scientist(String name,int id,int no_of_publication,int experience){
//         super(name,id);
//         this.no_of_publication=no_of_publication;
//         this.experience=experience;
//     }
//     public String toString(){
//         return super.toString()+(" Scientist Class :"+" No of publications:"+no_of_publication+" Experience: "+experience);
//     }
// }
// class Dscientist extends Scientist{
//     int award;
//     Dscientist(String name,int id,int no_of_publication,int experience,int award){
//         super(name,id,no_of_publication,experience);
//         this.award=award;
//     }
//     public String toString(){
//         return super.toString()+(" Dscientist class:" + " Awards: "+award);
//     }
// }
// class Prog3{
//     public static void main(String[]args){
//         EMP obj= new EMP("Supratik",103);
//         System.out.println(obj.toString());
//         Scientist obj1 = new Scientist("Shyamal",165,143,40);
//         System.out.println(obj1.toString());
//         Dscientist obj2 = new Dscientist("Kakali",145,246,50,6);
//         System.out.println(obj2.toString());
//     }
// }

class EMP {
    String name;
    int id;

    public String toString() {
        return "Parent Class EMP";
    }
}

class Scientist extends EMP {
    int no_of_publication;
    int experience;

    public String toString() {
        return "Child Class Scientist";
    }
}

class Dentist extends EMP {
    int award;

    public String toString() {
        return "Child Class Dentist";
    }
}

class Prog3 {
    public static void main(String[] args) {
        EMP obj1 = new EMP();
        System.out.println(obj1.toString());
        EMP obj2 = new Scientist();
        System.out.println(obj2.toString());
        EMP obj3 = new Dentist();
        System.out.println(obj3.toString());
    }
}
