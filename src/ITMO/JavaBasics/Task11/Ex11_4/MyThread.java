package ITMO.JavaBasics.Task11.Ex11_4;

public class MyThread extends Thread {
    Object sync;

    public MyThread(Object sync) {
        this.sync = sync;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (sync) {
                System.out.println(Thread.currentThread().getName());
                sync.notify();
                try {
                    sync.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void printRezult() {
        Object sync = new Object();
        for (int i = 0; i < 2; i++) {
            MyThread myThread = new MyThread(sync);
            myThread.start();
        }
    }

}




