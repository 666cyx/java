package zhan;

public class Main2 {
    public static void main(String[] args) {
        LinkedListStack stack=new LinkedListStack();
        System.out.println(stack);
        System.out.println("是否为空："+stack.isEmpty());
        stack.push("aaa");
        stack.push("bbb");
        stack.push("ccc");
        stack.push("ddd");
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
}
