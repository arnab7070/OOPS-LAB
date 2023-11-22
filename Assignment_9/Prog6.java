// // Write a program to use join() and isAlive() in Multi-Threading.Inter thread communication :Consumer consumes item produced 
// // by Producer with proper synchronization.
// class ProducerConsumer {
//     int num;
//     boolean valueSet = false;
//     synchronized int get() {
//         while(!valueSet)
//             try {
//                 wait();
//             } catch(InterruptedException e) {
//                 System.out.println("InterruptedException caught");
//             }
//         System.out.println("Got: " + num);
//         valueSet = false;
//         notify();
//         return num;
//     }
//     synchronized void put(int num) {
//         while(valueSet)
//             try {
//                 wait();
//             } catch(InterruptedException e) {
//                 System.out.println("InterruptedException caught");
//             }
//         this.num = num;
//         valueSet = true;
//         System.out.println("Put: " + num);
//         notify();
//     }
// }

// class Producer implements Runnable {
//     ProducerConsumer pc;
//     Producer(ProducerConsumer pc) {
//         this.pc = pc;
//         new Thread(this, "Producer").start();
//     }
//     public void run() {
//         int i = 0;
//         while(true) {
//             pc.put(i++);
//             try {
//                 Thread.sleep(1000);
//             } catch(Exception e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// class Consumer implements Runnable {
//     ProducerConsumer pc;
//     Consumer(ProducerConsumer pc) {
//         this.pc = pc;
//         new Thread(this, "Consumer").start();
//     }
//     public void run() {
//         while(true) {
//             pc.get();
//             try {
//                 Thread.sleep(1000);
//             } catch(Exception e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// public class Prog6 {
//     public static void main(String args[]) {
//         ProducerConsumer pc = new ProducerConsumer();
//         new Producer(pc);
//         new Consumer(pc);
//     }
// }

class MyClass {
    private int num;
    boolean valueSet = false;

    // when we are using wait or notify we must use synchronized keyword to that method
    public synchronized void set(int num) {
        while (valueSet) {
            try {
                wait(); // it will wait for the consumer to consume
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Put: " + num);
        this.num = num;
        valueSet = true;
        notify();
    }

    public synchronized void get() {
        while (!valueSet) {
            try {
                wait(); // it will wait for the producer to produce
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Get: " + num);
        valueSet = false;
        notify();
    }
}

class Producer implements Runnable {
    MyClass obj;

    Producer(MyClass obj) {
        this.obj = obj;
        Thread t = new Thread(this, "Producer"); // Creating a thread for producer class
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            obj.set(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Consumer implements Runnable {
    MyClass obj;

    Consumer(MyClass obj) {
        this.obj = obj;
        Thread t = new Thread(this, "Consumer"); // Creating a thread for consumer class
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            obj.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class Prog6 {
    public static void main(String[] args) {
        MyClass object = new MyClass();
        new Producer(object);
        new Consumer(object);
    }
}