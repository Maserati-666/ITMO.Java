package ITMO.JavaBasics.Task11.Ex11_3;

import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread {
    CountDownLatch latch;
    int countThread;
    int countNumber;
Counter counter;
    public MyThread(Counter counter, CountDownLatch c, int countThread, int countNumber){
        this.counter = counter;
        this.latch = c;
        this.countThread = countThread;
        this.countNumber = countNumber;
    }


    @Override
    public void run() {
        synchronized (counter) {
            for (int i = 0; i < countNumber; i++) {
                counter.increment();
                latch.countDown();
            }
        }
    }
    public static void printCount(int countThread, int countNumber){
        Counter counter = new Counter();
        CountDownLatch cdl = new CountDownLatch(countThread * countNumber);
            for (int i = 0; i < countThread; i++) {
                MyThread myThread = new MyThread(counter, cdl, countThread, countNumber);
                myThread.start();
            }
        try {
            cdl.await();
        } catch (InterruptedException exc) {
            System.out.println(exc.getMessage());
        }
        System.out.println(counter.getCount());
        }
}
