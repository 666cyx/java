package io;

import java.io.FileReader;

public class Demo051906 {
    public static void main(String[] args) throws Exception  {
        FileReader reader=new FileReader("D:\\temp\\789.txt");
        int ch;
        while ((ch=reader.read())!=-1){
            System.out.print((char) ch);
        }
        reader.close();
    }
}
