import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;
class prog1{
    public static void main(String[]args){
       List<Integer>l1=new ArrayList<Integer>();
    Scanner sc= new Scanner(System.in);
   int n=sc.nextInt();
    for(int i=0;i<n;i++){
        
        int temp=sc.nextInt();
        l1.add(temp);
    }
    int sum=0;
    Iterator<Integer> it = l1.iterator();
   
    while(it.hasNext()){
        sum=sum+it.next();
    }
    System.out.println(sum);
    }

}