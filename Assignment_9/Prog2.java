// Implement a class from Runnable and override the run( ) method. Inside run( ), print full qualified name of thread, and then call 
// sleep( ). Repeat this three times, then return from run( ). Put a start-up message in the constructor. Make your thread object and 
// main thread run to see what happens.
class MyThread implements Runnable{
    public void run(){
        for(int i=0;i<3;i++){
        System.out.println(Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        }
    }
} 
class Prog2{
    public static void main(String[]args){
        MyThread t = new MyThread();
        Thread t1 = new Thread(t);
        t1.start();
        System.out.println("Main thread");
    }
}