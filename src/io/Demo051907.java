package io;

import java.io.FileWriter;

public class Demo051907 {
    public static void main(String[] args)  throws  Exception{
        FileWriter writer=new FileWriter("D:\\temp\\666.txt");
        String str="云计算1班";
        writer.write(str);
        writer.write("\r\n");
        writer.close();
    }
}
