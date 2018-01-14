public class Book {

    private String name;
    private String type;
    private double price;
    private int number;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Book(String name, String type, double price, int number) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.number = number;
    }
}
