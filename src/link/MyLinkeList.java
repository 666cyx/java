package link;

public class MyLinkeList {
    private Node head;
    private Node tail;
    public MyLinkeList(){
        head=new Node();
        head.value=null;
        head.next=null;
        tail=head;
    }
    public boolean isEmpty() {

        if (head.next == null) {
            return true;
        }
            return false;
        }


    public void add(String str){
        Node newNode=new Node();
        newNode.value=str;
        if (isEmpty()){
            head.next=newNode;
        }else {
            tail.next=newNode;
        }
tail=newNode;
}
public String getNode(int i){
        Node node=head.next;
        int index=0;
        while (node!=null){
            if (index==i){
                return node.value;
            }
            node=node.next;
            index++;

        }
        return  null;
}
public void remove(int i){
        if (isEmpty()){
            return;
        }
        int index=-1;
        Node node=head;
        while (node!=null){
            if (index==(i-1)){
            Node target=node.next;
            node.next=node.next.next;
            }
            node=node.next;
            index++;
        }
}
public int length(){
        int count=0;
        Node node=head.next;
        while (node!=null){
            count++;
            node=node.next;
        }
        return  count;
    }
    public void show(){
        int count=0;
        Node node=head.next;
        while (node!=null){
            count++;
            System.out.println("第"+count+"个元素:"+node.value+",");
            node=node.next;
        }
        System.out.println();
    }
    @Override
    public String toString() {
        return "MyLinkeList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
