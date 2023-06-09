package zhan;

import zhan.Node;

public class LinkedListStack {
    Node head=new Node();
    public boolean isEmpty(){
        if (head.next==null){
            return  true;
        }
        return false;
    }
    public void push(String data){
        Node newNode=new Node();
        newNode.data=data;
        newNode.next=head.next;
        head.next=newNode;

    }
    public void pop(){
        if(isEmpty()){
            throw  new RuntimeException("栈空，没有数据");
        }
        head.next=head.next;
    }

    @Override
    public String toString() {
        return "LinkedListStack{" +
                "head=" + head +
                '}';
    }
}
