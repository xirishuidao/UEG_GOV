package util;

import java.util.ResourceBundle;

public class DateBaseUtil {


    private static final String DRIVER_CLASS ;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWORD;

    static {
        // ResourceBundle用于加载一个指定的资源，然后可以通过该对象操作该资源
        // 比如加载一个属性文件，需要指定属性文件的 包名.文件名，但是不需要写扩展名
        ResourceBundle rb = ResourceBundle.getBundle("dblogin.properties");
        // 根据属性名获取属性值，存入对应的常量，方便后续使用
        DRIVER_CLASS = rb.getString("jdbc.driver");
        URL = rb.getString("jdbc.url");
        USERNAME = rb.getString("jdbc.username");
        PASSWORD = rb.getString("jdbc.password");
    }

}
