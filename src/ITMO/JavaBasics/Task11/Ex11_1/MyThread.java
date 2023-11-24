package ITMO.JavaBasics.Task11.Ex11_1;

public class MyThread extends Thread{
    int countNumber;

    public MyThread(int countNumber){
        this.countNumber = countNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < countNumber; i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }

    public static void createThreads(int countThreads, int countNumber)
    {
        for (int i = 0; i < countThreads; i++) {
            MyThread myThread = new MyThread(countNumber);
            myThread.start();
        }
    }


}
