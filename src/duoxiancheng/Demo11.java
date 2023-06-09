package duoxiancheng;

import sj.Dog;

public class Demo11 {
    public static void main(String[] args) {
        SaleThread2 saleThread = new SaleThread2();
        new Thread(saleThread, "窗口1").start();
        new Thread(saleThread, "窗口2").start();
        new Thread(saleThread, "窗口3").start();
        new Thread(saleThread, "窗口4").start();
    }
}

class SaleThread2 implements Runnable {
    private int tickets = 10;
    //Object lock = new Object();
    //Dog dog = new Dog();

    @Override
    public void run() {
        while (true) {
            saleTicket();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (tickets < 0) {
                break;
            }
        }
    }

    private synchronized  void saleTicket() {
        if (tickets > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()
                    + "--卖出的票:" + tickets--);
        }
    }
}