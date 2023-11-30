import java.util.Vector;
import java.util.Iterator;
class prog7{
    public static void main(String[]args){
        Vector<String>v= new Vector<String>();
        for(String arg:args){
            v.add(arg);
        }
        System.out.println("The vector itself:");
        System.out.println(v);
        String[]str_array= new String[v.size()];
        Iterator it= v.iterator();
        int count=0;
        while(it.hasNext()){
            str_array[count]=(String)it.next();
            count++;
        }
        int count2=1;
        for(String str:str_array){
            System.out.println("String "+count2+": "+str);
            count2++;
        }
    }
}