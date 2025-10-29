/**
 * Kelas ini digunakan sebagai kelas main dari program ini
 *
 * @author yossua
 * @version 1.0
 */
public class Main {
    /**
     * Method main sebagai titik awal eksekusi program (hasil dari refactoring class MainApp)
     */
    public static class MainApp {
        public static void main(String[] args) {
            /**
             * Deklarasi Kelas buku sebagai variable untuk memanggil method
             * @param "Harry Potter", "J.K Rowling", 10,2
             * @param book1, "Perpustakaan Kota"
             */
            Book book1 = new Book("Harry Potter", "J.K Rowling", 10,2);
            Library lib = new Library(book1, "Perpustakaan Kota");
            /**
             * Memanggil method displayLibraryInfo dari kelas Library
             */
            lib.displayLibraryInfo();
            System.out.println();
            /**
             * Memanggil method adjustStock dari kelas Book
             */
            book1.adjustStock(5);
            System.out.println();
            System.out.println("Masukin perubahan disinii asdaksbdkajjsd");
            /**
             * Memanggil method displayLibraryInfo dari kelas Library lagi setelah stok diubah
             */
            lib.displayLibraryInfo();
        }
    }
}
