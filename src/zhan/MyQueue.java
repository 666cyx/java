package zhan;

import java.util.Arrays;

public class MyQueue {
    private int head;
    private int tail;
    private int[] arr;


    public MyQueue() {
    }

    public MyQueue(int size){
        arr=new int[size];
        head=-1;
        tail=-1;
    }
    public boolean isFull(){
        if (tail==arr.length-1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if (tail==head){
            return true;
        }
        return false;
    }
    public void addQueue(int data){
        if (isFull()){
            System.out.println("队列满了，不能再加:"+data);
            return;
        }
        tail++;
        arr[tail]=data;
    }
    public void goQueue() throws Exception{
        if (isEmpty()){
            System.out.println("队列为空，不能出队");
            throw new Exception("队列为空，不能出队");
        }
        head++;
        System.out.println(arr[head]+",这个数据出队");
        arr[head]=0;
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "head=" + head +
                ", tail=" + tail +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
