// . Overload the constructors for class Box for cube and cone and also display its volume.
class Box{
    double volume;
    //constructor for cube//
    Box(double side){
        volume=Math.pow(side,3);
    }
    //constructor for cone//
    Box(double height,double radius){
        volume=(1.0/3)*3.1415*radius*radius*height;
    }
}
class Prog2{
    public static void main(String[]args){
        Box cube=new Box(3.0);
        System.out.println(cube.volume);
        Box cone = new Box(56.0,45.0);
        System.out.println(cone.volume);
    }
}
