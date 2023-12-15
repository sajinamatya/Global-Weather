/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.globalweather.views;

import java.awt.Color;






/**
 *
 * @author LENOVO
 */
public class GlobalWeather extends javax.swing.JFrame {

    /**
     * Creates new form GlobalWeather
     */
    public GlobalWeather() {
        initComponents();
       jTable.getTableHeader().setBackground(Color.red);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnInsertDataHome = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnDeleteHome = new javax.swing.JButton();
        btnModifyDataHome = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelHomePage = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanelInsertData = new javax.swing.JPanel();
        jPanelModifyData = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(9, 68, 121));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(9, 68, 121));

        jLabel1.setFont(new java.awt.Font("MS Gothic", 1, 48)); // NOI18N
        jLabel1.setText("Country wise weather details   ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/globalweather/views/logojava.png"))); // NOI18N

        btnInsertDataHome.setBackground(new java.awt.Color(18, 43, 114));
        btnInsertDataHome.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        btnInsertDataHome.setText("Insert Data");
        btnInsertDataHome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnInsertDataHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertDataHomeActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(18, 43, 114));
        btnHome.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        btnHome.setText("Home");
        btnHome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnDeleteHome.setBackground(new java.awt.Color(255, 51, 51));
        btnDeleteHome.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        btnDeleteHome.setText("Delete");
        btnDeleteHome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnDeleteHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHomeActionPerformed(evt);
            }
        });

        btnModifyDataHome.setBackground(new java.awt.Color(18, 43, 114));
        btnModifyDataHome.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        btnModifyDataHome.setText("Modify Data");
        btnModifyDataHome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnModifyDataHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyDataHomeActionPerformed(evt);
            }
        });

        jPanelHomePage.setBackground(new java.awt.Color(9, 68, 121));

        jTable.setBackground(new java.awt.Color(104, 150, 134));
        jTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable.setForeground(new java.awt.Color(9, 68, 121));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "USA", "New York",  new Float(14.0),  new Float(80.0), "Low", "16.1", "14", "12", "11"},
                { new Integer(2), "Nepal", "Kathmandu ",  new Float(12.0),  new Float(53.0), "Moderate", "8", "10", "2", "10"},
                { new Integer(3), "Netherland", "Amsterdam",  new Float(10.0),  new Float(87.0), "Low", "16.1", "27.8", "18", "7"},
                { new Integer(4), "China ", "Shanghai",  new Float(14.0),  new Float(92.0), "Moderate", "6.4", "18", "5", "16.1"},
                { new Integer(5), "India", "Mumbai",  new Float(29.0),  new Float(57.0), "High", "1.6", "11", "1", "20"}
            },
            new String [] {
                "S.No", "Country ", "City ", "Temperature °C  ", "Humidity (%)", "UV index ", "Visibility ", "Wind Speed  km/h", "Precipitation", "Dew point"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable.setGridColor(new java.awt.Color(0, 0, 0));
        jTable.setRowHeight(40);
        jTable.setSelectionBackground(new java.awt.Color(9, 68, 121));
        jTable.setSelectionForeground(new java.awt.Color(0, 204, 0));
        jTable.setShowGrid(true);
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable.getColumnModel().getColumn(4).setPreferredWidth(90);
            jTable.getColumnModel().getColumn(7).setPreferredWidth(150);
            jTable.getColumnModel().getColumn(8).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanelHomePageLayout = new javax.swing.GroupLayout(jPanelHomePage);
        jPanelHomePage.setLayout(jPanelHomePageLayout);
        jPanelHomePageLayout.setHorizontalGroup(
            jPanelHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomePageLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanelHomePageLayout.setVerticalGroup(
            jPanelHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomePageLayout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        jTabbedPane1.addTab("tab1", jPanelHomePage);

        jPanelInsertData.setBackground(new java.awt.Color(9, 68, 121));

        javax.swing.GroupLayout jPanelInsertDataLayout = new javax.swing.GroupLayout(jPanelInsertData);
        jPanelInsertData.setLayout(jPanelInsertDataLayout);
        jPanelInsertDataLayout.setHorizontalGroup(
            jPanelInsertDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1558, Short.MAX_VALUE)
        );
        jPanelInsertDataLayout.setVerticalGroup(
            jPanelInsertDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanelInsertData);

        jPanelModifyData.setBackground(new java.awt.Color(9, 68, 121));

        javax.swing.GroupLayout jPanelModifyDataLayout = new javax.swing.GroupLayout(jPanelModifyData);
        jPanelModifyData.setLayout(jPanelModifyDataLayout);
        jPanelModifyDataLayout.setHorizontalGroup(
            jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1558, Short.MAX_VALUE)
        );
        jPanelModifyDataLayout.setVerticalGroup(
            jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanelModifyData);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInsertDataHome, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnModifyDataHome, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteHome, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertDataHome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyDataHome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteHome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1558, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHomeActionPerformed
       
    }//GEN-LAST:event_btnDeleteHomeActionPerformed

    private void btnModifyDataHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyDataHomeActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btnModifyDataHomeActionPerformed

    private void btnInsertDataHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertDataHomeActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnInsertDataHomeActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnHomeActionPerformed

 
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
            java.util.logging.Logger.getLogger(GlobalWeather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlobalWeather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlobalWeather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlobalWeather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlobalWeather().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteHome;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnInsertDataHome;
    private javax.swing.JButton btnModifyDataHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelHomePage;
    private javax.swing.JPanel jPanelInsertData;
    private javax.swing.JPanel jPanelModifyData;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
