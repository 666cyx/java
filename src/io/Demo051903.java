package io;

import java.io.*;

public class Demo051903 {
    public static void main(String[] args) throws Exception {
   long begin=System.currentTimeMillis();
        InputStream in = new FileInputStream("D:\\temp\\新能源车.docx");
        OutputStream out =new FileOutputStream("D:\\temp\\新能源车222.docx");
        int len;
        while ((len=in.read())!=-1){
            out.write(len);
        }
        in.close();
        out.close();
        long end=System.currentTimeMillis();
        System.out.println("总共耗时："+(end-begin)+"毫秒");
    }
}
