package zhan;

import java.util.Arrays;

public class MyArrayStack {
    private  int[] stack;
    private int top=-1;

    public MyArrayStack(int maxSize) {
    stack=new int[maxSize];

    }
public boolean isFull(){
        if (top==stack.length-1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if (top==-1){
            return true;
        }
        return false;
    }
public void push(int value){
        if (isFull()){
            System.out.println("栈满了，不能再加");
            return;
        }
        top++;
        stack[top]=value;
}
public int getTopValue(){
        if (isEmpty()){
            System.out.println("栈空，没有栈顶元素");
            return -1;
        }
        return stack[top];
}
public int pop(){
        if (isEmpty()){
            System.out.println("栈空，无法弹出元素");
        return -1;
        }
        int value =stack[top];
        stack[top]=0;
        top--;
return value;
    }


    @Override
    public String toString() {
        return "MyArrayStack{" +
                "stack=" + Arrays.toString(stack) +
                ", top=" + top +
                '}';
    }
}
