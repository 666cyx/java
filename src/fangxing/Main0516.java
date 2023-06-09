package fangxing;

import java.util.ArrayList;

public class Main0516 {
    public static void main(String[] args) {
        Box<String>box=new Box();
        box.setT("我是字符串");
        System.out.println(box.getT());
        Box<Integer>box2=new Box();
        box2.setT(5);
        System.out.println(box2.getT());
        ArrayList<String> List=new ArrayList();
    }
}
