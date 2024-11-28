import java.util.Date; // Gunakan java.util.Date, bukan java.sql.Date
import java.text.SimpleDateFormat; // Untuk format tanggal

class Transaksi extends Barang {
    private String noFaktur;
    private int jumlahBeli;

    // Constructor Transaksi
    public Transaksi(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang);
        this.noFaktur = noFaktur;
        this.jumlahBeli = jumlahBeli;
    }

    // Method untuk menampilkan detail transaksi
    public void tampilkanDetail(String namaKasir) {
        double total = hitungTotal(jumlahBeli); // Menggunakan metode dari parent class
        // Menggunakan java.util.Date untuk mendapatkan waktu saat ini
        Date date = new Date(); // Objek Date untuk waktu saat ini

        // Mengatur format tanggal
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        System.out.println("\n+----------------------------------------------------+");
        System.out.println("Selamat Datang di Supermarket AmazingMart");
        System.out.println("Tanggal dan Waktu : " + formatter.format(date));
        System.out.println("+----------------------------------------------------+");
        System.out.println("No. Faktur      : " + noFaktur);
        System.out.println("Kode Barang     : " + kodeBarang);
        System.out.println("Nama Barang     : " + namaBarang);
        System.out.println("Harga Barang    : Rp " + hargaBarang);
        System.out.println("Jumlah Beli     : " + jumlahBeli);
        System.out.println("TOTAL           : Rp " + total);
        System.out.println("+----------------------------------------------------+");
        System.out.println("Kasir           : " + namaKasir);
        System.out.println("+----------------------------------------------------+");
    }
}
