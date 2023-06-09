package fanshe;

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> c1 = null;
        Class<?> c2 = null;
        Class<?> c3 = null;
        c1 = Class.forName("fanshe.Dog");
        c2 = new Dog().getClass();
        c3 = Dog.class;
        System.out.println("类名称：" + c1.getName());
        System.out.println("类名称：" + c2.getName());
        System.out.println("类名称：" + c3.getName());

    }
}
