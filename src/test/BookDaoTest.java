package test;

import dao.BookDao;
import dao.Impl.BookDaoImpl;
import org.junit.jupiter.api.Test;
import user.Book;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @className: BookDaoTest
 * @description: TODO
 * @author: fxh
 * @date: 2021/5/2 17:16
 * @version: 1.0
 **/
class BookDaoTest {

    private BookDao bookDao = new BookDaoImpl();
    @Test
    void addBook() {
        bookDao.addBook(new Book(null,"软件工程导论",new BigDecimal(30),"张海藩",0,1,null));
    }

    @Test
    void deleteBookByName() {
        bookDao.deleteBookByName("软件工程导论");
    }

    @Test
    void updateBook() {
        bookDao.updateBookByName(new Book(null,"软件工程导论",new BigDecimal(30),"张海藩",0,1,null),"软件工程导论1");
    }

    @Test
    void queryBookById() {
        Book book =  bookDao.queryBookById(4);
        System.out.println(book);
    }

    @Test
    void queryBooks() {
        List<Book> books = bookDao.queryBooks();
        System.out.println(books);
    }

    @Test
    void queryBookByName() {
        Book book = bookDao.queryBookByName("算法设计与分析");
        System.out.println(book);
    }
}