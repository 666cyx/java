package search;

public class Demo01 {
    public static void main(String[] args) {
        String str = "6月9号,.请到柳职吃饭，电话18377962357，速来";
        int count = 0;
        int front=-1;
        String phone = "";
        for (int i = 0; i < str.length(); i++) {
            if (count == 11) {
                break;
            }
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                System.out.println("是数字：" + str.charAt(i));
                if (front == -1) {
                    count++;
                    phone = phone + str.charAt(i);
                } else if ((i - 1) == front) {
                    count++;
                    phone = phone + str.charAt(i);
                }
                front = i;
            } else {
                System.out.println("不是数字："+str.charAt(i));
                count = 0;
                front = -1;
                phone = "";
            }
            System.out.println("此时，from=" + front + ",count=" + count + ",phone=" + phone);
        }
            System.out.println("数字的个数："+count);
        if (count==11){
            String regex="^1[345678]\\d{9}$";
            if (phone.matches(regex)){
                System.out.println("确实是电话号码,号码为："+phone);
            }else {

                System.out.println("找到11位数字，但不是电话号码");
            }
        }
    }
}
