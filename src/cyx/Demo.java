package cyx;
public class Demo {
    /*public static void testThrows() throws NumberFormatException {
        String str="123a";
        int a=Integer.parseInt(str);
        System.out.println(a);




    }

    public static void main(String[] args) {
        try {
            testThrows();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("测试Throws");
        }
        System.out.println("I'm here");
        }


}*/
/*public static void testThrow(int a)throws Exception{
if(a==1){
    throw new Exception("账号密码错误");
}
    System.out.println(a);
}

    public static void main(String[] args) {
        try{
            testThrow(1);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("在这里处理了异常");
        }
    }
}*/
/*public static void testRuntimeException()
        throws  RuntimeException{
    throw new RuntimeException("这是运行异常");
    }
    public static void testException()throws Exception{
    throw new Exception("Exception");
}

    public static void main(String[] args) {
        testRuntimeException();
        try {
            testException();
        }catch (Exception e){
            System.out.println("处理普通异常");
        }
    }




}*/
public class CustoomException extends Throwable {
private String message;
private int status;

public CustoomException(String message,int status){
    this.message = message;
    this.status = status;
}
@Override
        public  String getMessage(){
    return message;
}
public int getStatus(){
    return  status;
}
}
}







