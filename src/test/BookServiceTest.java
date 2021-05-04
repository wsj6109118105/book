package test;

import org.junit.jupiter.api.Test;
import service.BookService;
import service.Impl.BookServiceImpl;
import user.Book;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @className: BookServiceTest
 * @description: TODO
 * @author: fxh
 * @date: 2021/5/2 17:50
 * @version: 1.0
 **/
class BookServiceTest {
    private BookService bookService = new BookServiceImpl();
    @Test
    void addBook() {
        bookService.addBook(new Book(null,"软件工程导论",new BigDecimal(30),"张还藩",0,1,null));
    }

    @Test
    void deleteBookByName() {
        bookService.deleteBookByName("软件工程导论2");
    }

    @Test
    void updateBookByName() {
        bookService.updateBookByName(new Book(null,"软件工程导论2",new BigDecimal(60),"张还藩",0,1,null),"软件工程导论");
    }

    @Test
    void queryBookByName() {
        Book book = bookService.queryBookByName("算法设计与分析");
        System.out.println(book);
    }

    @Test
    void queryBooks() {
        List<Book> books = bookService.queryBooks();
        System.out.println(books);
    }
}