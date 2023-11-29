import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
class prog2{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        List <Integer>l2=new LinkedList<Integer>();
        for(int i=0;i<5;i++){
            int temp=sc.nextInt();
            l2.add(temp);
        }
        Collections.sort(l2);
        System.out.println(l2);
    }
}