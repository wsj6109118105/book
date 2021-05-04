package web;

import service.BookService;
import service.Impl.BookServiceImpl;
import user.Book;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @className: BookServlet
 * @description: TODO
 * @author: fxh
 * @date: 2021/5/2 18:12
 * @version: 1.0
 **/
public class BookServlet extends BaseServlet {

    BookService bookService = new BookServiceImpl();

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book book = WebUtils.copyParameterBean(req.getParameterMap(),new Book());
        bookService.addBook(book);
        resp.sendRedirect(req.getContextPath()+"/manager/BookServlet?action=list");
    }


    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bookname = req.getParameter("bookname");
        bookService.deleteBookByName(bookname);
        resp.sendRedirect(req.getContextPath()+"/manager/BookServlet?action=list");
    }


    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bookname = req.getParameter("bookname");
        Book book = WebUtils.copyParameterBean(req.getParameterMap(),new Book());
        bookService.updateBookByName(book,bookname);
        resp.sendRedirect(req.getContextPath()+"/manager/BookServlet?action=list");
    }


    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.通过bookservice查询图书
        List<Book> books = bookService.queryBooks();
        //2.把数据保存到request域中
        req.setAttribute("books",books);
        //3.请求转发给/bookmanager.jsp,在其中显示
        req.getRequestDispatcher("/bookmanager.jsp").forward(req,resp);
    }

    protected void getbook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bookname = req.getParameter("bookname");
        Book book = bookService.queryBookByName(bookname);
        req.setAttribute("book",book);
        req.getRequestDispatcher("../book_update.jsp").forward(req,resp);
    }

}
