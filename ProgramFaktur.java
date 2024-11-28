// Main class

import java.util.Scanner;

public class ProgramFaktur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Proses login
        System.out.println("+-----------------------------------------------------+");
        System.out.print("Username : "); //string yang ditampilkan
        String username = scanner.nextLine();

        System.out.print("Password : ");
        String password = scanner.nextLine();

        // Membuat captcha sederhana
        String captcha = "12345"; // Captcha tetap
        System.out.print("Captcha  : ");
        String userCaptcha = scanner.nextLine();

        // Validasi login 
        //string disini apa pengguna menginputkan sesuai dgn string "admin"
        if (!username.equals("admin") || !password.equals("admin") || !userCaptcha.equals(captcha)) {
            System.out.println("Login gagal, silakan ulangi.");
            return; // Menghentikan program jika login gagal
        }

        System.out.println("Login berhasil!");
        System.out.println("+-----------------------------------------------------+");

        try {
            // Input data transaksi
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            scanner.nextLine(); // Clear buffer

            System.out.print("Masukkan Nama Kasir: ");
            String namaKasir = scanner.nextLine();

            // Validasi input
            if (hargaBarang < 0 || jumlahBeli < 0) {
                throw new IllegalArgumentException("Harga atau jumlah tidak boleh negatif.");
            }

            // Membuat objek Transaksi
            Transaksi transaksi = new Transaksi(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Menampilkan detail transaksi
            transaksi.tampilkanDetail(namaKasir);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Input tidak valid.");
        } finally {
            scanner.close();
        }
    }
}