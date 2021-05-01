package web;

import org.apache.commons.beanutils.BeanUtils;
import service.Impl.UserServiceImpl;
import service.UserService;
import user.User;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @className: UserServlet
 * @description: TODO
 * @author: fxh
 * @date: 2021/4/30 21:06
 * @version: 1.0
 **/
public class UserServlet extends BaseServlet {
    /**
     * @description:  处理登录的功能
     * @param: [javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse]
     * @return: void
     * @author 23624
     * @date: 2021/4/30 21:15
     */
    public void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = new UserServiceImpl();
        //使用BeanUtils注入user对象
        User user = WebUtils.copyParameterBean(req.getParameterMap(),new User());
        System.out.println(user);
        if(userService.login(user)!=null){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
            req.setAttribute("message","用户名或密码错误");
            req.setAttribute("username",req.getParameter("username"));
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }
    /**
     * @description: 处理注册的功能
     * @param: [javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse]
     * @return: void
     * @author 23624
     * @date: 2021/4/30 21:15
     */
    public void registered(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = new UserServiceImpl();
        User user = WebUtils.copyParameterBean(req.getParameterMap(),new User());
        if(userService.existUsername(user.getUsername())){
            System.out.println("用户名已存在");
            req.setAttribute("message1","用户名已存在");
            req.setAttribute("username1",user.getUsername());
            req.setAttribute("email",user.getEmail());
            req.getRequestDispatcher("registered.jsp").forward(req,resp);
        }else{
            userService.RegisteredUser(user);
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }
}