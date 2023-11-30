import java.util.Random;
class prog3{
    public static void main(String[]args){
        for(String s:args){
            System.out.println(s+" ");
        }
        shuffleOrder(args);
        for(String s1:args){
            System.out.println(s1+" ");
        }
    }
    public static void shuffleOrder(String[]arr){
        Random r = new Random();
        for(int i=arr.length-1;i>=0;i--){
            int j=r.nextInt(i+1);
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
