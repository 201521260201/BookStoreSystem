import org.junit.Test;

import java.util.ArrayList;

public class TestMain {

    @Test
    public void checkOut() {
        Book book1 = new Book("aaa", "newBook", 15.00, 5);
        Book book2 = new Book("bbb", "regularBook", 25.00, 2);
        Book book3 = new Book("ccc", "unsoldBook", 10.00, 3);
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        for (Book book: list) {
            System.out.println("书名：" + book.getName() + "  数量：" + book.getNumber() + "  价格：" + Main.pricePerBook(book));
        }
        System.out.println("合计：" + Main.priceAllBook(list));
    }
}
