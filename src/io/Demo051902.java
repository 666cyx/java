package io;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Demo051902 {
    public static void main(String[] args) throws IOException {
        OutputStream out = null;
        try {
          out = new FileOutputStream("D:\\temp\\789.txt");
            String str = "柳职云计算";
            byte[] b = str.getBytes();
            for (int i = 0; i < b.length; i++) {
                out.write(b[i]);
            }
        }finally {
            if (out != null) {
                out.close();
            }
        }
    }
}