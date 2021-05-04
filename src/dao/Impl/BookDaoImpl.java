package dao.Impl;

import dao.BookDao;
import user.Book;

import java.util.List;

/**
 * @className: BookDaoImpl
 * @description: TODO
 * @author: fxh
 * @date: 2021/5/2 16:47
 * @version: 1.0
 **/
public class BookDaoImpl extends BaseDao implements BookDao {
    @Override
    /**
     * @description: 添加书籍
     * @param: [user.Book]
     * @return: int
     * @author 23624
     * @date: 2021/5/2 17:40
     */
    public int addBook(Book book) {
        String sql = "insert into tbook values(?,?,?,?,?,?,?)";
        return update(sql,null,book.getBookname(),book.getPrice(),book.getAuthor(),book.getSales(),book.getInventory(),book.getImage_path());

    }

    @Override
    /**
     * @description: 通过书名删除书籍
     * @param: [java.lang.String]
     * @return: int
     * @author 23624
     * @date: 2021/5/2 17:41
     */
    public int deleteBookByName(String bookname) {
        String sql = "delete from tbook where bookname = ?";
        return update(sql,bookname);
    }

    @Override
    /**
     * @description: 通过书名更新书籍数据
     * @param: [user.Book, java.lang.String]
     * @return: int
     * @author 23624
     * @date: 2021/5/2 17:41
     */
    public int updateBookByName(Book book,String bookname) {
        String sql = "update tbook set bookname = ?,price = ?,author = ?,sales = ?, inventory = ?,image_path = ? where bookname = ?";
        return update(sql,book.getBookname(),book.getPrice(),book.getAuthor(),book.getSales(),book.getInventory(),book.getImage_path(),bookname);
    }

    @Override
    /**
     * @description: 通过书籍id查询书籍
     * @param: [java.lang.Integer]
     * @return: user.Book
     * @author 23624
     * @date: 2021/5/2 17:42
     */
    public Book queryBookById(Integer id) {
        String sql = "select * from tbook where id = ?";
        return queryForOne(Book.class,sql,id);
    }

    @Override
    /**
     * @description:  查询所有书籍
     * @param: []
     * @return: java.util.List<user.Book>
     * @author 23624
     * @date: 2021/5/2 17:42
     */
    public List<Book> queryBooks() {
        String sql = "select * from tbook";
        return queryForMore(Book.class,sql);
    }

    @Override
    /**
     * @description:  通过书名查询书籍
     * @param: [java.lang.String]
     * @return: user.Book
     * @author 23624
     * @date: 2021/5/2 17:42
     */
    public Book queryBookByName(String name) {
        String sql = "select * from tbook where bookname = ?";
        return queryForOne(Book.class,sql,name);
    }
}
