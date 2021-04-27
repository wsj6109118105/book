package service.Impl;

import dao.Impl.UserDaoImpl;
import dao.UserDao;
import service.UserService;
import user.User;

/**
 * @className: UserServiceImpl
 * @description: TODO
 * @author: fxh
 * @date: 2021/4/24 14:52
 * @version: 1.0
 **/
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public void RegisteredUser(User user) {

        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {

        return userDao.queryUserByUsernameAndPassword(user.getUsername(),user.getPasword());
    }

    @Override
    public boolean existUsername(String username) {

        if(userDao.queryUserByUsername(username)!=null){
            return true;
        }
        return false;
    }
}
