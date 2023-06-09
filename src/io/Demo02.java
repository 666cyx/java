package io;

import java.io.File;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        File f =new File("D:\\temp222\\567.txt");
        System.out.println(f.getParentFile());
        if (!(f.getParentFile().exists())){
            f.getParentFile().mkdir();
        }
        if (!f.exists()){
            System.out.println("创建文件："+f.createNewFile());
        }
    }
}
