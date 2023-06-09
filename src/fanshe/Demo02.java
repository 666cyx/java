package fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo02 {
    public static void main(String[] args) throws Exception{
        System.out.println("--------------调用无参构造方法生成狗对象");
        Class<?> c1=null;
        c1=Class.forName("fanshe.Dog");
        Dog dog= (Dog) c1.newInstance();
        dog .setName("旺财");
        dog.setId(100);
        dog.setAge(2);
        System.out.println(dog);
        System.out.println("-----------------调用有参构造方法---------------------");
        Constructor<?> cons[]=null;
        cons=c1.getConstructors();
        for (Constructor con:cons){
            System.out.println("得到的构造方法:"+con);
        }
        Dog dog1=(Dog) cons[1].newInstance(101,"旺财,",3);
        System.out.println(dog1);
        System.out.println("-----------------获取该类的全部方法---------------------");
        Method[] methods = c1.getMethods();
  for (Method method:methods){
      System.out.println("获取到方法名"+method.getName());
  }
        System.out.println("----------用反射方式调用类里面的方法-----------");
            Method method=c1.getMethod("show");
            method.invoke(dog1);
        System.out.println("-------------获取全部属性------------");
        Field[] fields = c1.getDeclaredFields();
    for (Field field:fields){
        Class<?> r=field.getType();
        int mo=field.getModifiers();
        String priv= Modifier.toString(mo);
        System.out.println("活得属性："+priv+","+r.getName()+","+field.getName());
    }
    }
}
