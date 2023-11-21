// class MyThread extends Thread {
//     public void run() {
//         System.out.println("Child Thread");
//         try {
//             Thread.sleep(2000);
//         } catch (InterruptedException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

// public class Prog3 {
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//         t1.setPriority(10); // Correct method name
//         t1.start();
//         MyThread t2 = new MyThread();
//         t2.setPriority(2); // Correct method name
//         t2.start();
//         MyThread t3 = new MyThread();
//         t3.setPriority(4); // Correct method name
//         t3.start();
//         MyThread t4 = new MyThread();
//         t4.setPriority(5); // Correct method name
//         t4.start();
//         MyThread t5 = new MyThread();
//         t5.setPriority(1); // Correct method name
//         t5.start();

//         System.out.println("Main Thread");
//     }
// }


// Make several threads (say 5) with names (by extending thread), set their priority and run them to see what happens.
class Test3 extends Thread {
	Test3(String threadName, int priority) {
		super(threadName); // thread created with my custom name
		setPriority(priority);
	}
	@Override
	public void run() {
		try{
			System.out.println("Current Thread: "+Thread.currentThread().getName());
			sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}

public class Prog3 {

    public static void main(String[] args) {
        Test3 t1 = new Test3("Thread 1",Thread.MIN_PRIORITY); // 1
	  	Test3 t2 = new Test3("Thread 2",Thread.NORM_PRIORITY); // 5
	  	Test3 t3 = new Test3("Thread 3",Thread.MAX_PRIORITY); // 10
	  	Test3 t4 = new Test3("Thread 4", 7);
	  	Test3 t5 = new Test3("Thread 5", 3);
	  	t1.start(); t2.start(); t3.start(); t4.start(); t5.start();
    }
}