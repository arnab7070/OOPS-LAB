import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;
class prog9{
    public static void main(String[]args){
        List<Integer>l1= new LinkedList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println(l1);//1 2 3
        System.out.println("Deleting an item from the list");
        l1.remove(1);
        System.out.println(l1);//1 3
        System.out.println("Add an item at a specified location in the list.");
        l1.add(1,5);//1 5 3
        l1.add(2,6);//1 5 6 3
        System.out.println(l1);
        System.out.println(" Add an item at the end of the list.");
        l1.add(23);//1 5 6 3 23
        System.out.println(l1);
        System.out.println("Print the contents of the vector.");
        System.out.println(l1);
    }
}
