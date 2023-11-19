class Outer{
    int x=10;
    class Inner{
        int y=5;
        void m1(){
            System.out.println("Inner class acessing outer class variable directly: "+x);
        }
    }
    void m2(){
        Inner i=new Inner();
        System.out.println("Outer class acessing inner class varible through instantiation of an object of inner class in it's method:"+i.y);
    }
}
class Outer_Inner{
    public static void main(String[]args){
        Outer.Inner obj = new Outer().new Inner();
        obj.m1();
        Outer obj1 = new Outer();
        obj1.m2();
    }
}