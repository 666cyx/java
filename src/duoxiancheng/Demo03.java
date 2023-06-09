package duoxiancheng;

public class Demo03 {
    public static void main(String[] args) {
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();

    }
}

class TicketWindow extends Thread {
    private int ticketc = 10;

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