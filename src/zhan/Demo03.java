package zhan;

public class Demo03 {
    static   int count=0;

    public static void main(String[] args) {
        String str="abc111abc222abc333abc444abc";
        String key="abc";
        jisuan(str,key);
        System.out.println(key+",出现的次数:"+count);
    }
    public static void jisuan(String str,String key){
        if (str.indexOf(key)==-1){
            return ;
        }
        str=str.substring(str.indexOf(key)+key.length());
        System.out.println("截取后的字符串:"+str);
        count++;
        jisuan(str,key);
    }
}

