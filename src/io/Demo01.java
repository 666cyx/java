package io;

import java.io.File;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        File f=new File("D:\\temp\\123.txt");
        System.out.println(f);
        System.out.println("文件是否存在："+f.exists());
        if (!f.exists()){
                f.createNewFile();
        }
        System.out.println(f.getName());
        System.out.println(f.getPath());
        System.out.println(f.getCanonicalPath());
        System.out.println("f是否文件"+f.isFile());
        System.out.println("f是否目录"+f.isDirectory());
        File f2 =new File("D:\\temp");
        System.out.println(f.getParentFile());
        System.out.println("f2是否文件"+f2.isFile());
        System.out.println("f2是否目录"+f2.isDirectory());
     String[] list =f2.list();
     for (String str :list){
         System.out.println(str);
     }
    }
}
