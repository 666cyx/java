package cyx;

import java.util.Scanner;

public class Demo2 {
   /* public static void main(String[] args) {
        String s="zxcvb";
        System.out.println("长度:"+s.length());
        System.out.println(s.charAt(1));
    }*/

    /*public static void main(String[] args) {
        String str="我王者无敌";
      for (int i=0;i<str.length();i++){
          System.out.println(str.charAt(i));
      }


    }*/

    /*public static void main(String[] args) {
        String str="我王者无敌";
        for (int i=str.length()-1;i>-1;i--){
            System.out.println(str.charAt(i));
        }


    }*/


    public static void main(String[] args) {
        String user = "abc";
        String pass = "123";
        Scanner s =new Scanner(System.in);

        for (int i=3;i>0;i--) {
            System.out.println("请输入用户名：");
            String user1 = s.next();
            System.out.println("请输入密码：");
            String pass1 =s.next();
            System.out.println("输入的用户名："+user1+"输入的密码："+pass1);
            if (user1.equals(user) && pass1.equals(pass)) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("登陆失败，请确认输入用户名与密码是否正确,你还有"+(i-1)+"次机会");

                //break;

            }
        }
    }
}
