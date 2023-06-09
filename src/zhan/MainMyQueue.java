package zhan;

public class MainMyQueue {
    public static void main(String[] args) throws Exception {

    MyQueue myQueue=new MyQueue(5);
        System.out.println("队列是否为空："+myQueue.isEmpty());
        System.out.println("队列是否满了："+myQueue.isFull());
        myQueue.addQueue(50);
        myQueue.addQueue(40);
        myQueue.addQueue(30);
        myQueue.addQueue(20);
        myQueue.addQueue(10);
        myQueue.addQueue(500);
        myQueue.addQueue(600);
        System.out.println("队列是否为空："+myQueue.isEmpty());
        System.out.println("队列是否满了："+myQueue.isFull());
        System.out.println(myQueue);
        myQueue.goQueue();
        myQueue.goQueue();
        myQueue.goQueue();
        myQueue.goQueue();
        myQueue.goQueue();
        System.out.println(myQueue);
        myQueue.addQueue(50);
        System.out.println(myQueue);
    }
}
