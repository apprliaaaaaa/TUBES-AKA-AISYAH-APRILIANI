/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesaka;

/**
 *
 * @author dell
 */
import java.util.Date;
import java.math.BigInteger;

public class Transaksi {
    private String namaBarang;
    private BigInteger hargaBarang;
    private BigInteger jumlahBarang;
    private Date tanggalTransaksi;

    public Transaksi(String namaBarang, BigInteger hargaBarang, BigInteger jumlahBarang, Date tanggalTransaksi) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        this.tanggalTransaksi = tanggalTransaksi;
    }

    // Konstruktor lain yang tidak digunakan di sini, tetapi perlu ditangani atau dihapus
    Transaksi(String namaBarang, int harga, int jumlah, String tanggalTransaksi) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    Transaksi(String namaBarang, int harga, int jumlah, Date tanggalTransaksi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public BigInteger getHargaBarang() {
        return hargaBarang;
    }

    public BigInteger getJumlahBarang() {
        return jumlahBarang;
    }

    public Date getTanggal() {
        return tanggalTransaksi;
    }

    // Perbaikan pada metode getTotalPendapatan menggunakan multiply
    public BigInteger getTotalPendapatan() {
        return hargaBarang.multiply(jumlahBarang); // Menggunakan multiply() untuk BigInteger
    }
}



