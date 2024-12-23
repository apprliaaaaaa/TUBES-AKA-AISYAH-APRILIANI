/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesaka;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class POSApplication {
     public static ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();
   public static int hitungPendapatanRekursif(ArrayList<Transaksi> daftar, int index, String start, String end) {
    // Basis rekursi: jika index sudah melewati ukuran array
    if (index >= daftar.size()) {
        return 0;
    }

    // Ambil transaksi saat ini
    Transaksi transaksi = daftar.get(index);

    // Hitung pendapatan jika tanggal sesuai
    if (transaksi.getTanggalTransaksi().compareTo(start) >= 0 &&
        transaksi.getTanggalTransaksi().compareTo(end) <= 0) {
        return transaksi.getTotalPendapatan() + 
               hitungPendapatanRekursif(daftar, index + 1, start, end);
    } else {
        // Lanjutkan ke transaksi berikutnya
        return hitungPendapatanRekursif(daftar, index + 1, start, end);
    }
}
   public static int hitungTotalTransaksi(ArrayList<Transaksi> daftarTransaksi) {
    int total = 0;

    // Iterasi untuk menghitung jumlah transaksi
    for (Transaksi transaksi : daftarTransaksi) {
        total++; // Tambahkan 1 untuk setiap transaksi
    }

    return total;
}
   
   public static int hitungTotalTransaksiIteratif(ArrayList<Transaksi> daftarTransaksi) {
    int total = 0;

    // Iterasi untuk menghitung jumlah transaksi
    for (Transaksi transaksi : daftarTransaksi) {
        total++; // Tambahkan 1 untuk setiap transaksi
    }

    return total;
}
   
   public static int hitungTotalTransaksiRekursif(ArrayList<Transaksi> daftarTransaksi, int index) {
    // Basis: jika sudah mencapai akhir daftar, kembalikan 0
    if (index == daftarTransaksi.size()) {
        return 0;
    }

    // Rekurens: jumlah transaksi saat ini + sisa transaksi
    return 1 + hitungTotalTransaksiRekursif(daftarTransaksi, index + 1);
}
   

    public static void main(String[] args) {
        KF.MainMenu.setVisible(true);
    }
   
}
