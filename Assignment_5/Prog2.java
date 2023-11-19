// Create a class which contains an inner class. Show that inner class can use member of outer class directly, but Outer class can use
// member of Inner class only through its object. Check the name of class file, you created
class Outer{
    //  static variable
//        /\
//       /  \
//  (accessible in static as well as non-static areas)//
//      instance variable
//        /\
//       /  \
//  (accessible in only non-static areas)//

    static int Outer_X_static=20;//static outer variable(accessible directly in inner class in both static and non static methods that is both in m2 and m3 20 would be accesible)
    int Outer_X=200;//non-static outer variable(accessible directly in inner class in one ansd only non static methods that is both in m2 only 200 would be accesible)
    class Inner{
        int inner_X=30;
       //nonstaic area//
        void m2(){
            System.out.println("Inner class (non static method) accessing (non-static)outer class variable directly: "+Outer_X);//acts like an instance variable(Outer_X)//
              System.out.println("Inner class (non static method) accessing (static)outer class variable directly: "+Outer_X_static);//acts like an instance variable(Outer_X)//
            }
          
         //static area//   
        static void m3(){
            System.out.println("Inner class (static) accessing (static) outer class variable directly: "+Outer_X_static);//acts like an instance variable(Outer_X_static)//
            
        }
       
    }
     void m1(){
        Inner i = new Inner();
        System.out.println("Outer class accessing innner class variable(instance members) through object instatiation of inner class: "+i.inner_X); 
    }
}
   

class Prog2{
    public static void main(String[]args){
        Outer.Inner x =new Outer().new Inner();//This is 
        
        x.m2();
        x.m3();
        // Inner x = new Inner(); this is wrong//
        Outer y = new Outer();
        y.m1();
    }
}

// In summary, the accessibility is as follows:

// Non-static inner class methods can access both static and non-static outer class variables directly.
// Static inner class methods can access only static outer class variables directly.
// Outer class methods can access inner class instance variables through object instantiation.
//The name of this propgrams class file will be Outer$inner.class//POINT TO REMEMBER//