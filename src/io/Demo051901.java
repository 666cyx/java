package io;
import java.io.FileInputStream;

public class Demo051901 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = null;
        try {
             in = new FileInputStream("D:\\temp\\123.txt");
             /*if (1==1){
                 throw new Exception("主动抛出异常，不执行下面的代码");
             }*/
            int b = 0;
            while (true) {
                b = in.read();
                if (b == -1) {
                    break;
                }
                System.out.print((char) b);
            }
        }finally {
            System.out.println();
            System.out.println("无论如何都会运行到这里，资源关闭");
            if (in!=null){

                in.close();
            }
        }
    }
}
