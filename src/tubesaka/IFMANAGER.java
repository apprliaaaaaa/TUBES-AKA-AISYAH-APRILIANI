/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesaka;

import com.toedter.calendar.JDateChooser;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class IFMANAGER extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFMANAGER
     */
    public IFMANAGER() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PANELKONTEN = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        totalPendapatanField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        hitungPendapatan = new rojeru_san.RSButton();
        endDateChooser = new com.toedter.calendar.JDateChooser();
        startDateChooser = new com.toedter.calendar.JDateChooser();
        btnTotalTransaksi = new rojeru_san.RSButton();
        totalPendapatanField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        PANELKONTEN.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(136, 148, 148));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hitung Total Pendapatan");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(136, 148, 148));
        jLabel6.setText("Dari");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(136, 148, 148));
        jLabel7.setText("Sampai");

        totalPendapatanField.setEditable(false);
        totalPendapatanField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPendapatanFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(136, 148, 148));
        jLabel8.setText("Total Transaksi");

        hitungPendapatan.setBackground(new java.awt.Color(213, 227, 201));
        hitungPendapatan.setText("Hitung");
        hitungPendapatan.setColorHover(new java.awt.Color(153, 153, 153));
        hitungPendapatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungPendapatanActionPerformed(evt);
            }
        });

        btnTotalTransaksi.setBackground(new java.awt.Color(213, 227, 201));
        btnTotalTransaksi.setText("Total Transaksi");
        btnTotalTransaksi.setColorHover(new java.awt.Color(153, 153, 153));
        btnTotalTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalTransaksiActionPerformed(evt);
            }
        });

        totalPendapatanField1.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(136, 148, 148));
        jLabel9.setText("Total Pendapatan");

        javax.swing.GroupLayout PANELKONTENLayout = new javax.swing.GroupLayout(PANELKONTEN);
        PANELKONTEN.setLayout(PANELKONTENLayout);
        PANELKONTENLayout.setHorizontalGroup(
            PANELKONTENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELKONTENLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(PANELKONTENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(PANELKONTENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hitungPendapatan, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                    .addComponent(btnTotalTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(endDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(startDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalPendapatanField)
                    .addComponent(totalPendapatanField1))
                .addGap(238, 238, 238))
            .addGroup(PANELKONTENLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PANELKONTENLayout.setVerticalGroup(
            PANELKONTENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELKONTENLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PANELKONTENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PANELKONTENLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6))
                    .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PANELKONTENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PANELKONTENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(totalPendapatanField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PANELKONTENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalPendapatanField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(hitungPendapatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTotalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PANELKONTEN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PANELKONTEN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hitungPendapatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungPendapatanActionPerformed
    
        
// Ambil tanggal dari JDateChooser
    Date startDate = startDateChooser.getDate();
    Date endDate = endDateChooser.getDate();

    // Validasi input tanggal
    if (startDate == null || endDate == null) {
        JOptionPane.showMessageDialog(this, "Harap pilih tanggal awal dan akhir!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validasi daftar transaksi
    if (POSApplication.daftarTransaksi.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Tidak ada transaksi yang tersedia untuk dihitung!", "Info", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    // Menampilkan dialog pilihan metode perhitungan
String[] options = {"Iteratif", "Rekursif"};
int choice = JOptionPane.showOptionDialog(
    null,
    "Pilih metode perhitungan total pendapatan:",
    "Metode Perhitungan",
    JOptionPane.DEFAULT_OPTION,
    JOptionPane.INFORMATION_MESSAGE,
    null,
    options,
    options[0]
);
// Menggunakan BigInteger untuk totalPendapatan
BigInteger totalPendapatan = BigInteger.ZERO; // Menggunakan BigInteger

// Pengukuran waktu eksekusi
long startTime, endTime;

// Menggunakan BigInteger
if (choice == 0) { // Iteratif
    // Mencatat waktu mulai dan selesai
    startTime = System.nanoTime();
    totalPendapatan = POSApplication.hitungPendapatanIteratif(POSApplication.daftarTransaksi, startDate, endDate);
    endTime = System.nanoTime();

    // Menampilkan hasil total pendapatan dalam field
    totalPendapatanField.setText(totalPendapatan.toString() + ": hasil dari iteratif");

    // Menampilkan waktu eksekusi
    POSApplication.printRunningTime("Iteratif", startTime, endTime);
} else if (choice == 1) { // Rekursif
    // Mencatat waktu mulai dan selesai
    startTime = System.nanoTime();
    totalPendapatan = POSApplication.hitungPendapatanRekursif(POSApplication.daftarTransaksi, startDate, endDate, 0);
    endTime = System.nanoTime();

    // Menampilkan hasil total pendapatan dalam field
    totalPendapatanField.setText(totalPendapatan.toString() + ": hasil dari rekursif");

    // Menampilkan waktu eksekusi
    POSApplication.printRunningTime("Rekursif", startTime, endTime);
}


    
    
 
    
    }//GEN-LAST:event_hitungPendapatanActionPerformed

    private void btnTotalTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalTransaksiActionPerformed

      
    String[] options = {"Iteratif", "Rekursif"};
    int choice = JOptionPane.showOptionDialog(
        null,
        "Pilih metode perhitungan total transaksi:",
        "Metode Perhitungan",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        null,
        options,
        options[0]
    );

   
    int totalTransaksi = 0;

    
    if (choice == 0) { // Iteratif
        totalTransaksi = POSApplication.hitungTotalTransaksiIteratif(POSApplication.daftarTransaksi);
        totalPendapatanField1.setText("" + totalTransaksi + "  : hasil dari iteratif");
    } else if (choice == 1) { // Rekursif
        totalTransaksi = POSApplication.hitungTotalTransaksiRekursif(POSApplication.daftarTransaksi, 0);
        totalPendapatanField1.setText("" + totalTransaksi + "  : hasil dari rekursif");
    }

   
    
    }//GEN-LAST:event_btnTotalTransaksiActionPerformed

    private void totalPendapatanFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPendapatanFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPendapatanFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PANELKONTEN;
    private rojeru_san.RSButton btnTotalTransaksi;
    private com.toedter.calendar.JDateChooser endDateChooser;
    private rojeru_san.RSButton hitungPendapatan;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser startDateChooser;
    private javax.swing.JTextField totalPendapatanField;
    private javax.swing.JTextField totalPendapatanField1;
    // End of variables declaration//GEN-END:variables
}

