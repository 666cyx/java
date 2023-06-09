package duoxiancheng;

public class Demo05 {
    public static void main(String[] args) {
        Thread min = new Thread(new MinRun(), "优先级-低-的进程");
        Thread max = new Thread(new MinRun(), "优先级-高-的进程");
        min.setPriority(1);
        max.setPriority(10);
        min.start();
        max.start();
    }
}

class MaxRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "正在输出" + i);
        }
    }
}

class MinRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "正在输出" + i);

        }
    }
}
