/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendataancelanajeans;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PendataanCelana extends javax.swing.JFrame {
    
   PendataanCelanaControl Haryy = new PendataanCelanaControl();

    private boolean TAG = true;
        
    public PendataanCelana() {
        initComponents();
        clear();
    }
    private void clear() {
        tfNAMA.setEnabled(true);
        tfNAMA.setText("");
        tfALAMAT.setText("");
        tfQTY.setText("");
        tfHARGA.setText("");
        read();
    }
    private void read() {
        Haryy.read(tblDATA);

    }
     private boolean validasi() {
        if (tfNAMA.getText().isEmpty()
                || tfALAMAT.getText().isEmpty()
                || tfQTY.getText().isEmpty()
                || tfHARGA.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    private void save() {
        if (validasi()) {
            if (TAG) {
                create(); // true
            } else {
                update(); // false
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Inptan belum diisi!");
        }
    }

    private void create() {
        PendataanCelanaJeans b = new PendataanCelanaJeans();
        b.setNamakonsumen(tfNAMA.getText());
        b.setAlamat(tfALAMAT.getText());
        b.setJeniscelana(cbJENIS.getSelectedItem().toString());
        b.setUkuran(cbUKURAN.getSelectedItem().toString());
        b.setQty(Integer.valueOf(tfQTY.getText()));
        b.setHarga(Integer.valueOf(tfHARGA.getText()));
        Haryy.create(b);

        clear();
    }

    private void update() {
        PendataanCelanaJeans b = new PendataanCelanaJeans();
        b.setNamakonsumen(tfNAMA.getText());
        b.setAlamat(tfALAMAT.getText());
        String Hary = cbJENIS.getSelectedItem().toString();
        String ary = cbUKURAN.getSelectedItem().toString();
        b.setQty(Integer.valueOf(tfQTY.getText()));
        b.setHarga(Integer.valueOf(tfHARGA.getText()));
        Haryy.update(b);

        clear();
    }

    private void loadData() {
        int select = tblDATA.getSelectedRowCount();

        if (select == 0) {
            JOptionPane.showMessageDialog(rootPane, "Data Belum Dipilih!");
        } else {

            int pilih = JOptionPane.NO_OPTION;
            pilih = JOptionPane.showConfirmDialog(rootPane, "Yakin ingin Ubah!",
                    "Informasi", JOptionPane.YES_NO_OPTION, 2);

            if (pilih == JOptionPane.YES_OPTION) {
                int row = tblDATA.getSelectedRow();
                tfNAMA.setText(tblDATA.getValueAt(row, 0).toString());
                tfALAMAT.setText(tblDATA.getValueAt(row, 1).toString());
                cbJENIS.setText(tblDATA.getValueAt(row, 2).toString());
                cbUKURAN.setText(tblDATA.getValueAt(row, 3).toString());
                tfQTY.setText(tblDATA.getValueAt(row, 4).toString());
                tfHARGA.setText(tblDATA.getValueAt(row, 5).toString());

                tfALAMAT.setEnabled(false);
                TAG = false;
            }
        }
    }

    private void delete() {
        int select = tblDATA.getSelectedRowCount();

        if (select == 0) {
            JOptionPane.showMessageDialog(rootPane, "Data Belum Dipilih!");
        } else {

            int pilih = JOptionPane.NO_OPTION;
            pilih = JOptionPane.showConfirmDialog(rootPane, "Yakin ingin Hapus!",
                    "Informasi", JOptionPane.YES_NO_OPTION, 2);

            if (pilih == JOptionPane.YES_OPTION) {
                int row = tblDATA.getSelectedRow();

                int id = Integer.valueOf(tblDATA.getValueAt(row, 0).toString());
                Haryy.delete(id);

                clear();
            }
        }
    }

    private void search() {
        if (tfPENCARIAN.getText().isEmpty()) {
            clear();
        } else {
            Haryy.search(tblDATA, Integer.valueOf(tfPENCARIAN.getText()));
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        btnSIMPAN = new javax.swing.JButton();
        btnHAPUS = new javax.swing.JButton();
        cbJENIS = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        tfNAMA = new javax.swing.JTextField();
        tfALAMAT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbUKURAN = new javax.swing.JComboBox<>();
        btnUBAH = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDATA = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        tfQTY = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfHARGA = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfPENCARIAN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("NAMA KONSUMEN");

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jTextPane1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextPane1.setText("TOKO JEANS LEVI'S");
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        btnSIMPAN.setText("SIMPAN");
        btnSIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSIMPANActionPerformed(evt);
            }
        });

        btnHAPUS.setText("HAPUS");
        btnHAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHAPUSActionPerformed(evt);
            }
        });

        cbJENIS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Skinny Jeans", "Straight Jeans", "Hight-waist Jeans", "Wide-leg Jeans", "Flared Jeans", "Distressed Jeans", "Boyfriend Jeans", "Cropped Wide-Leg Jeans" }));

        tfNAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNAMAActionPerformed(evt);
            }
        });

        tfALAMAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfALAMATActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("ALAMAT");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("JENIS CELANA");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("UKURAN");

        cbUKURAN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL", "XLL", " ", " " }));
        cbUKURAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUKURANActionPerformed(evt);
            }
        });

        btnUBAH.setText("UBAH");
        btnUBAH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUBAHActionPerformed(evt);
            }
        });

        tblDATA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama Konsumen", "Alamat", "Jenis Celana", "Ukuran", "Qty", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDATA);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("QTY");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("HARGA");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("PENCARIAN");

        tfPENCARIAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPENCARIANActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addComponent(tfNAMA, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(257, 257, 257))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfPENCARIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfALAMAT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbUKURAN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbJENIS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfHARGA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                        .addComponent(tfQTY, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSIMPAN)
                        .addGap(18, 18, 18)
                        .addComponent(btnHAPUS)
                        .addGap(18, 18, 18)
                        .addComponent(btnUBAH)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(tfNAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfALAMAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbJENIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbUKURAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfHARGA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSIMPAN)
                        .addComponent(btnHAPUS)
                        .addComponent(btnUBAH))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(tfPENCARIAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSIMPANActionPerformed
save();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSIMPANActionPerformed

    private void tfNAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNAMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNAMAActionPerformed

    private void cbUKURANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUKURANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUKURANActionPerformed

    private void tfALAMATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfALAMATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfALAMATActionPerformed

    private void btnHAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHAPUSActionPerformed
delete();        // TODO add your handling code here:
    }//GEN-LAST:event_btnHAPUSActionPerformed

    private void btnUBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUBAHActionPerformed
loadData();        // TODO add your handling code here:
    }//GEN-LAST:event_btnUBAHActionPerformed

    private void tfPENCARIANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPENCARIANActionPerformed
search();        // TODO add your handling code here:
    }//GEN-LAST:event_tfPENCARIANActionPerformed

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
            java.util.logging.Logger.getLogger(PendataanCelana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PendataanCelana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PendataanCelana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PendataanCelana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PendataanCelana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHAPUS;
    private javax.swing.JButton btnSIMPAN;
    private javax.swing.JButton btnUBAH;
    private javax.swing.JComboBox<String> cbJENIS;
    private javax.swing.JComboBox<String> cbUKURAN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTable tblDATA;
    private javax.swing.JTextField tfALAMAT;
    private javax.swing.JTextField tfHARGA;
    private javax.swing.JTextField tfNAMA;
    private javax.swing.JTextField tfPENCARIAN;
    private javax.swing.JTextField tfQTY;
    // End of variables declaration//GEN-END:variables
}
