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
  
    if (index >= daftar.size()) {
        return 0;
    }

    
    Transaksi transaksi = daftar.get(index);

    
    if (transaksi.getTanggalTransaksi().compareTo(start) >= 0 &&
        transaksi.getTanggalTransaksi().compareTo(end) <= 0) {
        return transaksi.getTotalPendapatan() + 
               hitungPendapatanRekursif(daftar, index + 1, start, end);
    } else {
        
        return hitungPendapatanRekursif(daftar, index + 1, start, end);
    }
}
   public static int hitungTotalTransaksi(ArrayList<Transaksi> daftarTransaksi) {
    int total = 0;

   
    for (Transaksi transaksi : daftarTransaksi) {
        total++; 
    }

    return total;
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
