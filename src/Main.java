public class Main {
    public static class MainApp {
        public static void main(String[] args) {
            Book book1 = new Book("Harry Potter", "J.K Rowling", 10,2);
            Library lib = new Library(book1, "Perpustakaan Kota");

            lib.displayLibraryInfo();
            System.out.println();

            book1.adjustStock(5);
            System.out.println();
            System.out.println("Masukin perubahan disinii asdaksbdkajjsd");

            lib.displayLibraryInfo();
        }
    }
}
