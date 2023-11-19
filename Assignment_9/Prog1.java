// Inherit a class from Thread and override the run( ) method. Inside run( ), print name of thread , and then call sleep( ). Repeat this 
// three times, then return from run( ). Put a start-up message in the constructor. Make your thread object and main thread run to see 
// what happens. 
class MyThread extends Thread{
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
    MyThread(){
        System.out.println("Thread Started");
    }
}
class Prog1{
    public static void main(String[]args){
        MyThread t = new MyThread();
        t.start();
        System.out.println("main Thread");
    }
}