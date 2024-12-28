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

   
    public BigInteger getTotalPendapatan() {
    BigInteger harga = (hargaBarang != null) ? hargaBarang : BigInteger.ZERO;
    BigInteger jumlah = (jumlahBarang != null) ? jumlahBarang : BigInteger.ZERO;
    return  harga.multiply(jumlah);

    }
}




