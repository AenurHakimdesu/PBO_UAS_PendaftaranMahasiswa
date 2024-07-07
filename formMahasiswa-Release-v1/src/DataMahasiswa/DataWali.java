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
import Models.ModelWali;

/**
 *
 * @author HP
 */
public class DataWali extends javax.swing.JFrame {
    
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        static final String DB_URL = "jdbc:mysql://localhost/db_pendaftaranmhs";
        static final String USER = "root";
        static final String PASS = "";
        
        List<ModelWali> items = new ArrayList<>();
        static Connection conn;
        static Statement stmt;
        static ResultSet rs;

    /**
     * Creates new form DataWali
     */
    public DataWali() {
        initComponents();
        btnEditWali.setEnabled(false);
        btnHapusWali.setEnabled(false);
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
        btnSimpanWali = new javax.swing.JButton();
        btnHapusWali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataWali = new javax.swing.JTable();
        fldNamaWali = new javax.swing.JTextField();
        btnEditWali = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fldUmurWali = new javax.swing.JTextField();
        cbKlmnWali = new javax.swing.JComboBox<>();
        fld_id_wali = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Wali Mahasiswa");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA WALI MAHASISWA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA WALI :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 96, -1, -1));

        btnSimpanWali.setText("SIMPAN");
        btnSimpanWali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanWaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpanWali, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 215, -1, -1));

        btnHapusWali.setText("HAPUS");
        btnHapusWali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusWaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapusWali, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 215, -1, -1));

        tblDataWali.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID WALI", "NAMA WALI", "JENIS KELAMIN", "UMUR"
            }
        ));
        tblDataWali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataWaliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDataWali);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 256, 934, 330));

        fldNamaWali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fldNamaWaliMouseClicked(evt);
            }
        });
        fldNamaWali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldNamaWaliActionPerformed(evt);
            }
        });
        getContentPane().add(fldNamaWali, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 93, 688, -1));

        btnEditWali.setText("EDIT");
        btnEditWali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditWaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditWali, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 215, -1, -1));

        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 215, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("JENIS KELAMIN:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 136, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("UMUR:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 176, -1, -1));

        fldUmurWali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldUmurWaliActionPerformed(evt);
            }
        });
        getContentPane().add(fldUmurWali, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 173, 690, -1));

        cbKlmnWali.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIH--", "Laki-Laki", "Perempuan" }));
        getContentPane().add(cbKlmnWali, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 133, 340, -1));
        getContentPane().add(fld_id_wali, new org.netbeans.lib.awtextra.AbsoluteConstraints(947, 93, 0, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/background1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanWaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanWaliActionPerformed
        // TODO add your handling code here:
        String nama_wali = fldNamaWali.getText();
        String jenis_kelamin_wali = cbKlmnWali.getSelectedItem().toString();
        String umur_wali = fldUmurWali.getText();
        
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            String sql = 
            "INSERT INTO wali_mhs (Nama_Wali, Jenis_Kelamin, Umur) VALUES (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, nama_wali);
            ps.setString(2, jenis_kelamin_wali);
            ps.setString(3, umur_wali);
            
            ps.execute();
            stmt.close();
            conn.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        showTableData();
    }//GEN-LAST:event_btnSimpanWaliActionPerformed

    private void fldNamaWaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldNamaWaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldNamaWaliActionPerformed

    private void btnEditWaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditWaliActionPerformed
        // TODO add your handling code here:
        String nama_wali = fldNamaWali.getText();
        String jenis_kelamin_wali = cbKlmnWali.getSelectedItem().toString();
        Integer umur_wali = Integer.parseInt(fldUmurWali.getText());
        int id = Integer.parseInt(fld_id_wali.getText());
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            String sql = "UPDATE wali_mhs SET Nama_Wali = ?, Jenis_Kelamin = ?, Umur = ? WHERE ID_Wali = ? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, nama_wali);
            ps.setString(2, jenis_kelamin_wali);
            ps.setInt(3, umur_wali);
            ps.setInt(4, id);
            
            ps.execute();
            ps.close();
            stmt.close();
            conn.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        showTableData();
    }//GEN-LAST:event_btnEditWaliActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        showTableData();
    }//GEN-LAST:event_formWindowOpened

    private void fldUmurWaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldUmurWaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldUmurWaliActionPerformed

    private void btnHapusWaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusWaliActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(fld_id_wali.getText());
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            String sql = "DELETE from wali_mhs WHERE ID_Wali = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ps.close();
            stmt.close();
            conn.close();
            showTableData();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHapusWaliActionPerformed

    private void tblDataWaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataWaliMouseClicked
        // TODO add your handling code here:
        getData();
        btnSimpanWali.setEnabled(false);
        btnEditWali.setEnabled(true);
        btnHapusWali.setEnabled(true);
    }//GEN-LAST:event_tblDataWaliMouseClicked

    private void fldNamaWaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fldNamaWaliMouseClicked
        // TODO add your handling code here:
        btnSimpanWali.setEnabled(true);
    }//GEN-LAST:event_fldNamaWaliMouseClicked

    public void showTableData() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID WALI");
            model.addColumn("NAMA WALI");
            model.addColumn("JENIS KELAMIN WALI");
            model.addColumn("UMUR WALI");

            stmt = conn.createStatement();
            String sql = "SELECT * FROM wali_mhs";
            items.clear();
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                items.add(new ModelWali(rs.getInt("ID_Wali"),rs.getString("Nama_Wali"),rs.getString("Jenis_Kelamin"),rs.getString("Umur")));
            }
            int i = 1;
            for (ModelWali p : items) {
                model.addRow(new Object[]{
                    i,
                    p.getNama_Wali(),
                    p.getJenis_Kelamin_Wali(),
                    p.getUmur_Wali()
                });
                i++;
            }
            
            rs.close();
            stmt.close();
            tblDataWali.setModel(model);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void getData() {
        int baris = tblDataWali.getSelectedRow();
        fldNamaWali.setText(items.get(baris).getNama_Wali());
        cbKlmnWali.setSelectedItem(items.get(baris).getJenis_Kelamin_Wali());
        fldUmurWali.setText(items.get(baris).getUmur_Wali());
        fld_id_wali.setVisible(false);
        fld_id_wali.setText(Integer.toString(items.get(baris).getID_Wali()));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditWali;
    private javax.swing.JButton btnHapusWali;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpanWali;
    private javax.swing.JComboBox<String> cbKlmnWali;
    private javax.swing.JTextField fldNamaWali;
    private javax.swing.JTextField fldUmurWali;
    private javax.swing.JTextField fld_id_wali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDataWali;
    // End of variables declaration//GEN-END:variables
}
