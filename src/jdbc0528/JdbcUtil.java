package jdbc0528;

import java.sql.*;

public class JdbcUtil {
    public static Connection getConn() {
        Connection conn = null;
        try {
            //注册数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //1.获取连接对象
            String url = "jdbc:mysql://127.0.0.1:3306/world?serverTimezone=UTC&userUnicode=true&charsetEncoding=utf-8";
            String user = "root";
            String password = "root";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(ResultSet rs, Statement st, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (st != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

}
