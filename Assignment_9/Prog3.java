class MyThread extends Thread {
    public void run() {
        System.out.println("Child Thread");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Prog3 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setPriority(10); // Correct method name
        t1.start();
        MyThread t2 = new MyThread();
        t2.setPriority(2); // Correct method name
        t2.start();
        MyThread t3 = new MyThread();
        t3.setPriority(4); // Correct method name
        t3.start();
        MyThread t4 = new MyThread();
        t4.setPriority(5); // Correct method name
        t4.start();
        MyThread t5 = new MyThread();
        t5.setPriority(1); // Correct method name
        t5.start();

        System.out.println("Main Thread");
    }
}
