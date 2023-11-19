// . Write a program to demonstrate anonymous inner class (using super class and interface

//SuperClass//
class SuperClass{
    void Eat(){
        System.out.println("Oudhi Handi Biriyani");
    }
}
//Interface//
interface Drink{
    void Drink();
}
//normally if we would like to override these two mwthods Eat() and Drink then we would go for sublcasses and implementing class respectively but here we will do it without those thing with anonymous inner class
                        //syntax//
                        //For classes(SUPERCLASSES)//
                        // Class_Name object = new Class_Name(){
                        // 
                        //     void method(){
                        //         //override
                        //     }
                        // };-->semicolon is important.


                        //For interfaces//
                  
                        //For classes(SUPERCLASSES)//
                        // Interface_name object = new Interface_name (){
                        // 
                        //     void method(){
                        //         //override
                        //     }
                        // };-->semicolon is important.
                        
class Prog4{
    public static void main(String[]args){
        SuperClass Supratik= new SuperClass(){
        
            void Eat(){
                System.out.println("AlooBhate and kacha Lanka Dal seddho holeo mondo hoyna");
            }
        };
        Supratik.Eat();//Calling the anonymous inner class overridden method this is only local//
     SuperClass Faltu= new SuperClass();
     Faltu.Eat();//Normal implemtaiona s in SUperclass the origuinal one//
        Drink Supra=new Drink(){
        
            public void Drink(){
                  System.out.println("Roo Afza and Malai Kulfi");
            
            }
        };
        Supra.Drink();
    }
}
//Note the class names too it is Prog4$1.class and Prog4$2.class//