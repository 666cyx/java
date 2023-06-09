package guess;

import java.util.Scanner;

public class Person {
    public String name;
    public int score;
    public int chuquan(){
        Scanner s = new Scanner(System.in);
        System.out.println("请出拳：1.石头 2.剪刀 3.布");
        int n = s.nextInt();
        if (n==1){
            System.out.println("你出拳：石头");
        }else if (n==2){
            System.out.println("你出拳：剪刀");

        }else if (n==3){
            System.out.println("你出拳：布");

        }else {
            System.out.println("你出拳：输入错误");

        }
return n;
    }
}
