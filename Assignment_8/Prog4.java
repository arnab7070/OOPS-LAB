// Define an object reference and initialize it to null. Try to call a method through this reference. Now wrap the code in a try catch clause to catch the exception.

class Prog4{
    public static void main(String[]args){
        try{
            Object o= null;//define an object reference as null;
        System.out.println(o.hashCode());
        }
        catch(NullPointerException e){
            System.out.println("Exception Message: "+e.getMessage());
        }
    }
}