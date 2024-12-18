package util;

import java.sql.*;
import java.util.ResourceBundle;

public class DataBaseUtil {


    private static final String DRIVER_CLASS ;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWORD;

    /**
     * static静态代码块  只执行一次
     */
    static {
        ResourceBundle rb = ResourceBundle.getBundle("util.DBLogin");
        DRIVER_CLASS = rb.getString("jdbc.driver");
        URL = rb.getString("jdbc.url");
        USERNAME = rb.getString("jdbc.username");
        PASSWORD = rb.getString("jdbc.password");

    }

    /**
     *
     * @return当未成功执行，应当弹出对话框表示错误并结束程序
     */
    public static Connection getConnection() {
        Connection con = null;
        try {
            // 1. 加载驱动类
            Class.forName(DRIVER_CLASS);
            // 2. 获取数据库连接
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("数据库驱动类未找到", e);

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return con; // 返回创建的连接
    }

    /**
     *
     * @param rs
     * @param stmt
     * @param con
     * @return 当未成功执行，应当弹出对话框表示错误并结束程序
     */
    public static boolean close(ResultSet rs, Statement stmt, Connection con) {
        try {
            if (null != rs)
                rs.close();
            if (null != stmt)
                stmt.close();
            if (null != con)
                con.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
}
