package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class zuoye7_1 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("欢迎使用批量文件管理器");
            System.out.println("输入1：按关键字检索文件");
            System.out.println("输入2：按后缀名检索文件");
            System.out.println("输入3：删除文件/目录");
            System.out.println("输入4：退出");
            int n = s.nextInt();
            if (n == 1) {
                getFilesBykey();
            } else if (n == 2) {
                getFilesByhouzhui();
            } else if (n == 3) {
                delete();
            } else if (n == 4) {
                break;
            }
        }
    }

    public static void getFilesBykey() {
        System.out.println("请输入要检索的目录");
        String path = s.next();
        System.out.println("请输入要检索的关键字");
        String key = s.next();
        File file = new File(path);
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File currFile = new File(dir, name);
                //if (currFile.isFile() && name.endsWith(".java")){
                if (currFile.isFile() && name.contains(key)) {
                    return true;
                } else {

                    return false;
                }
            }
        };
        if (file.exists() && file.isDirectory()) {
            String[] list = file.list(filter);
            for (String name : list) {
                System.out.println(name);
            }
        }
    }

    public static void getFilesByhouzhui() {
        System.out.println("请输入要检索的目录");
        String path = s.next();
        System.out.println("请输入要检索的后缀文件");
        String key = s.next();
        File file = new File(path);
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File currFile = new File(dir, name);
                if (currFile.isFile() && name.endsWith(key)) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        if (file.exists() && file.isDirectory()) {
            String[] list = file.list(filter);
            for (String name : list) {
                System.out.println(name);
            }
        }
    }

    public static void delete() {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要删除的目录:");
        String delPath = in.next();  // 从控制台获取源路径
        File dir = new File(delPath); // 创建File对象,将用户输入的数存入File对象中
        if (dir.exists()) {   // 判断传入的File对象是否存在
            // public File[] listFiles():返回此抽象路径名表示的目录中文件和目录的File对象数组
            File[] files = dir.listFiles();  //得到File数组
            for (File file : files) {  // 遍历所有的子目录和文件
                if (file.isDirectory()) {  // 判断是否是目录
                    delete();  // 如果是目录,递归调用sc()
                } else {
                    // delete() :删除由此抽象路径名表示的文件和目录
                    file.delete();  // 如果是文件直接删除
                }
            }
            // 删除完一个目录里的所有内容,就删除这个目录
            dir.delete();
        }
    }
}