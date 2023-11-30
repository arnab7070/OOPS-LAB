import java.util.Vector;
class prog8{
    public static void main(String[]args){
        Vector<String>v= new Vector<String>();
        for(String arg:args){
            v.add(arg);
        
        }
        System.out.println(v);

    }
}