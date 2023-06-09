package jdbc0528;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) throws SQLException {
        Dogservice service = new Dogservice();
        List<Dog> list = service.getAllDog();
        for (Dog dog : list) {
            System.out.println("集合内容:" + dog);
        }

        System.out.println("------------");
        Dog dog=service.getDogById(1006);
        System.out.println(dog);
        System.out.println("-------用basedao来查询--------");
        Dog dog2=service.getDogById2(1002);
        System.out.println(dog2);
    }
}