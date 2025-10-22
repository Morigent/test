Dokumentasi Class
book.java:
    1. title: String - Judul buku
    2. author: String - Nama penulis buku
    3. Price : String - Harga dari buku
    4. Stock : int - Jumlah stok buku yang tersedia
    5. discountRate : double - Total potongan harga buku dalam persen

    Konstruktor:
    1. Book(String title, String author, String price, int stock, double discountRate) - Menciptakan objek buku dengan judul, penulis, harga, stok, dan tingkat diskon yang diberikan.

    Method:
    1. getTitle(): String - Mengembalikan judul buku.
    2. getAuthor(): String - Mengembalikan nama penulis buku.
    3. getPrice(): String - Mengembalikan harga buku.
    4. getStock(): int - Mengembalikan jumlah stok buku yang tersedia.
    5. DisplayInfo(): void - Menampilkan informasi lengkap tentang buku, termasuk judul, penulis, harga, stok, dan tingkat diskon.
    6. calculateDiscount(): double - Menghitung dan mengembalikan jumlah potongan harga berdasarkan tingkat diskon.
    7. adjustStock(): void - Menyesuaikan jumlah stok buku setelah penjualan atau penambahan stok baru.
Library.java:
    1. books: ArrayList<Book> - Daftar koleksi buku yang dimiliki perpustakaan.

    Konstruktor:
    1. Library() - Menciptakan objek perpustakaan dengan daftar buku kosong.

    Method:
    1. addBook(Book book): void - Menambahkan buku baru ke dalam koleksi perpustakaan.
    2. removeBook(String title): void - Menghapus buku dari koleksi berdasarkan judulnya.
    3. searchBook(String title): Book - Mencari dan mengembalikan buku berdasarkan judulnya.
    4. display
Main.java:
    1. main(String[] args): void - Titik masuk utama program yang mengelola perpustakaan buku, termasuk menambahkan, menghapus, mencari, dan menampilkan buku.
