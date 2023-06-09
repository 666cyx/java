package zhan;

public class Demo01 {
    public static void main(String[] args) {
       // System.out.println(aaa(4));
        long begin=System.currentTimeMillis();
        System.out.println(shulie(50));
        long end=System.currentTimeMillis();
        System.out.println("总共耗时："+(end-begin)+"毫秒");
    }
    public static Long shulie(int n){
        if (n==1||n==2){
            return 1L;
        }else {
            return shulie(n-1)+shulie(n-2);
        }
    }
    public static int aaa(int n){
        if (n==0 ||n==1){
            return  1;
        }else {
            return n*aaa(n-1);
        }
    }
}
