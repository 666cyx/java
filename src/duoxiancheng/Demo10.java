package duoxiancheng;

import sj.Dog;

public class Demo10 {
    public static void main(String[] args) {
        SaleThread saleThread = new SaleThread();
        new Thread(saleThread, "窗口1").start();
        new Thread(saleThread, "窗口2").start();
        new Thread(saleThread, "窗口3").start();
        new Thread(saleThread, "窗口4").start();

    }
}

class SaleThread implements Runnable {
    private int tickets = 10;
    Object lock = new Object();
    //Dog dog = new Dog();

    @Override
    public void run() {
        while (true) {
            //synchronized (dog) {
               synchronized (lock) {
                    if (tickets > 0) {
                        System.out.println(Thread.currentThread().getName() + "--卖出的票" + tickets--);
                    } else {
                        break;
                    }
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
//}