package dao.Impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @className: BaseDao
 * @description: TODO
 * @author: fxh
 * @date: 2021/4/24 14:40
 * @version: 1.0
 **/
public abstract class BaseDao {
    //使用dbutils操作数据库
    private QueryRunner queryRunner = new QueryRunner();
    /**
     * @description:  用来执行insert/updata/delate语句
     * @param:
     * @return: [返回-1表示执行失败，返回其他表示影响的行数]
     * @author 23624
     * @date: 2021/4/19 21:36
     */
    public int updata(String sql,Object ... args){
        Connection con = JdbcUtils.getConnection();
        try {
            return queryRunner.update(con,sql,args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.close(con);
        }
        return -1;
    }
    /**
     * @description:  用来查询返回一个javaBean的sql语句
     * @param: [java.lang.Class<T>, java.lang.String, java.lang.Object...]
     * @return: T  如果返回null说明没有查到，
     * @author 23624
     * @date: 2021/4/19 21:58
     */
    public <T> T queryForOne(Class<T> type, String sql,Object ... args){
        Connection con = JdbcUtils.getConnection();
        try {
            return queryRunner.query(con, sql, new BeanHandler<T>(type),args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.close(con);
        }
        return null;
    }
    /**
     * @description:  查询返回多个JavaBean
     * @param: [java.lang.Class<T>, java.lang.String, java.lang.Object...]
     * @return: java.util.List<T>
     * @author 23624
     * @date: 2021/4/19 22:01
     */
    public <T> List<T> queryForMore(Class<T> type, String sql, Object ... args){
        Connection con = JdbcUtils.getConnection();
        try {
            return queryRunner.query(con, sql, new BeanListHandler<T>(type),args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.close(con);
        }
        return null;
    }
}
