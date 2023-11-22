// // Implement program of locking of common method by several threads. (Using the keyword ‘synchronized’).

// class SharedResource {
//     synchronized void printNumbers(int n) {
//         for(int i = 1; i <= n; i++) {
//             System.out.println(Thread.currentThread().getId() + " : " + i);
//             try {
//                 Thread.sleep(400);
//             } catch(Exception e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// class MyThread extends Thread {
//     SharedResource t;
//     MyThread(SharedResource t) {
//         this.t = t;
//     }
//     public void run() {
//         t.printNumbers(5);
//     }
// }

// public class Prog5 {
//     public static void main(String args[]) {
//         SharedResource obj = new SharedResource();
//         MyThread t1 = new MyThread(obj);
//         MyThread t2 = new MyThread(obj);
//         // Because the printNumbers method is synchronized, only one thread can access it at a time. 
//         // If one thread is executing this method, the other thread has to wait until the first thread has finished.
//         // Henche first t1.start() will finish while t2.start() is in wait then after completion of t1.start() t2.start() will begin.
//         t1.start();
//         t2.start();
//     }
// }

class Counter {
    int count = 0;
    // make this method synchronized so that only one thread will execute this at a time
    public synchronized void increment() {
        count++;
    }
}
class MyThread implements Runnable {
    Counter object;
    MyThread(Counter object) {
        this.object = object;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            object.increment();
        }
    }
}
public class Prog5 {
    public static void main(String[] args) {
        Counter obj = new Counter();
        MyThread t = new MyThread(obj);
        Thread object = new Thread(t);
        Thread object2 = new Thread(t);
        object.start();
        object2.start();
        try {
            object.join(); // it will wait until thread object finishes its work
            object2.join();
        } catch (InterruptedException e) { // we must wrap this in try catch block as it throws InterruptedException
            System.out.println(e);
        }
        System.out.println("Counter Value: " + obj.count);
    }
}