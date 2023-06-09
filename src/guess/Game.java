package guess;

import java.util.Scanner;

public class Game {
private Compute compute = new Compute();
private Person person = new Person();
private Scanner scanner = new Scanner(System.in);
        public void srartGame(){

            init();
            choiseRole();
            guess();
            showResult();
        }
public void init(){
    System.out.println("----------------欢迎来到游戏世界--------------");
    System.out.println("**   猜拳  开始   **");
    System.out.println("*********************");

}
public void choiseRole(){

    System.out.println("请选择对方角色：（1.刘备 2.孙权 3.曹操）");
int i = scanner.nextInt();
if (i==1){
    compute.name="刘备";
}else
if (i==2){
    compute.name="孙权";
    }else
if (i==3){
    compute.name="曹操";
}else {
    compute.name="输入错误";

}
person.name="孤煞星";
    System.out.println("双方对战:"+compute.name+"VS"+person.name);
        }
    public void guess(){

       int n1 =person.chuquan();
int n2 = compute.chuquan();
if (n1==n2){
    System.out.println("平局");
}else if ((n1==1&&n2==2)||(n1==2&&n2==3)){
    System.out.println("恭喜你赢了");
    person.score++;
}else {
    System.out.println("抱歉，你输了");
    compute.score++;
}

        }
public void showResult(){
    System.out.println("最后展示结果");
}




}
