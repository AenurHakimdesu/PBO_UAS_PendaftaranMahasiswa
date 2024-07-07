/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DataMahasiswa;

/**
 *
 * @author HP
 */
public class DataPendaftaran extends javax.swing.JFrame {

    /**
     * Creates new form DataPendaftaran
     */
    public DataPendaftaran() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fldNamaMhs = new javax.swing.JTextField();
        fldTgl = new javax.swing.JTextField();
        fldAsal = new javax.swing.JTextField();
        fldNamaWali = new javax.swing.JTextField();
        fldEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbKlmn = new javax.swing.JComboBox<>();
        cbProdi = new javax.swing.JComboBox<>();
        btnSimpanPendaftaran = new javax.swing.JButton();
        btnHapusPendaftaran = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataMhs = new javax.swing.JTable();
        btnEditPendaftaran = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fldAsalsklh = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("FORMULIR PENDAFTARAN");

        jLabel2.setText("NAMA SISWA :");

        jLabel3.setText("ASAL SEKOLAH :");

        jLabel4.setText("JENIS KELAMIN :");

        jLabel5.setText("KOTA ASAL:");

        jLabel6.setText("NAMA WALI :");

        jLabel8.setText("EMAIL SISWA :");

        fldNamaMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldNamaMhsActionPerformed(evt);
            }
        });

        fldAsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAsalActionPerformed(evt);
            }
        });

        fldNamaWali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldNamaWaliActionPerformed(evt);
            }
        });

        jLabel10.setText("PILIHAN PRODI :");

        cbKlmn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIH--", "Laki-Laki", "Perempuan" }));

        cbProdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIH--", "Teknik Informatika S1", "Sistem Informasi S1", "Desain Komunikasi Visual S1", "Film dan Televisi S1", "Akuntansi S1", "Manajemen S1", "Bahasa Inggris S1", "Sastra Jepang S1", "Kesehatan Masyarakat S1", "Teknik Elektro S1", "Teknik Industri S1", "Teknik Biomedis", "Kedokteran S1" }));
        cbProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProdiActionPerformed(evt);
            }
        });

        btnSimpanPendaftaran.setText("SIMPAN");
        btnSimpanPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanPendaftaranActionPerformed(evt);
            }
        });

        btnHapusPendaftaran.setText("HAPUS");

        tblDataMhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID SISWA", "NAMA SISWA", "ASAL SEKOLAH", "JENIS KELAMIN", "KOTA ASAL", "EMAIL SISWA", "ID WALI", "ID PRODI"
            }
        ));
        jScrollPane1.setViewportView(tblDataMhs);

        btnEditPendaftaran.setText("EDIT");
        btnEditPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPendaftaranActionPerformed(evt);
            }
        });

        jLabel7.setText("TANGGAL LAHIR :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(1, 1, 1)))
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fldTgl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                    .addComponent(fldAsalsklh, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbKlmn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnEditPendaftaran)
                        .addGap(38, 38, 38)
                        .addComponent(btnHapusPendaftaran))
                    .addComponent(fldAsal, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fldNamaMhs))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(366, 366, 366))
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(btnSimpanPendaftaran)
                .addGap(0, 655, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fldNamaWali, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                    .addComponent(cbProdi, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fldEmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldNamaMhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(fldAsalsklh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbKlmn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldNamaWali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanPendaftaran)
                    .addComponent(btnHapusPendaftaran)
                    .addComponent(btnEditPendaftaran))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fldNamaMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldNamaMhsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldNamaMhsActionPerformed

    private void btnSimpanPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanPendaftaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanPendaftaranActionPerformed

    private void cbProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProdiActionPerformed

    private void btnEditPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPendaftaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditPendaftaranActionPerformed

    private void fldNamaWaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldNamaWaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldNamaWaliActionPerformed

    private void fldAsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAsalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DataPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataPendaftaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditPendaftaran;
    private javax.swing.JButton btnHapusPendaftaran;
    private javax.swing.JButton btnSimpanPendaftaran;
    private javax.swing.JComboBox<String> cbKlmn;
    private javax.swing.JComboBox<String> cbProdi;
    private javax.swing.JTextField fldAsal;
    private javax.swing.JTextField fldAsalsklh;
    private javax.swing.JTextField fldEmail;
    private javax.swing.JTextField fldNamaMhs;
    private javax.swing.JTextField fldNamaWali;
    private javax.swing.JTextField fldTgl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDataMhs;
    // End of variables declaration//GEN-END:variables
}
