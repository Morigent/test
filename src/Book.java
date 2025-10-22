public class Book {
    String title;
    String author;
    double price;
    int stock;
    public static final double discountRate = 0.1; // 10% discount

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }
    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: $" + getPrice());
        System.out.println("Discount Price: $" + calculateDiscount()); // Applying a 10% discount
        System.out.println("Stock: " + getStock());
    }

    public void adjustStock(int quantity) {
        stock += quantity;
        System.out.println("Stock adjusted by");
        System.out.println("Stock adjusted. New stock: " + stock);
    }
    public double calculateDiscount(){
        double result = getPrice() - (getPrice() * discountRate);
        return result;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
