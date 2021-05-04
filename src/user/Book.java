package user;

import java.math.BigDecimal;

/**
 * @className: Book
 * @description: TODO
 * @author: fxh
 * @date: 2021/5/2 16:31
 * @version: 1.0
 **/
public class Book {
    private Integer id;
    private String bookname;
    private BigDecimal price;
    private String author;
    private Integer sales;
    private Integer inventory;
    private String image_path = "images/1.jpg";

    public Book() {
    }

    public Book(Integer id, String bookname, BigDecimal price, String author, Integer sales, Integer inventory, String image_path) {
        this.id = id;
        this.bookname = bookname;
        this.price = price;
        this.author = author;
        this.sales = sales;
        this.inventory = inventory;
        if(image_path!=null && "".equals(image_path)) {
            this.image_path = image_path;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        if(image_path!=null && "".equals(image_path)) {
            this.image_path = image_path;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookname='" + bookname + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", sales=" + sales +
                ", inventory=" + inventory +
                ", image_path='" + image_path + '\'' +
                '}';
    }
}
