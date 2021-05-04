package service;

import user.Book;

import java.util.List;

/**
 * @className: BookService
 * @description: TODO
 * @author: fxh
 * @date: 2021/5/2 17:39
 * @version: 1.0
 **/
public interface BookService {
    public void addBook(Book book);
    public void deleteBookByName(String bookname);
    public void updateBookByName(Book book,String bookname);
    public Book queryBookByName(String bookname);
    public List<Book> queryBooks();
}
