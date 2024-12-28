/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesaka;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
/**
 *
 * @author dell
 */
public class POSApplication {
     public static ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();
   
     public static BigInteger hitungPendapatanIteratif
   (ArrayList<Transaksi> daftarTransaksi, Date startDate, Date endDate) {
    BigInteger totalPendapatan = BigInteger.ZERO;
    for (Transaksi transaksi : daftarTransaksi) {
        if (transaksi != null 
            && transaksi.getTanggal() != null 
            && transaksi.getTanggal().compareTo(startDate) >= 0 
            && transaksi.getTanggal().compareTo(endDate) <= 0) {
            totalPendapatan = totalPendapatan.add(transaksi.getTotalPendapatan());
        }
    }
    return totalPendapatan;
}

    
   public static BigInteger hitungPendapatanRekursif
   (ArrayList<Transaksi> daftarTransaksi, Date startDate, Date endDate, int index) {
    if (daftarTransaksi == null || index == daftarTransaksi.size()) {
        return BigInteger.ZERO;
    }
    Transaksi transaksi = daftarTransaksi.get(index);
    BigInteger pendapatanSaatIni = BigInteger.ZERO;
    if (transaksi != null 
        && transaksi.getTanggal() != null 
        && transaksi.getTanggal().compareTo(startDate) >= 0 
        && transaksi.getTanggal().compareTo(endDate) <= 0) {
        pendapatanSaatIni = transaksi.getTotalPendapatan();
    }
    return pendapatanSaatIni.add(hitungPendapatanRekursif
        (daftarTransaksi, startDate, endDate, index + 1));
}

    
    public static void printRunningTime(String metode, long startTime, long endTime) {
        long duration = endTime - startTime; 
        System.out.println("Waktu eksekusi (" + metode + "): " + duration + " nanodetik");
    }
    
 public static void generateData(int size) {
    daftarTransaksi.clear();
    Random random = new Random();

    for (int i = 0; i < size; i++) {
        String namaBarang = "Barang " + (i + 1);
        BigInteger harga = BigInteger.valueOf(random.nextInt(5000) + 1000); // Harga antara 1000-6000
        BigInteger jumlah = BigInteger.valueOf(random.nextInt(50) + 1);     // Jumlah antara 1-50
        Date tanggal = new Date(System.currentTimeMillis() - random.nextInt(1000000000)); // Random tanggal
        daftarTransaksi.add(new Transaksi(namaBarang, harga, jumlah, tanggal));
    }
}


public static void tampilkanGrafikLineChart() {
    // Periksa apakah ada data transaksi
    if (daftarTransaksi.isEmpty()) {
        System.out.println("Tidak ada data untuk ditampilkan pada grafik.");
        return;
    }

    XYSeries seriesIteratif = new XYSeries("Iteratif");
    XYSeries seriesRekursif = new XYSeries("Rekursif");

    int[] kelipatan = {10, 100, 1000};

    for (int size : kelipatan) {
        if (size > daftarTransaksi.size()) {
            break; 
        }

    
        ArrayList<Transaksi> subset = new ArrayList<>(daftarTransaksi.subList(0, size));
        Date startDate = subset.get(0).getTanggal();
        Date endDate = subset.get(subset.size() - 1).getTanggal();

        // Hitung waktu eksekusi untuk algoritma iteratif
        long startTimeIteratif = System.nanoTime();
        hitungPendapatanIteratif(subset, startDate, endDate);
        long endTimeIteratif = System.nanoTime();
        double timeIteratifInSeconds = (endTimeIteratif - startTimeIteratif) / 1_000_000_000.0;
         System.out.println(timeIteratifInSeconds + "   ini itaratif");

        // Hitung waktu eksekusi untuk algoritma rekursif
        long startTimeRekursif = System.nanoTime();
        hitungPendapatanRekursif(subset, startDate, endDate, 0);
        long endTimeRekursif = System.nanoTime();
        double timeRekursifInSeconds = (endTimeRekursif - startTimeRekursif) / 1_000_000_000.0;
        System.out.println(timeRekursifInSeconds + "     ini rekursif");
        // Tambahkan hasil ke dataset grafik
        seriesIteratif.add(size, timeIteratifInSeconds);
        seriesRekursif.add(size, timeRekursifInSeconds);
               
                
    }

    // Gabungkan dataset ke dalam satu koleksi
    XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(seriesIteratif);
    dataset.addSeries(seriesRekursif);

    // Buat grafik line chart
    JFreeChart chart = ChartFactory.createXYLineChart(
        "Perbandingan Waktu Eksekusi",
        "Input Size (n)",
        "Waktu Eksekusi (nano detik)",
        dataset,
        PlotOrientation.VERTICAL,
        true,
        true,
        false
    );

    // Tampilkan grafik dalam sebuah frame
    ChartPanel panel = new ChartPanel(chart);
    JFrame frame = new JFrame("Grafik Line Chart");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.getContentPane().add(panel);
    frame.pack();
    frame.setVisible(true);
}


 

  
    public static void main(String[] args) {
        KF.MainMenu.setVisible(true);
        
    }
   
}
