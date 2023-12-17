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
        btnHome = new javax.swing.JButton();
        btnDeleteHome = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelHomePage = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanelModifyData = new javax.swing.JPanel();
        jTextFieldInsertCountry = new javax.swing.JTextField();
        jLabelInsertCountry = new javax.swing.JLabel();
        jLabelInsertCity = new javax.swing.JLabel();
        jTextFieldInsertCity = new javax.swing.JTextField();
        jLabelInsertTemperature = new javax.swing.JLabel();
        jTextFieldInsertDataTemperature = new javax.swing.JTextField();
        jLabelInsertUVIndex = new javax.swing.JLabel();
        jTextFieldInsertDewPoint = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelInsertVisibility = new javax.swing.JLabel();
        jLabelInsertSNo = new javax.swing.JLabel();
        jTextFieldInsertSNo = new javax.swing.JTextField();
        jLabelInsertHumidity2 = new javax.swing.JLabel();
        jTextFieldInsertHumidity1 = new javax.swing.JTextField();
        jLabelInsertDewPoint1 = new javax.swing.JLabel();
        jTextFieldInsertVisibility = new javax.swing.JTextField();
        btnAddData = new javax.swing.JButton();
        btnModifyDataHome = new javax.swing.JButton();
        btnInsertDataHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(9, 68, 121));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(9, 68, 121));

        jLabel1.setFont(new java.awt.Font("MS Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Country wise weather details   ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/globalweather/views/logojava.png"))); // NOI18N

        btnHome.setBackground(new java.awt.Color(18, 43, 114));
        btnHome.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnDeleteHome.setBackground(new java.awt.Color(255, 51, 51));
        btnDeleteHome.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        btnDeleteHome.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteHome.setText("Delete");
        btnDeleteHome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnDeleteHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHomeActionPerformed(evt);
            }
        });

        jPanelHomePage.setBackground(new java.awt.Color(9, 68, 121));

        jTable.setBackground(new java.awt.Color(9, 68, 121));
        jTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable.setForeground(new java.awt.Color(255, 255, 255));
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
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanelHomePageLayout.setVerticalGroup(
            jPanelHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomePageLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(781, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanelHomePage);

        jPanelModifyData.setBackground(new java.awt.Color(9, 68, 121));

        jTextFieldInsertCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInsertCountryActionPerformed(evt);
            }
        });

        jLabelInsertCountry.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelInsertCountry.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInsertCountry.setText("Name of the country ");

        jLabelInsertCity.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelInsertCity.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInsertCity.setText("Name of the city ");

        jTextFieldInsertCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInsertCityActionPerformed(evt);
            }
        });

        jLabelInsertTemperature.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelInsertTemperature.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInsertTemperature.setText("Temperature ");

        jTextFieldInsertDataTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInsertDataTemperatureActionPerformed(evt);
            }
        });

        jLabelInsertUVIndex.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelInsertUVIndex.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInsertUVIndex.setText("UV index");

        jTextFieldInsertDewPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInsertDewPointActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "low", "Moderate", "High", "Very High" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabelInsertVisibility.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelInsertVisibility.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInsertVisibility.setText("Visibility");

        jLabelInsertSNo.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelInsertSNo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInsertSNo.setText("S.No");

        jTextFieldInsertSNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInsertSNoActionPerformed(evt);
            }
        });

        jLabelInsertHumidity2.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelInsertHumidity2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInsertHumidity2.setText("Humidity ");

        jTextFieldInsertHumidity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInsertHumidity1ActionPerformed(evt);
            }
        });

        jLabelInsertDewPoint1.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelInsertDewPoint1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInsertDewPoint1.setText("Dew point ");

        jTextFieldInsertVisibility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInsertVisibilityActionPerformed(evt);
            }
        });

        btnAddData.setBackground(new java.awt.Color(18, 43, 114));
        btnAddData.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        btnAddData.setForeground(new java.awt.Color(255, 255, 255));
        btnAddData.setText("ADD");
        btnAddData.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnAddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDataActionPerformed(evt);
            }
        });

        btnModifyDataHome.setBackground(new java.awt.Color(18, 43, 114));
        btnModifyDataHome.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        btnModifyDataHome.setForeground(new java.awt.Color(255, 255, 255));
        btnModifyDataHome.setText("Modify Data");
        btnModifyDataHome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanelModifyDataLayout = new javax.swing.GroupLayout(jPanelModifyData);
        jPanelModifyData.setLayout(jPanelModifyDataLayout);
        jPanelModifyDataLayout.setHorizontalGroup(
            jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldInsertSNo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                                .addComponent(jLabelInsertCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldInsertCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelModifyDataLayout.createSequentialGroup()
                                .addComponent(jLabelInsertCity, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldInsertCity, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                            .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnModifyDataHome, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelInsertTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(80, 80, 80)
                            .addComponent(jTextFieldInsertDataTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelInsertSNo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 169, Short.MAX_VALUE)
                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModifyDataLayout.createSequentialGroup()
                        .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInsertUVIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelInsertHumidity2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldInsertHumidity1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModifyDataLayout.createSequentialGroup()
                        .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAddData, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelInsertVisibility, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelInsertDewPoint1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldInsertVisibility, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldInsertDewPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)))
                .addGap(516, 516, 516))
        );
        jPanelModifyDataLayout.setVerticalGroup(
            jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelInsertSNo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldInsertSNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModifyDataLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jTextFieldInsertHumidity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelInsertHumidity2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelInsertCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldInsertCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabelInsertUVIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInsertCity, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInsertCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInsertDewPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInsertDewPoint1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInsertTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInsertDataTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInsertVisibility, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInsertVisibility, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddData, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyDataHome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(661, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", jPanelModifyData);

        btnInsertDataHome.setBackground(new java.awt.Color(18, 43, 114));
        btnInsertDataHome.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        btnInsertDataHome.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertDataHome.setText("Insert Data");
        btnInsertDataHome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnInsertDataHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertDataHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnInsertDataHome, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnDeleteHome, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(271, 271, 271))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteHome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertDataHome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1558, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHomeActionPerformed
       
    }//GEN-LAST:event_btnDeleteHomeActionPerformed

    private void btnInsertDataHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertDataHomeActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnInsertDataHomeActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void jTextFieldInsertCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInsertCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInsertCityActionPerformed

    private void jTextFieldInsertCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInsertCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInsertCountryActionPerformed

    private void jTextFieldInsertDataTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInsertDataTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInsertDataTemperatureActionPerformed

    private void jTextFieldInsertDewPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInsertDewPointActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInsertDewPointActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextFieldInsertSNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInsertSNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInsertSNoActionPerformed

    private void jTextFieldInsertHumidity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInsertHumidity1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInsertHumidity1ActionPerformed

    private void jTextFieldInsertVisibilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInsertVisibilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInsertVisibilityActionPerformed

    private void btnAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddDataActionPerformed

 
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
    private javax.swing.JButton btnAddData;
    private javax.swing.JButton btnDeleteHome;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnInsertDataHome;
    private javax.swing.JButton btnModifyDataHome;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelInsertCity;
    private javax.swing.JLabel jLabelInsertCountry;
    private javax.swing.JLabel jLabelInsertDewPoint1;
    private javax.swing.JLabel jLabelInsertHumidity2;
    private javax.swing.JLabel jLabelInsertSNo;
    private javax.swing.JLabel jLabelInsertTemperature;
    private javax.swing.JLabel jLabelInsertUVIndex;
    private javax.swing.JLabel jLabelInsertVisibility;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelHomePage;
    private javax.swing.JPanel jPanelModifyData;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldInsertCity;
    private javax.swing.JTextField jTextFieldInsertCountry;
    private javax.swing.JTextField jTextFieldInsertDataTemperature;
    private javax.swing.JTextField jTextFieldInsertDewPoint;
    private javax.swing.JTextField jTextFieldInsertHumidity1;
    private javax.swing.JTextField jTextFieldInsertSNo;
    private javax.swing.JTextField jTextFieldInsertVisibility;
    // End of variables declaration//GEN-END:variables
}
