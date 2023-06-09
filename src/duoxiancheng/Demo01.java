package duoxiancheng;

public class Demo01 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        while (true) {
            Thread.sleep(1000);
            System.out.println("Main方法在运行");
        }
    }
}

class MyThread extends Thread {
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