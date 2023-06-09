package sj;

public class Main {
    public static void main(String[] args) throws Exception {
        MyDogList List=new MyDogList();
        System.out.println("线性表长度"+ List.length());
        List.add(new Dog("旺财1"));
        List.add(new Dog("旺财2"));
        List.add(new Dog("旺财3"));
        List.add(new Dog("旺财4"));
        List.add(new Dog("旺财5"));
        List.add(new Dog("旺财6"));

        List.add(5,new Dog("土狗"));
        List.grow();
        Dog meimei=new Dog("妹妹");
        List.add(meimei);
        List.grow();
        System.out.println("------------");
        List.remove(meimei);
        List.grow();
    }
}
