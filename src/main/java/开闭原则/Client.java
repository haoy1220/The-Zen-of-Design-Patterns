package 开闭原则;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * @author Hao
 * @date 2019/11/16 0:35
 */
public class Client {
    private final static ArrayList<Book> books = new ArrayList<Book>();

    static {
        books.add(new NovelBook("大家安静", 3050, "打"));
        books.add(new NovelBook("大家安静2", 3004, "打"));
        books.add(new NovelBook("大家安静3", 3020, "打"));
        books.add(new NovelBook("大家安静4", 3300, "打"));
    }

    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        format.setMaximumFractionDigits(2);

        System.out.println("--------记录---------");
        for (Book book :
                books) {
            System.out.println("书籍名称：" + book.getName() + "\t价格：" +
                    format.format(book.getPrice() / 100.0) + "元\t书籍作者：" + book.getAuthor());
        }
    }
}


interface Book {
    public String getName();

    public int getPrice();

    public String getAuthor();
}

class NovelBook implements Book {

    private String name;
    private int price;
    private String author;

    public NovelBook(String _name, int _price, String _author) {
        this.name = _name;
        this.price = _price;
        this.author = _author;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getAuthor() {
        return this.author;
    }
}