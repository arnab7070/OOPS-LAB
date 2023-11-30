import java.util.LinkedList;
import java.util.Iterator;
class prog4{
    public static void main(String[]args){
        LinkedList<Integer>l1=new LinkedList<Integer>();
        l1.add(3);
        l1.add(-3);
        l1.add(2);
        l1.add(24);
        l1.add(22);
        Iterator it = l1.descendingIterator();
        int count=l1.size()-1;
        while(it.hasNext()){
            System.out.println(it.next()+"-->"+count);
           
            count--;
        }
    }
}