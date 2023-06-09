package duoxiancheng;

public class Demo04 {
    public static void main(String[] args) {
        TicketWindow02 tw = new TicketWindow02();
        new Thread(tw, "窗口1").start();
        new Thread(tw, "窗口2").start();
        new Thread(tw, "窗口3").start();
        new Thread(tw, "窗口4").start();

    }
}

class TicketWindow02 implements Runnable {
    private int ticketc = 10;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (ticketc > 0) {
                String name = Thread.currentThread().getName();
                System.out.println(name + "：正在发售票" + ticketc-- + "张票");
            }
        }
    }
}