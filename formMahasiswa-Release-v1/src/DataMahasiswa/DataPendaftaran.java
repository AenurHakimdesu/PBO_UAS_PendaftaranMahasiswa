/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DataMahasiswa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import Models.ModelPendaftaran;

/**
 *
 * @author HP
 */
public class DataPendaftaran extends javax.swing.JFrame {
        
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        static final String DB_URL = "jdbc:mysql://localhost/db_pendaftaranmhs";
        static final String USER = "root";
        static final String PASS = "";
        
        List<ModelPendaftaran> items = new ArrayList<>();
        static Connection conn;
        static Statement stmt;
        static ResultSet rs;

    /**
     * Creates new form DataPendaftaran
     */
    public DataPendaftaran() {
        initComponents();
        btnEditPendaftaran.setEnabled(false);
        btnHapusPendaftaran.setEnabled(false);
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
        fldNamaSiswa = new javax.swing.JTextField();
        fldTgl = new javax.swing.JTextField();
        fldAsal = new javax.swing.JTextField();
        fldIDWali = new javax.swing.JTextField();
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
        fldAsalSklh = new javax.swing.JTextField();
        btnKeluar = new javax.swing.JButton();
        fld_Id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Pendaftaran Mahasiswa");
        setPreferredSize(new java.awt.Dimension(967, 618));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORMULIR PENDAFTARAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 22, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA SISWA :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ASAL SEKOLAH :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("JENIS KELAMIN :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("KOTA ASAL:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID WALI :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EMAIL SISWA :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        fldNamaSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fldNamaSiswaMouseClicked(evt);
            }
        });
        fldNamaSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldNamaSiswaActionPerformed(evt);
            }
        });
        getContentPane().add(fldNamaSiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 65, 683, -1));
        getContentPane().add(fldTgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 99, 683, -1));

        fldAsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAsalActionPerformed(evt);
            }
        });
        getContentPane().add(fldAsal, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 219, 683, -1));

        fldIDWali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldIDWaliActionPerformed(evt);
            }
        });
        getContentPane().add(fldIDWali, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 250, 683, -1));
        getContentPane().add(fldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 284, 683, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PILIHAN PRODI :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 326, -1, -1));

        cbKlmn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIH--", "Laki-Laki", "Perempuan" }));
        getContentPane().add(cbKlmn, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 179, 386, -1));

        cbProdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIH--", "1. Teknik Informatika S1", "2. Sistem Informasi S1", "3. Desain Komunikasi Visual S1", "4. Film dan Televisi S1", "5. Akuntansi S1", "6. Manajemen S1", "7. Bahasa Inggris S1", "8. Sastra Jepang S1", "9. Kesehatan Masyarakat S1", "10. Teknik Elektro S1", "11. Teknik Industri", "12. Teknik Biomedis S1", "13. Kedokteran" }));
        cbProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProdiActionPerformed(evt);
            }
        });
        getContentPane().add(cbProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 323, 386, -1));

        btnSimpanPendaftaran.setText("SIMPAN");
        btnSimpanPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanPendaftaranActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpanPendaftaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 365, -1, -1));

        btnHapusPendaftaran.setText("HAPUS");
        btnHapusPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusPendaftaranActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapusPendaftaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 365, -1, -1));

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
        tblDataMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDataMhs);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 406, 910, 144));

        btnEditPendaftaran.setText("EDIT");
        btnEditPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPendaftaranActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditPendaftaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 365, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TANGGAL LAHIR :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        getContentPane().add(fldAsalSklh, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 139, 683, -1));

        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 365, -1, -1));
        getContentPane().add(fld_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(934, 65, 0, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/background1.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/background1.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fldNamaSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldNamaSiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldNamaSiswaActionPerformed

    private void btnSimpanPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanPendaftaranActionPerformed
        // TODO add your handling code here:
        String nama_siswa = fldNamaSiswa.getText();
        String tgl_lahir = fldTgl.getText();
        String asal_sekolah = fldAsalSklh.getText();
        String jenis_kelamin = cbKlmn.getSelectedItem().toString();
        String kota_asal = fldAsal.getText();
        String id_wali = fldIDWali.getText();
        String email_siswa = fldEmail.getText();
        int id_prodi = cbProdi.getSelectedIndex();
        
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            String sql = 
            "INSERT INTO data_mhs (Nama_Siswa, Tgl_Lahir, Asal_Sekolah, Jenis_Kelamin, Kota_Asal, Email_Siswa, ID_Wali, ID_Prodi) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, nama_siswa);
            ps.setString(2, tgl_lahir);
            ps.setString(3, asal_sekolah);
            ps.setString(4, jenis_kelamin);
            ps.setString(5, kota_asal);
            ps.setString(6, email_siswa);
            ps.setString(7, id_wali);
            ps.setInt(8, id_prodi);
            
            ps.execute();
            stmt.close();
            conn.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        showTableData();
    }//GEN-LAST:event_btnSimpanPendaftaranActionPerformed

    private void cbProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProdiActionPerformed

    private void btnEditPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPendaftaranActionPerformed
        // TODO add your handling code here:
        String nama_siswa = fldNamaSiswa.getText();
        String tanggal_lahir = fldTgl.getText();
        String asal_sekolah = fldAsalSklh.getText();
        String jenis_kelamin = cbKlmn.getSelectedItem().toString();
        String kota_asal = fldAsal.getText();
        String id_wali = fldIDWali.getText();
        String email_siswa = fldEmail.getText();
        int id_prodi = cbProdi.getSelectedIndex();
        int id = Integer.parseInt(fld_Id.getText());
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            String sql = "UPDATE data_mhs SET Nama_Siswa = ?, Tgl_Lahir = ?, Asal_Sekolah = ?, Jenis_Kelamin = ?, Kota_Asal = ?, ID_Wali = ?, Email_Siswa = ?, ID_Prodi = ? WHERE ID_Siswa = ? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, nama_siswa);
            ps.setString(2, tanggal_lahir);
            ps.setString(3, asal_sekolah);
            ps.setString(4, jenis_kelamin);
            ps.setString(5, kota_asal);
            ps.setString(6, id_wali);
            ps.setString(7, email_siswa);
            ps.setInt(8, id_prodi);
            ps.setInt(9, id);
            
            ps.execute();
            ps.close();
            stmt.close();
            conn.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        showTableData();
    }//GEN-LAST:event_btnEditPendaftaranActionPerformed

    private void fldIDWaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldIDWaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldIDWaliActionPerformed

    private void fldAsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAsalActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        showTableData();
    }//GEN-LAST:event_formWindowOpened

    private void btnHapusPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusPendaftaranActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(fld_Id.getText());
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            String sql = "DELETE from data_mhs WHERE ID_Siswa = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, id);
            ps.execute();
            
            ps.close();
            stmt.close();
            conn.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        showTableData();
    }//GEN-LAST:event_btnHapusPendaftaranActionPerformed

    private void tblDataMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMhsMouseClicked
        // TODO add your handling code here:
        getData();
        btnSimpanPendaftaran.setEnabled(false);
        btnEditPendaftaran.setEnabled(true);
        btnHapusPendaftaran.setEnabled(true);
    }//GEN-LAST:event_tblDataMhsMouseClicked

    private void fldNamaSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fldNamaSiswaMouseClicked
        // TODO add your handling code here:
        btnSimpanPendaftaran.setEnabled(true);
    }//GEN-LAST:event_fldNamaSiswaMouseClicked
    
    public void showTableData() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID SISWA");
            model.addColumn("NAMA SISWA");
            model.addColumn("TANGGAL LAHIR");
            model.addColumn("ASAL SEKOLAH");
            model.addColumn("JENIS KELAMIN");
            model.addColumn("KOTA ASAL");
            model.addColumn("EMAIL SISWA");
            model.addColumn("ID WALI");
            model.addColumn("ID PRODI");
            stmt = conn.createStatement();
            
            String sql = "SELECT * FROM data_mhs";
            items.clear();
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                items.add(new ModelPendaftaran(rs.getInt("ID_Siswa"),rs.getString("Nama_Siswa"),rs.getString("Tgl_Lahir"),rs.getString("Asal_Sekolah"),rs.getString("Jenis_Kelamin"),rs.getString("Kota_Asal"),rs.getString("Email_Siswa"),rs.getInt("ID_Wali"),rs.getInt("ID_Prodi")));
            }
            int i = 1;
            for (ModelPendaftaran p : items) {
                model.addRow(new Object[]{
                    i,
                    p.getNama_Siswa(),
                    p.getTgl_Lahir(),
                    p.getAsal_Sekolah(),
                    p.getJenis_Kelamin(),
                    p.getKota_Asal(),
                    p.getEmail_Siswa(),
                    p.getID_Wali(),
                    p.getID_Prodi()
                });
                i++;
            }
            
            rs.close();
            stmt.close();
            tblDataMhs.setModel(model);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void getData() {
        int baris = tblDataMhs.getSelectedRow();
        fldNamaSiswa.setText(items.get(baris).getNama_Siswa());
        fldTgl.setText(items.get(baris).getTgl_Lahir());
        fldAsalSklh.setText(items.get(baris).getAsal_Sekolah());
        cbKlmn.setSelectedItem(items.get(baris).getJenis_Kelamin());
        fldAsal.setText(items.get(baris).getKota_Asal());
        fldIDWali.setText(String.valueOf(items.get(baris).getID_Wali()));
        fldEmail.setText(items.get(baris).getEmail_Siswa());
        cbProdi.setSelectedIndex(items.get(baris).getID_Prodi());
        fld_Id.setVisible(false);
        fld_Id.setText(Integer.toString(items.get(baris).getID_Siswa()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditPendaftaran;
    private javax.swing.JButton btnHapusPendaftaran;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpanPendaftaran;
    private javax.swing.JComboBox<String> cbKlmn;
    private javax.swing.JComboBox<String> cbProdi;
    private javax.swing.JTextField fldAsal;
    private javax.swing.JTextField fldAsalSklh;
    private javax.swing.JTextField fldEmail;
    private javax.swing.JTextField fldIDWali;
    private javax.swing.JTextField fldNamaSiswa;
    private javax.swing.JTextField fldTgl;
    private javax.swing.JTextField fld_Id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDataMhs;
    // End of variables declaration//GEN-END:variables
}
