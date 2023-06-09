package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo051904 {
    public static void main(String[] args) throws Exception {
        long begin=System.currentTimeMillis();
        InputStream in = new FileInputStream("D:\\temp\\新能源车.docx");
        OutputStream out =new FileOutputStream("D:\\temp\\新能源车222.docx");
        byte[]buff=new byte[1024];
        int len;
       /* len=in.read(buff);
        System.out.println(len);
        System.out.println(buff);*/
        while ((len=in.read(buff))!=-1){
            out.write(buff,0,len);
        }
        in.close();
        out.close();
        long end=System.currentTimeMillis();
        System.out.println("总共耗时："+(end-begin)+"毫秒");
    }
}
