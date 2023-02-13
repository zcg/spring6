package github.com.zcg.spring6_ioc_xml.di;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.di
 * @className: Book
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 9:57
 */
public class Book {
    private String bname;
    private String author;
    private String others;

    public Book(String bname, String author) {
        System.out.println("有参构造执行了....");
        this.bname = bname;
        this.author = author;
    }

    public Book() {
        System.out.println("无参构造执行了....");
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public static void main(String[] args) {
        // set注入
        Book book = new Book();
        book.setBname("java速成");
        book.setAuthor("xx老师");
        System.out.println(book.getAuthor() + book.getBname());

        // 构造器注入
        Book book1 = new Book("c++速成", "xx老师");
        System.out.println(book1.getAuthor() + book1.getBname());

    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }
}
