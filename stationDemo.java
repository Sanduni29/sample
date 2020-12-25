/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traintickets;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;

/**
 *
 * @author Sanduni Alwis
 */
public class stationDemo extends javax.swing.JFrame {

    /**
     * Creates new form stationDemo
     */
    public stationDemo() {
        initComponents();
        fillCombo();

        setResizable(true);
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();

        int xsize = (int) toolkit.getScreenSize().getWidth();
        int ysize = (int) toolkit.getScreenSize().getHeight();
        this.setSize(xsize, ysize);

        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

        String year = Selection.yeartxt.getValue().toString();
        yearl_demo.setText(year);
        String month = Selection.monthtxt.getValue().toString();
        monthl_demo.setText(month);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3307/odemetrics", "root", "");
            String code = Selection.codetxt.getText();
            String sql1 = "SELECT stname FROM station WHERE stcode = \"" + code + "\";";
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql1);

            if (rs.next()) {
                String name = rs.getString(1);
                namel_demo.setText(name);
            } else {
                JOptionPane.showMessageDialog(null, "error!");

            }

            con1.close();
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

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
        namel_demo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        returnedtkt_kni = new javax.swing.JTextField();
        bookedtkt_kni = new javax.swing.JTextField();
        submit_tabledemo = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_demo = new javax.swing.JTable();
        yearl_demo = new javax.swing.JLabel();
        monthl_demo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 64));

        namel_demo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("BOOKED TKT");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("RTN TKT");

        bookedtkt_kni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookedtkt_kniActionPerformed(evt);
            }
        });

        submit_tabledemo.setText("SUBMIT");
        submit_tabledemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_tabledemoActionPerformed(evt);
            }
        });

        jButton4.setText("Clear Table");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("-");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(51, 204, 255));

        table_demo.setAutoCreateRowSorter(true);
        table_demo.setBackground(new java.awt.Color(0, 204, 204));
        table_demo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255)));
        table_demo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        table_demo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "1st Class", "2nd Class", "3rd Class A", "3rd Class B", "3rd Class C"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_demo.setToolTipText("");
        table_demo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table_demo.setCellSelectionEnabled(true);
        table_demo.setEditingRow(1);
        table_demo.setGridColor(new java.awt.Color(0, 102, 102));
        table_demo.setMaximumSize(new java.awt.Dimension(2147483647, 1500));
        table_demo.setMinimumSize(new java.awt.Dimension(1000, 64));
        table_demo.setPreferredSize(new java.awt.Dimension(1400, 700));
        table_demo.setShowGrid(true);
        jScrollPane1.setViewportView(table_demo);
        table_demo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 84, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(namel_demo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(45, 45, 45)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bookedtkt_kni, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(returnedtkt_kni, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(97, 97, 97))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(yearl_demo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(58, 58, 58)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(547, 547, 547))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(monthl_demo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(376, 376, 376)
                                        .addComponent(jButton1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(437, 437, 437)
                                        .addComponent(submit_tabledemo)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(namel_demo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearl_demo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthl_demo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(returnedtkt_kni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(bookedtkt_kni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submit_tabledemo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton4))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(422, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillCombo() {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/odemetrics", "root", "");
            String sql0 = "SELECT * FROM station";
            PreparedStatement pst0 = con.prepareStatement(sql0);
            ResultSet rs = pst0.executeQuery();

            JComboBox combo = new JComboBox();
            while (rs.next()) {

                String stations = rs.getString("stname");
                combo.addItem(stations);
                table_demo.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(combo));

            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println(e);
        }
    }


    private void bookedtkt_kniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookedtkt_kniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookedtkt_kniActionPerformed

    private void submit_tabledemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_tabledemoActionPerformed
        // TODO add your handling code here:

        try {

            int rows = table_demo.getRowCount();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/odemetrics", "root", "");
            //String code = Selection.codetxt.getText();
            //ResultSet rs = pst.executeQuery(sql);
            conn.setAutoCommit(false);

            String sql = "UPDATE trinco_line SET stname = ?, bookedtkt = ?, returnedtkt = ?, firstcls_KNI = ?, secondcls_KNI = ?, thirdclsA_KNI = ?, thirdclsB_KNI = ?, thirdclsC_KNI = ?, total_KNI = ? where stcode = ?";
            
            PreparedStatement pst = conn.prepareStatement(sql);
            
                  for (int row = 0; row < rows; row++) {
                    String codee = (String) table_demo.getValueAt(row, 0);
                    String name = (String) table_demo.getValueAt(row, 1);
                    int cls_1 = Integer.parseInt(table_demo.getValueAt(row, 2).toString());
                    int cls_2 = Integer.parseInt(table_demo.getValueAt(row, 3).toString());
                    int cls_3a = Integer.parseInt(table_demo.getValueAt(row, 4).toString());
                    int cls_3b = Integer.parseInt(table_demo.getValueAt(row, 5).toString());
                    int cls_3c = Integer.parseInt(table_demo.getValueAt(row, 6).toString());
                    int ttl = cls_1 + cls_2 + cls_3a + cls_3b + cls_3c;
                    pst.setString(1, name);
                    pst.setInt(2, Integer.parseInt(bookedtkt_kni.getText()));
                    pst.setInt(3, Integer.parseInt(returnedtkt_kni.getText()));
                    pst.setInt(4, cls_1);
                    pst.setInt(5, cls_2);
                    pst.setInt(6, cls_3a);
                    pst.setInt(7, cls_3b);
                    pst.setInt(8, cls_3c);
                    pst.setInt(9, ttl);
                    pst.setString(10, codee);
                }

                
          
         
                
                pst.addBatch();

                pst.executeBatch();

                conn.commit();
                JOptionPane.showMessageDialog(null, "successfull!");
                conn.close();
                bookedtkt_kni.setText(null);
                returnedtkt_kni.setText(null);
                clearTable();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_submit_tabledemoActionPerformed

    private void addRow() {
        DefaultTableModel dtm = (DefaultTableModel) table_demo.getModel();
        dtm.setRowCount(dtm.getRowCount() + 1);
    }

    private void removeRow() {
        DefaultTableModel dtm = (DefaultTableModel) table_demo.getModel();
        dtm.removeRow(dtm.getRowCount() - 1);
    }

    private void clearTable() {
        DefaultTableModel dtm = (DefaultTableModel) table_demo.getModel();
        dtm.setRowCount(0);
    }


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearTable();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        Selection select = new Selection();
        select.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        removeRow();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        addRow();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(stationDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stationDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stationDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stationDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stationDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookedtkt_kni;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel monthl_demo;
    private javax.swing.JLabel namel_demo;
    private javax.swing.JTextField returnedtkt_kni;
    private javax.swing.JButton submit_tabledemo;
    public static javax.swing.JTable table_demo;
    private javax.swing.JLabel yearl_demo;
    // End of variables declaration//GEN-END:variables
}
