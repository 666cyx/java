package zhan;

public class MainStack {
    public static void main(String[] args) {
        MyArrayStack stack = new MyArrayStack(5);
        System.out.println(stack);
        System.out.println("栈是否满了?"+stack.isFull());
        System.out.println("栈是否空了?"+stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println(stack);
        System.out.println("栈顶的元素："+stack.getTopValue());
        System.out.println("出栈，弹出的元素："+stack.pop());
        System.out.println("出栈，弹出的元素："+stack.pop());
        System.out.println("出栈，弹出的元素："+stack.pop());
        System.out.println(stack);
        System.out.println("此时栈顶的元素："+stack.getTopValue());

    }

}
