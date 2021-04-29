package web;

import com.sun.net.httpserver.HttpServer;
import service.Impl.UserServiceImpl;
import service.UserService;
import user.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @className: RegisteredServlet
 * @description: TODO
 * @author: fxh
 * @date: 2021/4/24 14:57
 * @version: 1.0
 **/
public class RegisteredServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = new UserServiceImpl();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        if(userService.existUsername(username)){
            System.out.println("用户名已存在");
            req.getRequestDispatcher("registered.jsp").forward(req,resp);
        }else{
            userService.RegisteredUser(new User(null,username,password,email));
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }
}
