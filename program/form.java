/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package program;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class form extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    Connection cn = koneksi.conn();
    
    public form() {
        initComponents();
        TampilData();
    }


    private void Bersih(){
        txtNIK.setText("");
        txtNama.setText("");
        txtTlp.setText("");
        txtAlm.setText("");
   }
    private void TampilData(){
        try{
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM biodata");
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("no.");
            model.addColumn("nik");
            model.addColumn("nama");
            model.addColumn("telpon");
            model.addColumn("alamat");
            
            int no = 1;
            
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.setRowCount(0);
            
            while (rs.next()) {
              Object[] data = {
                    no ++,
                  rs.getString("nik"),
                  rs.getString("nama"),
                  rs.getString("telpon"),
                  rs.getString("alamat"),
              };
                model.addRow(data);
                tblData.setModel(model);
            }  
        } catch (Exception e){
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNIK = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtTlp = new javax.swing.JTextField();
        txtAlm = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        cmbCari = new javax.swing.JComboBox<>();
        txtCari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIK");

        jLabel2.setText("Nama Lengkap");

        jLabel3.setText("Telepon");

        jLabel4.setText("Alamat");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIK", "Nama Lengkap", "Telepon", "Alamat"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        jLabel5.setText("Cari Data");

        cmbCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIK", "nama" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNIK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTlp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAlm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCari, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCari)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNIK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus)
                    .addComponent(btnBatal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
        st = cn.createStatement();
        if (txtNIK.getText().equals("") || txtTlp.getText().equals("") || txtNama.getText().equals("") || txtAlm.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Data Tidak boleh kosong ya", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (btnSimpan.getText().equals("Simpan")) {
            String cek = "SELECT * FROM biodata WHERE NIK = '" + txtNIK.getText() + "'";
            rs = st.executeQuery(cek);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "NIK sudah ada");   
            } else {
                String sql = "INSERT INTO biodata (NIK, Nama, Telpon, Alamat) VALUES ('" + 
                             txtNIK.getText() + "', '" + 
                             txtNama.getText() + "', '" + 
                             txtTlp.getText() + "', '" + 
                             txtAlm.getText() + "')";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                Bersih();
<<<<<<< HEAD
                TampilData(); 
            } 
        } else {
            String sql = "UPDATE biodata SET Nama = ?, Telpon = ?, Alamat = ? WHERE NIK = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, txtNama.getText());
            ps.setString(2, txtTlp.getText());
            ps.setString(3, txtAlm.getText());
            ps.setString(4, txtNIK.getText());
            ps.executeUpdate();
            ps.close();

            JOptionPane.showMessageDialog(this, "Data berhasil diubah");
            Bersih();
            TampilData(); 
=======
                TampilData();
            } 
            
            
        } else {
        
>>>>>>> 3290f20547afeed543d66369ed20601389c5be45
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
<<<<<<< HEAD
      try {
        String nik = txtNIK.getText(); 
        if (nik.isEmpty()) {
            JOptionPane.showMessageDialog(this, "NIK tidak boleh kosong!");
            return;
        }
        String sql = "DELETE FROM biodata WHERE NIK = '" + nik + "'";
        st = cn.createStatement();
        int rowsAffected = st.executeUpdate(sql);

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
            Bersih(); 
            TampilData(); 
        } else {
            JOptionPane.showMessageDialog(this, "Data dengan NIK " + nik + " tidak ditemukan!");
            System.out.println("Data tidak ditemukan.");
        }
    } catch (Exception e) {
        e.printStackTrace(); 
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
        System.out.println("Error: " + e.getMessage());
    }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
=======
        // TODO add your handling code here:
        if(txtNIK.getText() .equals("")){
            JOptionPane.showMessageDialog(this,"Silahkan pilih data yang ingin dihapus !");
        }else{
            int jawab = JOptionPane.showConfirmDialog(null,"Data ini akan dihapus, lanjutkan ?","Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (jawab == 0) {
                try{
                    st = cn.createStatement();
                    String sql = "DELETE FROM biodata WHERE NIK = '" + txtNIK.getText() + "'";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                    TampilData();
                    Bersih();
                }catch (Exception e) {
                     JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
>>>>>>> 3290f20547afeed543d66369ed20601389c5be45
        txtNIK.setText(tblData.getValueAt(tblData.getSelectedRow(), 1).toString());
        txtNama.setText(tblData.getValueAt(tblData.getSelectedRow(), 2).toString());
        txtTlp.setText(tblData.getValueAt(tblData.getSelectedRow(), 3).toString());
        txtAlm.setText(tblData.getValueAt(tblData.getSelectedRow(), 4).toString());
        
        txtNIK.setEditable(false);
        btnSimpan.setText("Ubah");
    }//GEN-LAST:event_tblDataMouseClicked

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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cmbCari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtAlm;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtNIK;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTlp;
    // End of variables declaration//GEN-END:variables
}
