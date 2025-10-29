/**
 * Kelas ini merepresentasi perpustakaan yang memiliki buku dan lokasi
 *
 * @author yossua
 * @version 1.0
 */

public class Library {
    /**
     * Field ini menyimpan objek buku dan lokasi perpustakaan
     */
    public Book book;
    public String location;

    /**
     * konstruktor untuk perpustakaan
     * @param book
     * @param location
     */
    public Library(Book book, String location) {
        this.book = book;
        this.location = location;
    }

    /**
     * menampilkan informasi perpustakaan beserta informasi buku yang dimilikinya
     */
    public void displayLibraryInfo() {
        System.out.println("Library Location: " + location);
        book.displayInfo();
    }

    /**
     * setter dan getter untuk atribut book dan location
     * @param book
     * @return location
     */
    public void setBook(Book book) {
        this.book = book;
    }
    public Book getBook() {
        return book;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
}
