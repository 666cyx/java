package cyx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
//ArrayList集合
public class Demo3 {
    /* public static void main(String[] args) {
         ArrayList list = new ArrayList();
         list.add("张三");
         list.add("李四");
         list.add("王五");
         list.add("赵六");
         System.out.println("集合的长度："+list.size());

         System.out.println("第2个元素是："+list.get(1));
     }
 }*/
    //LinkedList集合
    /*public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.add("张三");
        link.add("李四");
        link.add("王五");
        link.add("赵六");
        System.out.println(link.toString());
 link.add(3,"Student");
 link.addFirst("First");
        System.out.println(link);
        System.out.println(link.getFirst());
        link.remove(3);
        link.removeFirst();
        System.out.println(link);
    link.remove("Student");

        System.out.println(link);
    }
}*/
    //Iterator接口
    /*public static void main(String[] args) {
ArrayList list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}*/
    //foreach循环
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        //普通for
        for (int i = 0; i < list.size(); i++) {
            String s = (String) list.get(i);
            System.out.println(s);
        }
//增强for
        for (String s : list) {
            System.out.println(s);
        }
    }
}
        //迭代循环
   /* public static void main(String[] args) {

    }
}*/







