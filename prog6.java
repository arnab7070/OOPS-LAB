import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
class prog6{
    public static void main(String[]args){
        LinkedList<Integer>l1= new LinkedList<Integer>();
        l1.add(2);
        l1.add(4);
        l1.add(56);
        l1.add(24);
        l1.add(256);
        Scanner sc= new Scanner(System.in);

        while(true){
                    int n= sc.nextInt();
              if(Collections.binarySearch(l1,n)>0){
            System.out.println("Found");
            break;
        }
        else{
            System.out.println("NOT FOUND");
        }
        }
      
    }
}
