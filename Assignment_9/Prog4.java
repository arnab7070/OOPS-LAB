// Make several threads (say 5) with their names (implementing Runnable) set their priority and run them to see what happens.//
class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Current Thread: " + Thread.currentThread().getName());
    }
}
class Prog4{
    public static void main(String[]args){
    MyRunnable r = new MyRunnable();
    Thread t1 = new Thread(r);//Target to runnable object r//
    Thread t2 = new Thread(r);
    Thread t3 = new Thread(r);
    Thread t4 = new Thread(r);
    Thread t5 = new Thread(r);
    t1.setPriority(3);
    t2.setPriority(2);
    t3.setPriority(4);
    t4.setPriority(6);
    t5.setPriority(10);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
}


}