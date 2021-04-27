package utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @className: JdbcUtils
 * @description: TODO
 * @author: fxh
 * @date: 2021/4/24 14:48
 * @version: 1.0
 **/
public class JdbcUtils {
    private static DruidDataSource dataSource;

    static {
        Properties properties = new Properties();
        try {
            //读取jdbc配置文件
            InputStream resourceAsStream = JdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            //从流中加载数据
            properties.load(resourceAsStream);
            resourceAsStream.close();
            //创建了数据库连接池
            dataSource= (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * @description:  获取数据库连接池中的连接
     * @param:
     * @return: Connection连接，获取连接失败返回null
     * @author 23624
     * @date: 2021/4/17 23:13
     */
    public static Connection getConnection(){
        Connection con = null;
        try {
            con = dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }
    /**
     * @description: 关闭连接，放回数据库连接池
     * @param:
     * @return: [java.sql.Connection]
     * @author 23624
     * @date: 2021/4/17 23:15
     */
    public static void close(Connection con){
        if(con!=null) {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
