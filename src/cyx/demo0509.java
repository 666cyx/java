package cyx;

import java.util.*;

public class demo0509 {
    public static void main(String[] args) {/*
        HashMap<String,String> map=new HashMap();
        map.put("1","张三");
        map.put("2","李四");
        map.put("3","王五");
        Set keySet=map.keySet();
        Iterator it=keySet.iterator();
        while (it.hasNext()){
            Object key=it.next();
            Object value=map.get(key);
            System.out.println(key+":"+value);
        }
        System.out.println("-----------------");
  for (Map.Entry<String,String> entry:map.entrySet()){
      System.out.println(entry.getKey()+"-----增强for----"+entry.getValue());
  }*/
        HashMap<String,String>map=new HashMap<>();
        map.put("apple","苹果");
        map.put("banana","香蕉");
        map.put("orange","橙子");
        Scanner s=new Scanner(System.in);
        System.out.println("请输入需要翻译的单词");
        String s1=s.next();
        boolean flag=false;
        for (Map.Entry<String,String>entry:map.entrySet()){
            if (entry.getKey().equals(s1)){
                System.out.println(s1+"的中文翻译是："+entry.getValue());
                flag=true;
            }else if (entry.getValue().equals(s1)){
                System.out.println(s1+"的英文是："+entry.getKey());
            flag=true;
            }
        }
        if (flag==false){
            System.out.println("没有找到这个单词");
        }
    }
}
