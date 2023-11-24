package ITMO.JavaBasics.Task11.Ex11_2;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + Thread.currentThread().getState() + " - " + i);
        }
    }

    public void statusProcess(MyThread myThread) {
        System.out.println(myThread.getName() + " - " + myThread.getState());
    }

    public static void createThreads(int countThreads) {
        for (int i = 0; i < countThreads; i++) {
            MyThread myThread = new MyThread();
            myThread.statusProcess(myThread);
            myThread.start();
            myThread.statusProcess(myThread);
        }
    }


}
