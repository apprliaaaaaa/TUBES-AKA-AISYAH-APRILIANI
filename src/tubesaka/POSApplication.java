/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesaka;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dell
 */
public class POSApplication {
     public static ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();
   
     public static BigInteger hitungPendapatanIteratif(ArrayList<Transaksi> daftarTransaksi, Date startDate, Date endDate) {
    BigInteger totalPendapatan = BigInteger.ZERO; // Inisialisasi totalPendapatan dengan BigInteger.ZERO

    for (Transaksi transaksi : daftarTransaksi) {
        if (transaksi.getTanggal().compareTo(startDate) >= 0 && transaksi.getTanggal().compareTo(endDate) <= 0) {
            totalPendapatan = totalPendapatan.add(transaksi.getTotalPendapatan()); // Gunakan add() untuk BigInteger
        }
    }

    return totalPendapatan; 
}
    
   public static BigInteger hitungPendapatanRekursif(ArrayList<Transaksi> daftarTransaksi, Date startDate, Date endDate, int index) {
    if (index == daftarTransaksi.size()) {
        return BigInteger.ZERO;
    }

    Transaksi transaksi = daftarTransaksi.get(index);
    BigInteger pendapatanSaatIni = BigInteger.ZERO; 

    if (transaksi.getTanggal().compareTo(startDate) >= 0 && transaksi.getTanggal().compareTo(endDate) <= 0) {
        pendapatanSaatIni = transaksi.getTotalPendapatan(); 
    }

    
    return pendapatanSaatIni.add(hitungPendapatanRekursif(daftarTransaksi, startDate, endDate, index + 1)); 
}
    
    public static void printRunningTime(String metode, long startTime, long endTime) {
        long duration = endTime - startTime; 
        System.out.println("Waktu eksekusi (" + metode + "): " + duration + " nanodetik");
    }
    
   public static int hitungTotalTransaksiIteratif(ArrayList<Transaksi> daftarTransaksi) {
    int total = 0;
    for (Transaksi transaksi : daftarTransaksi) {
        total++; 
    }
    return total;
}
   
   public static int hitungTotalTransaksiRekursif(ArrayList<Transaksi> daftarTransaksi, int index) {
    if (index == daftarTransaksi.size()) {
        return 0;
    }
    return 1 + hitungTotalTransaksiRekursif(daftarTransaksi, index + 1);
}
   
    public static void main(String[] args) {
        KF.MainMenu.setVisible(true);
        
    }
   
}
