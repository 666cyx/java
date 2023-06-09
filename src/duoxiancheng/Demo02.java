package duoxiancheng;

import java.util.Random;

public class Demo02 {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2);
        thread.start();
        while (true) {
            Thread.sleep(1000);
            System.out.println("Main方法在运行");
        }
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MyThread类的run方法在运行");
        }
    }
}