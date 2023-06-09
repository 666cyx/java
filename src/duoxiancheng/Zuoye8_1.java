package duoxiancheng;

public class Zuoye8_1 {
    public static void main(String[] args) {
        new Wugui().start();
        new Tuzi().start();
    }
}

class Wugui extends Thread {
    public void run() {
        int wuguiDisTance = 0;
        for (int i = 0; i < 800; i++) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            wuguiDisTance++;
            System.out.println("乌龟进程：此时乌龟跑了：" + wuguiDisTance + "米");
        }

    }
}

class Tuzi extends Thread {
    public void run() {
        int tuziDisTance = 0;
        for (int i = 0; i < 800; i++) {
            if (tuziDisTance == 600) {

                try {
                    Thread.sleep(1200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("跑到600米，兔子胜利在望，先休息一下");
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (tuziDisTance >= 800) {
                break;
            }
            tuziDisTance = tuziDisTance + 2;
            System.out.println("兔子进程：此时兔子跑了：" + tuziDisTance + "米");
        }
    }
}