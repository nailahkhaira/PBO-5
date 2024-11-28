import java.text.SimpleDateFormat; // Untuk format tanggal dan waktu
import java.util.Date; // Untuk mendapatkan waktu saat ini
import java.util.Scanner;

// Parent class
class Barang {
    protected String kodeBarang;
    protected String namaBarang;
    protected double hargaBarang;

    // Constructor Barang
    public Barang(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    // Method untuk menghitung total harga
    public double hitungTotal(int jumlah) {
        return hargaBarang * jumlah;
    }
}
