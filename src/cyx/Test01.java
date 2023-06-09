package cyx;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test01 {
    private static ArrayList<Student> list =new ArrayList();
    private static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        init(); //初始化数据
        int n = 0;
        while (n != 5){
            show();//展示首页功能菜单
            System.out.println("请选择菜单：");
            n = s.nextInt();
            if (n == 1) {
                queryAllStudent();//查询所有的学生
            } else if (n == 2) {
                System.out.println("添加");
                add();//添加学生
            } else if (n == 3) {
                System.out.println("删除");
                delete();
            } else if (n == 4) {
                System.out.println("修改");
                update();
            } else {
                System.out.println("输入错误，请重新输入");
            }
        }
    }//初始化数据
    public static void init() {
        list.add(new Student(1001,"乾",19,"官塘大道16号"));
        list.add(new Student(1002,"坤",18,"官塘大道16号"));
        list.add(new Student(1003,"未",19,"官塘大道16号"));
        list.add(new Student(1004,"定",18,"官塘大道16号"));
    }

    public static void show() {
        System.out.println("--------------欢迎使用学生系统------------");
        System.out.printf("系统功能如下：");
        System.out.printf("1.查询");
        System.out.printf("2.添加功能");
        System.out.printf("3.删除功能");
        System.out.printf("4.修改功能");
        System.out.printf("5.退出");

    }
    //查询所有的学生
    public static void queryAllStudent() {
        for(int i=0;i<list.size();i++){
            Student student=list.get(i);//alt+回车 自动补齐代码
            System.out.println("第"+i+"个元素："+student);
        }
    }
    //添加学生
    public static void add(){
        System.out.println("添加学生，请输入学号：");
        int id=s.nextInt();
        //学号是否存在，不存在才新增，存在就退出
        for(Student student:list){
            if (student.getStudentID()==id){
                System.out.println("学号已经存在，请重新输入");
                return;//方法直接结束
            }
        }
        System.out.println("添加学生，请输入姓名：");
        String name=s.next();
        System.out.println("添加学生，请输入年龄：");
        int age=s.nextInt();
        System.out.println("添加学生，请输入地址：");
        String addr=s.next();
        //创建学生对象
        Student s=new Student(id,name,age,addr);
        //把学生对象装入集合
        list.add(s);
    }
    public  static void delete(){
        System.out.println("删除学生，请输入学号：");
        int id=s.nextInt();
        Iterator<Student> it=list.iterator();
        while (it.hasNext()){
            Student student=it.next();
            if (student.getStudentID()==id){
                it.remove();
                System.out.println("成功删除");
            }
        }
    }
public static void update(){
    System.out.println("修改学生，请输入学号：");
    int id =s.nextInt();
    for (Student student:list){
        if (student.getStudentID()==id){
            System.out.println("修改学生，请输入姓名：");
            String newnName=s.next();
            System.out.println("修改学生，请输入年龄：");
            int newAge=s.nextInt();
            System.out.println("修改学生，请输入地址：");
            String newAddr=s.next();
            student.setName(newnName);
            student.setAge(newAge);
            student.setAddr(newAddr);
        }
    }
}
}

