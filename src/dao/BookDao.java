package dao;

import user.Book;

import java.util.List;

/**
 * @className: BookDao
 * @description: TODO
 * @author: fxh
 * @date: 2021/5/2 16:41
 * @version: 1.0
 **/
public interface BookDao {
    public int addBook(Book book);
    public int deleteBookByName(String bookname);
    public int updateBookByName(Book book,String bookname);
    public Book queryBookById(Integer id);
    public List<Book> queryBooks();
    public Book queryBookByName(String name);
}
