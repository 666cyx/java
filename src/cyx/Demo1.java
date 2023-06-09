package cyx;

public class Demo1 {
    public static void testFinally() {
String str="123a";
//包裹看你去发生错误的代码块
        try {
            int a = Integer.parseInt(str);
        }
        //包裹出现错误时处理的代码块
        catch (Exception e){
            e.printStackTrace();
            System.out.println("exception");
            return ;
        }
        //无论是否发生错误都会执行该代码块
        finally {

                System.out.println("finally end");
            }
            System.out.println("end");
        }

        public static void main(String[] args) {

testFinally();
        }
}
             //int a=1;
             //int b=2;
             //int c=a+b;
             //System.out.println("a+b="+c);
       //  System.out.println(a+"<"+b);
             //
 /*String str="123a";
 int a=Integer.parseInt(str);
System.out.println(a);
System.out.println("这是一个异常");
//
public class hello {
    public static void main(String[] args) {        System.out.println("Hello, World!");    }
}*/