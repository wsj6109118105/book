package web;

import service.Impl.UserServiceImpl;
import service.UserService;
import user.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @className: UserServlet
 * @description: TODO
 * @author: fxh
 * @date: 2021/4/30 21:06
 * @version: 1.0
 **/
public class UserServlet extends HttpServlet {
    /**
     * @description:  处理登录的功能
     * @param: [javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse]
     * @return: void
     * @author 23624
     * @date: 2021/4/30 21:15
     */
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = new UserServiceImpl();
        if(userService.login(new User(null,req.getParameter("username"),req.getParameter("password"),null))!=null){
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
    protected void registered(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = new UserServiceImpl();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        if(userService.existUsername(username)){
            System.out.println("用户名已存在");
            req.setAttribute("message1","用户名已存在");
            req.setAttribute("username1",username);
            req.setAttribute("email",email);
            req.getRequestDispatcher("registered.jsp").forward(req,resp);
        }else{
            userService.RegisteredUser(new User(null,username,password,email));
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if("login".equals(action)){
            login(req,resp);
        }else if("registered".equals(action)){
            registered(req,resp);
        }
    }
}
