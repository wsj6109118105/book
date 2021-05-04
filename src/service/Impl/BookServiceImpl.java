package service.Impl;

import dao.BookDao;
import dao.Impl.BookDaoImpl;
import service.BookService;
import user.Book;

import java.util.List;

/**
 * @className: BookServiceImpl
 * @description: TODO
 * @author: fxh
 * @date: 2021/5/2 17:47
 * @version: 1.0
 **/
public class BookServiceImpl implements BookService {

    private BookDao bookDao = new BookDaoImpl();
    @Override
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    public void deleteBookByName(String bookname) {
        bookDao.deleteBookByName(bookname);
    }

    @Override
    public void updateBookByName(Book book, String bookname) {
        bookDao.updateBookByName(book,bookname);
    }

    @Override
    public Book queryBookByName(String bookname) {
        return bookDao.queryBookByName(bookname);
    }

    @Override
    public List<Book> queryBooks() {
        return bookDao.queryBooks();
    }
}
