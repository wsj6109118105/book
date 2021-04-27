package dao;

import user.User;

/**
 * @className: Userdao
 * @description: TODO
 * @author: fxh
 * @date: 2021/4/24 14:38
 * @version: 1.0
 **/
public interface UserDao {
    //注册
    /**
     * @description: 根据用户名查询用户信息
     * @param: [java.lang.String]
     * @return: com.pojo.User 如果返回null说明用户不存在
     * @author 23624
     * @date: 2021/4/20 22:09
     */
    public User queryUserByUsername(String username);
    /**
     * @description: 将用户信息保存到数据库
     * @param: [com.pojo.User]
     * @return: int
     * @author 23624
     * @date: 2021/4/20 22:11
     */
    public int saveUser(User user);
    //登录
    /**
     * @description: 从数据库中查寻用户名密码，判断登录
     * @param: [java.lang.String, java.lang.String]
     * @return: com.pojo.User 返回null说明用户名和密码错误
     * @author 23624
     * @date: 2021/4/20 22:13
     */
    public User queryUserByUsernameAndPassword(String username,String password);
}
