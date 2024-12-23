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
public class Transaksi {
    private String namaBarang;
    private int hargaBarang;
    private int jumlahBarang;
    private String tanggalTransaksi;

    public Transaksi(String namaBarang, int hargaBarang, int jumlahBarang, String tanggalTransaksi) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public int getTotalPendapatan() {
        return hargaBarang * jumlahBarang;
    }
}

