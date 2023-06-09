package jdbc0528;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//dog表的服务类，关于dog的增删查改都在这里实现
public class Dogservice {
    BaseDao dao=new BaseDao();
   public List<Dog> getAllDog() {
        ArrayList<Dog> list = new ArrayList<>();
        Statement pstmt = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = JdbcUtil.getConn();
            String sql = "select * from dog";
            pstmt = conn.createStatement();
            rs = pstmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                //System.out.println("得到记录："+id+"------"+name+"-----"+age);
                Dog dog = new Dog(id, name, age);
                list.add(dog);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(rs, pstmt, conn);
        }
        return list;
    }





    public Dog getDogById(int id) {
        ArrayList<Dog> list = new ArrayList<>();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = JdbcUtil.getConn();
            String sql = "select * from dog where id=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            rs = pstmt.executeQuery();
            while (rs.next()) {

                //System.out.println("得到记录："+id+"------"+name+"-----"+age);
                Dog dog = new Dog(rs.getInt("id"),rs.getString("name"), rs.getInt("age"));
                list.add(dog);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //JdbcUtil.close(rs, pstmt, conn);
        }
        if (list!=null&&list.size()>0) {
            return list.get(0);
        }
        return  null;
    }





    public Dog getDogById2(int id) {
       Dog dog =null;
        String sql = "select * from dog where id=?";
        Object[] obj={id};
        List <Dog> list= dao.executeQuery(sql, obj, Dog.class);
        if (list.size()>0){
            dog=list.get(0);
        }
        return dog;
    }

}