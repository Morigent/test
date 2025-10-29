/**
 *Merepresntasi sebuah buku dengan atribut judul, penulis, harga, dan stok.
 *memiliki metode untuk menampilkan informasi buku, menyesuaikan stok, dan menghitung harga diskon.
 *
 * @author yossua
 * @version 1.0
 *
 */


public class Book {
    /**
    *Field ini menyimpan judul buku, penulis, harga, stok dari buku, potongan harga
    */
    String title;
    String author;
    double price;
    int stock;
    public static final double discountRate = 0.1; // 10% discount

    /**
     *
     * @param title
     * @param author
     * @param price
     * @param stock
     */

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    /**
     * menampilkan semua detail buku dan harga setelah mendapat potongan discount
     */

    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: $" + getPrice());
        System.out.println("Discount Price: $" + calculateDiscount()); // Applying a 10% discount
        System.out.println("Stock: " + getStock());
    }

    /**
     * menambahkan atau mengurangi stok buku berdasarkan quantity yang diberikan
     * @param quantity
     */

    public void adjustStock(int quantity) {
        stock += quantity;
        System.out.println("Stock adjusted by");
        System.out.println("Stock adjusted. New stock: " + stock);
    }

    /**
     * menghitung potongan harga berdasarkan harga buku
     * @return hasil pengurangan dari harga asli dikurangi potongan harga
     */
    public double calculateDiscount(){
        double result = getPrice() - (getPrice() * discountRate);
        return result;
    }

    /**
     * getter untuk nama buku, penulis, harga, dan stok
     * @return title, author, price, stock tergantung dari getter mana yang dipakai
     */

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

    /**
     * setter untuk nama buku, penulis, harga, dan stok
     * @param title, author, price, stock tergantung dari setter mana yang dipakai
     */
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
