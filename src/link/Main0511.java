package link;

public class Main0511 {
    public static void main(String[] args) {
        MyLinkeList list=new MyLinkeList();
        System.out.println(list.isEmpty());
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        System.out.println(list);
        System.out.println("长度"+list.length());
        System.out.println(list.getNode(2));
        list.show();
        list.remove(1);
        list.show();

    }
}
