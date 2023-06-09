package io;

import java.io.File;
import java.io.FilenameFilter;

public class Demo3 {
    public static void main(String[] args) {
        File file=new File("D:\\temp");
        FilenameFilter filter=new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File currFile=new File(dir,name);
                //if (currFile.isFile() && name.endsWith(".java")){
                    if (currFile.isFile() && name.contains("123")){
                    return true;
                }else {

                    return false;
                }
            }
        };
        if (file.exists()&&file.isDirectory()){
            String[] list=file.list(filter);
            for (String name:list){
                System.out.println(name);
            }
        }
    }
}
