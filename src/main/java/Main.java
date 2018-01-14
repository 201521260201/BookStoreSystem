import java.util.List;

public class Main {

    public static double priceAllBook(List<Book> list) {
        double sumPrice = 0.0;
        for (Book book: list) {
            sumPrice += pricePerBook(book);
        }
        return sumPrice;
    }

    public static double pricePerBook(Book book) {
        double price = 0.0;
        if (book.getType() == "newBook") {
            price = 1.2 * book.getPrice() * book.getNumber();
        }
        else if (book.getType() == "regularBook") {
            price = 1.0 * book.getPrice() * book.getNumber();
        }
        else if (book.getType() == "unsoldBook") {
            price = 0.6 * book.getPrice() * book.getNumber();
        }
        return price;
    }
}

