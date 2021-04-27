package service;

import user.User;

/**
 * @className: UserService
 * @description: TODO
 * @author: fxh
 * @date: 2021/4/24 14:52
 * @version: 1.0
 **/
public interface UserService {
    /**
     * @description:  注册用户
     * @param: [com.pojo.User]
     * @return: void
     * @author 23624
     * @date: 2021/4/21 21:19
     */
    public void RegisteredUser(User user);
    /**
     * @description: 登录业务
     * @param: [com.pojo.User]
     * @return: com.pojo.User
     * @author 23624
     * @date: 2021/4/21 21:21
     */
    public User login(User user);
    /**
     * @description: 检查用户名是否可用
     * @param: [java.lang.String]
     * @return: boolean  返回true表示用户名存在，返回false表示用户名可用
     * @author 23624
     * @date: 2021/4/21 21:22
     */
    public boolean existUsername(String username);
}
