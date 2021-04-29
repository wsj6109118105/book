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
 * @className: LoginServlet
 * @description: TODO
 * @author: fxh
 * @date: 2021/4/24 15:14
 * @version: 1.0
 **/
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = new UserServiceImpl();
        if(userService.login(new User(null,req.getParameter("username"),req.getParameter("password"),null))!=null){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }
}
