import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
class prog5{
    public static void main(String[]args)
    {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer>l1= new LinkedList<Integer>();
        for(int i=0;i<n;i++){
           int temp=sc.nextInt();
            l1.add(temp);
        }
        System.out.println("1st swap position");
        int swap1=sc.nextInt();
        
        System.out.println("2nd swap position");
        int swap2=sc.nextInt();
        if(swap1>n || swap1<0 || swap2>n || swap2<0){
            System.out.println("Invalid Input");
        }
        else{
            Iterator it = l1.iterator();
    int count=0;
    Object o1=null;
    Object o2=null;
        while(it.hasNext())
        {
            Object temp=it.next();
         
            if(count==swap1){
               o1=temp;
        
            }
            if(count== swap2){
                o2=temp;
            }
               count++;
        }
        System.out.println(o1+" "+o2);
        System.out.println(l1);
        l1.remove(swap1);
        l1.add(swap1,(int)o2);
        l1.remove(swap2);
        l1.add(swap2,(int)o1);
        System.out.println(l1);
        }
        
    }
}