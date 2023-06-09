package jdbc0528;

import java.sql.*;

public class bc {
   /* import java.sql.*;

    public class Demo01 {
        public static void main(String[] args) throws SQLException {
            Statement stmt = null;
            ResultSet rs = null;
            Connection conn = null;
            try {
                conn=JdbcUtil.getConn();
                String sql = "select * from dog";
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name=rs.getString("name");
                    int age =rs.getInt("age");
                    System.out.println("得到记录："+id+"------"+name+"-----"+age);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                JdbcUtil.close(rs,stmt,conn);
            }
        }
    }*/




   /* import java.sql.*;

    public class JdbcUtil {
        public static Connection getConn(){
            Connection conn=null;
            try {
                //注册数据库驱动
                Class.forName("com.mysql.jdbc.Driver");
                //1.获取连接对象
                String url = "jdbc:mysql://127.0.0.1:3306/wold?serverTimezone=UTC&userUnicode=true&charsetEncoding=utf-8";
                String user = "root";
                String password = "root";
                conn = DriverManager.getConnection(url, user, password);
            }catch (Exception e){
                e.printStackTrace();
            }
            return conn;
        }
        public static void close(ResultSet rs, Statement st,Connection conn){
            if (rs!=null){
                try {
                    rs.close();
                }catch (SQLException throwables){
                    throwables.printStackTrace();
                }
            }
            if (st!=null){
                try {
                    rs.close();
                }catch (SQLException throwables){
                    throwables.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    rs.close();
                }catch (SQLException throwables){
                    throwables.printStackTrace();
                }
            }
        }

    }*/
}




