package dao.Impl;

import dao.UserDao;
import user.User;

/**
 * @className: UserDaoImpl
 * @description: TODO
 * @author: fxh
 * @date: 2021/4/24 14:50
 * @version: 1.0
 **/
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    /**
     * @description: 根据用户名来查询用户是否存在
     * @param: [java.lang.String]
     * @return: com.pojo.User
     * @author 23624
     * @date: 2021/4/21 21:23
     */
    public User queryUserByUsername(String username) {
        String sql = "select * from buser where username = ?";
        return queryForOne(User.class,sql,username);
    }

    @Override
    /**
     * @description: 保存用户信息
     * @param: [com.pojo.User]
     * @return: int
     * @author 23624
     * @date: 2021/4/21 21:24
     */
    public int saveUser(User user) {
        String sql = "insert into buser values(?,?,?,?)";
        return updata(sql,null,user.getUsername(),user.getPassword(),user.getEmail());
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql = "select * from buser where username = ? and pasword = ?";
        return queryForOne(User.class,sql,username,password);
    }
}
