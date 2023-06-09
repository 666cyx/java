package io;

import java.io.*;

public class Demo051905 {
    public static void main(String[] args) throws Exception {
        long begin=System.currentTimeMillis();
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\temp\\新能源车.docx"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\temp\\新能源车_buff.docx"));
        byte[]buff=new byte[1024];
        int len;
        len= bis.read();
        System.out.println(len);
        System.out.println(buff);
        while ((len=bis.read(buff))!=-1){
            bos.write(buff,0,len);
        }
        bis.close();
        bos.close();
        long end=System.currentTimeMillis();
        System.out.println("总共耗时："+(end-begin)+"毫秒");
    }
}
