/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.globalweather.views;

import com.globalweather.models.GlobalWeatherModel;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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

        buttonGroupVisibility = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelHomePage = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jComboBoxSearch = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        btnsort = new javax.swing.JButton();
        btnDeleteHome = new javax.swing.JButton();
        jPanelModifyData = new javax.swing.JPanel();
        jTextFieldInsertCountry = new javax.swing.JTextField();
        jLabelInsertCountry = new javax.swing.JLabel();
        jLabelInsertCity = new javax.swing.JLabel();
        jTextFieldInsertCity = new javax.swing.JTextField();
        jLabelInsertTemperature = new javax.swing.JLabel();
        jTextFieldInsertTemperature = new javax.swing.JTextField();
        jLabelInsertUVIndex = new javax.swing.JLabel();
        jTextFieldInsertDewPoint = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelInsertPrecipitation = new javax.swing.JLabel();
        jLabelInsertSNo = new javax.swing.JLabel();
        jLabelInsertHumidity2 = new javax.swing.JLabel();
        jTextFieldInsertHumidity = new javax.swing.JTextField();
        jLabelInsertDewPoint1 = new javax.swing.JLabel();
        btnAddData = new javax.swing.JButton();
        btnModifyDataHome = new javax.swing.JButton();
        jLabelInsertWindSpeed = new javax.swing.JLabel();
        jTextFieldInsertWindSpeed = new javax.swing.JTextField();
        jLabelInsertVisibility1 = new javax.swing.JLabel();
        jTextFieldInsertprecipitation = new javax.swing.JTextField();
        jSpinnerSno = new javax.swing.JSpinner();
        jRadioButtonPoor = new javax.swing.JRadioButton();
        jRadioButtonExcellent = new javax.swing.JRadioButton();
        jRadioButtonModerate = new javax.swing.JRadioButton();
        jRadioButtonClear = new javax.swing.JRadioButton();
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

        jPanelHomePage.setBackground(new java.awt.Color(9, 68, 121));

        jTable.setBackground(new java.awt.Color(9, 68, 121));
        jTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable.setForeground(new java.awt.Color(255, 255, 255));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "USA", "New York",  new Float(14.0),  new Float(80.0), "Low", "16.1", "14", "12", "11"},
                { new Integer(2), "Nepal", "Kathmandu ",  new Float(12.0),  new Float(53.0), "High", "8", "10", "2", "10"},
                { new Integer(3), "Netherland", "Amsterdam",  new Float(10.0),  new Float(87.0), "Moderate", "16.1", "27.8", "18", "7"},
                { new Integer(4), "China ", "Shanghai",  new Float(14.0),  new Float(92.0), "Very High", "6.4", "18", "5", "16.1"},
                { new Integer(5), "India", "Mumbai",  new Float(29.0),  new Float(57.0), null, "1.6", "11", "1", "20"}
            },
            new String [] {
                "S.No", "Country ", "City ", "Temperature °C  ", "Humidity (%)", "UV index ", "Visibility  (km)", "Wind Speed  km/h", "Precipitation (mm)", "Dew point"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setGridColor(new java.awt.Color(0, 0, 0));
        jTable.setRowHeight(40);
        jTable.setSelectionBackground(new java.awt.Color(9, 68, 121));
        jTable.setSelectionForeground(new java.awt.Color(0, 204, 0));
        jTable.setShowGrid(true);
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(3).setResizable(false);
            jTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable.getColumnModel().getColumn(4).setResizable(false);
            jTable.getColumnModel().getColumn(4).setPreferredWidth(60);
            jTable.getColumnModel().getColumn(5).setResizable(false);
            jTable.getColumnModel().getColumn(6).setResizable(false);
            jTable.getColumnModel().getColumn(7).setResizable(false);
            jTable.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTable.getColumnModel().getColumn(8).setResizable(false);
            jTable.getColumnModel().getColumn(8).setPreferredWidth(100);
            jTable.getColumnModel().getColumn(9).setResizable(false);
            jTable.getColumnModel().getColumn(9).setPreferredWidth(50);
        }

        jTextField1.setText("Search");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jComboBoxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S.No", "Country", "City", "Temperature", "Humidity", "UV Index", "Visibility", "Wind Speed", "Precipitation", "Dew point" }));
        jComboBoxSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSearchActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(18, 43, 114));
        btnSearch.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnsort.setBackground(new java.awt.Color(18, 43, 114));
        btnsort.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        btnsort.setForeground(new java.awt.Color(255, 255, 255));
        btnsort.setText("Sort");
        btnsort.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnsort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsortActionPerformed(evt);
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

        javax.swing.GroupLayout jPanelHomePageLayout = new javax.swing.GroupLayout(jPanelHomePage);
        jPanelHomePage.setLayout(jPanelHomePageLayout);
        jPanelHomePageLayout.setHorizontalGroup(
            jPanelHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomePageLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293)
                .addComponent(jComboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsort, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelHomePageLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDeleteHome, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1389, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 151, Short.MAX_VALUE))
        );
        jPanelHomePageLayout.setVerticalGroup(
            jPanelHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomePageLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanelHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsort, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnDeleteHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(746, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", jPanelHomePage);

        jPanelModifyData.setBackground(new java.awt.Color(9, 68, 121));

        jTextFieldInsertCountry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldInsertCountryKeyPressed(evt);
            }
        });

        jLabelInsertCountry.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelInsertCountry.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInsertCountry.setText("Name of the country ");

        jLabelInsertCity.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelInsertCity.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInsertCity.setText("Name of the city ");

        jTextFieldInsertCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldInsertCityKeyPressed(evt);
            }
        });

        jLabelInsertTemperature.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelInsertTemperature.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInsertTemperature.setText("Temperature ");

        jTextFieldInsertTemperature.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldInsertTemperatureKeyPressed(evt);
            }
        });

        jLabelInsertUVIndex.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelInsertUVIndex.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInsertUVIndex.setText("UV index");

        jTextFieldInsertDewPoint.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldInsertDewPointKeyPressed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Moderate", "High", "Very High" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabelInsertPrecipitation.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelInsertPrecipitation.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInsertPrecipitation.setText("Precipitation");

        jLabelInsertSNo.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelInsertSNo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInsertSNo.setText("S.No");

        jLabelInsertHumidity2.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelInsertHumidity2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInsertHumidity2.setText("Humidity ");

        jTextFieldInsertHumidity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldInsertHumidityKeyPressed(evt);
            }
        });

        jLabelInsertDewPoint1.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelInsertDewPoint1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInsertDewPoint1.setText("Dew point ");

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
        btnModifyDataHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyDataHomeActionPerformed(evt);
            }
        });

        jLabelInsertWindSpeed.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelInsertWindSpeed.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInsertWindSpeed.setText("Wind Speed ");

        jTextFieldInsertWindSpeed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldInsertWindSpeedKeyPressed(evt);
            }
        });

        jLabelInsertVisibility1.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelInsertVisibility1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInsertVisibility1.setText("Visibility");

        jSpinnerSno.setName(""); // NOI18N

        buttonGroupVisibility.add(jRadioButtonPoor);
        jRadioButtonPoor.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jRadioButtonPoor.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonPoor.setText("Poor");

        buttonGroupVisibility.add(jRadioButtonExcellent);
        jRadioButtonExcellent.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jRadioButtonExcellent.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonExcellent.setText("Excellent");

        buttonGroupVisibility.add(jRadioButtonModerate);
        jRadioButtonModerate.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jRadioButtonModerate.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonModerate.setText("Moderate ");

        buttonGroupVisibility.add(jRadioButtonClear);
        jRadioButtonClear.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jRadioButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonClear.setText("Clear");

        javax.swing.GroupLayout jPanelModifyDataLayout = new javax.swing.GroupLayout(jPanelModifyData);
        jPanelModifyData.setLayout(jPanelModifyDataLayout);
        jPanelModifyDataLayout.setHorizontalGroup(
            jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModifyDataLayout.createSequentialGroup()
                        .addComponent(jLabelInsertWindSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldInsertWindSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModifyDataLayout.createSequentialGroup()
                        .addComponent(jLabelInsertTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldInsertTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModifyDataLayout.createSequentialGroup()
                        .addComponent(jLabelInsertCity, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldInsertCity, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModifyDataLayout.createSequentialGroup()
                        .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                                .addComponent(jLabelInsertSNo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175))
                            .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                                .addComponent(jLabelInsertCountry)
                                .addGap(48, 48, 48)))
                        .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldInsertCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerSno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(150, 150, 150)
                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                                .addComponent(jLabelInsertDewPoint1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addGap(71, 71, 71))
                            .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelInsertHumidity2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelInsertUVIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldInsertDewPoint, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addComponent(jTextFieldInsertHumidity, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                                .addComponent(jRadioButtonPoor, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonModerate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonExcellent)))
                        .addGap(320, 320, 320))
                    .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                        .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddData, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelInsertVisibility1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelInsertPrecipitation)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldInsertprecipitation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModifyDataHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(233, 233, 233))))
        );
        jPanelModifyDataLayout.setVerticalGroup(
            jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                        .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelInsertHumidity2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldInsertHumidity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldInsertCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelInsertUVIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelInsertCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelInsertSNo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinnerSno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22)
                        .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelInsertCity, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldInsertCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldInsertDewPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelInsertDewPoint1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButtonPoor)
                                    .addComponent(jRadioButtonClear)
                                    .addComponent(jRadioButtonModerate)
                                    .addComponent(jRadioButtonExcellent))
                                .addGap(36, 36, 36)
                                .addComponent(jTextFieldInsertprecipitation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabelInsertVisibility1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelInsertPrecipitation, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnModifyDataHome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddData, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelInsertTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldInsertTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanelModifyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelInsertWindSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldInsertWindSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelModifyDataLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(738, 738, 738))
        );

        jTabbedPane1.addTab("", jPanelModifyData);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInsertDataHome, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(156, 156, 156)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertDataHome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1213, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 1558, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHomeActionPerformed
       if(!isRowSelected()){
        int result = JOptionPane.showConfirmDialog(null, "Sure? You want to delete the data ?", "Swing Tester",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            int selectedRow = jTable.getSelectedRow();
            DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();

            tableModel.removeRow(selectedRow);
        } else if (result == JOptionPane.NO_OPTION) {

        }
       }
       else{
           JOptionPane.showMessageDialog(this, "Row is not selected !  ");
       }


    }//GEN-LAST:event_btnDeleteHomeActionPerformed

    private void btnInsertDataHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertDataHomeActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnInsertDataHomeActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDataActionPerformed
       
        if (isTextFieldEmpty()){
            
            JOptionPane.showMessageDialog(this, "please enter all value ");
        }
        
        jRadioButtonClear.setActionCommand("Clear");
        jRadioButtonExcellent.setActionCommand("Excellent");
        jRadioButtonModerate.setActionCommand("Moderate");
        jRadioButtonPoor.setActionCommand("Poor");
        
        int sno = Integer.parseInt(jSpinnerSno.getValue().toString());
        float temperature = Float.parseFloat(jTextFieldInsertTemperature.getText());
        float windspeed = Float.parseFloat(jTextFieldInsertWindSpeed.getText());
        float humidity = Float.parseFloat(jTextFieldInsertHumidity.getText());
        float dewpoint = Float.parseFloat(jTextFieldInsertDewPoint.getText());
        float precipitation = Float.parseFloat(jTextFieldInsertprecipitation.getText());
        
        String visibility = (buttonGroupVisibility.getSelection().getActionCommand());
        String country = jTextFieldInsertCountry.getText();
        String city = jTextFieldInsertCity.getText();
        String uvindex = jComboBox1.getSelectedItem().toString();
        
        if(!isDuplicateSno(sno)){
        GlobalWeatherModel weatherModel = new GlobalWeatherModel(sno, country, city, uvindex,temperature, humidity, visibility, windspeed, dewpoint, precipitation);
        DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
        Object[] rowData = {weatherModel.getSno(), weatherModel.getCountryName(), weatherModel.getCityName(),
                        weatherModel.getTemperature(), weatherModel.getHumidity(), weatherModel.getUvIndex(),
                        weatherModel.getVisibility(), weatherModel.getWindSpeed(), weatherModel.getPrecipitation(),
                        weatherModel.getDewPoint()};
        tableModel.addRow(rowData);
        JOptionPane.showMessageDialog(this, "data added sucessfully ");
        }
        
        else{
            JOptionPane.showMessageDialog(this, "Sno already existed, please enter unique number ");
        }
        
        // Add data to the table
        

//        table
        
    }//GEN-LAST:event_btnAddDataActionPerformed
    
    private boolean isRowSelected(){
        if(jTable.getSelectionModel().isSelectionEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    private boolean isTextFieldEmpty(){
    return jTextFieldInsertCountry.getText().isEmpty() || jTextFieldInsertCity.getText().isEmpty() || jTextFieldInsertTemperature.getText().isEmpty() || jTextFieldInsertWindSpeed.getText().isEmpty()
                || jTextFieldInsertHumidity.getText().isEmpty() || buttonGroupVisibility.getSelection() ==null || jTextFieldInsertprecipitation.getText().isEmpty() || jTextFieldInsertDewPoint.getText().isEmpty(); 

    }
     private boolean isDuplicateSno(int key){
        int rowCount = jTable.getRowCount();
        
        for(int i = 0; i<rowCount; i++){
            int tableId = Integer.parseInt(jTable.getValueAt(i, 0).toString());
            if(key == tableId){
                return true;
            }
        }
        return false;
    }
    
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsortActionPerformed

    private void jComboBoxSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSearchActionPerformed

    private void btnModifyDataHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyDataHomeActionPerformed
       if(!isRowSelected()){}
       else {  JOptionPane.showMessageDialog(this, "please Selected row from the table ");}
    }//GEN-LAST:event_btnModifyDataHomeActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextFieldInsertTemperatureKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldInsertTemperatureKeyPressed
        char c = evt.getKeyChar();
        if(Character.isDigit(c) ||c == KeyEvent.VK_BACK_SPACE || c == '.'){
            jTextFieldInsertTemperature.setEditable(true);
           
        }
        else{
            JOptionPane.showMessageDialog(this, "please enter numbers only");
            jTextFieldInsertTemperature.setText(""  );
            jTextFieldInsertTemperature.setEditable(false);
        }    
    }//GEN-LAST:event_jTextFieldInsertTemperatureKeyPressed

    private void jTextFieldInsertWindSpeedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldInsertWindSpeedKeyPressed
        char c = evt.getKeyChar();
        if(Character.isDigit(c) ||c == KeyEvent.VK_BACK_SPACE || c == '.'){
            jTextFieldInsertWindSpeed.setEditable(true);
           
        }
        else{
            JOptionPane.showMessageDialog(this, "please enter numbers only");
            jTextFieldInsertWindSpeed.setText(""  );
            jTextFieldInsertWindSpeed.setEditable(false);
        }    
    }//GEN-LAST:event_jTextFieldInsertWindSpeedKeyPressed

    private void jTextFieldInsertHumidityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldInsertHumidityKeyPressed
         char c = evt.getKeyChar();
        if(Character.isDigit(c) ||c == KeyEvent.VK_BACK_SPACE || c == '.'){
            jTextFieldInsertHumidity.setEditable(true);
           
        }
        else{
            JOptionPane.showMessageDialog(this, "please enter numbers only");
            jTextFieldInsertHumidity.setText(" "  );
            jTextFieldInsertHumidity.setEditable(false);
        } 
    }//GEN-LAST:event_jTextFieldInsertHumidityKeyPressed

    private void jTextFieldInsertDewPointKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldInsertDewPointKeyPressed
         char c = evt.getKeyChar();
        if(Character.isDigit(c) ||c == KeyEvent.VK_BACK_SPACE || c == '.'){
            jTextFieldInsertDewPoint.setEditable(true);
           
        }
        else{
            JOptionPane.showMessageDialog(this, "please enter numbers only");
            jTextFieldInsertDewPoint.setText(""  );
            jTextFieldInsertDewPoint.setEditable(false);
        } 
    }//GEN-LAST:event_jTextFieldInsertDewPointKeyPressed

    private void jTextFieldInsertCountryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldInsertCountryKeyPressed
        char c = (char) evt.getKeyCode();
        if(Character.isAlphabetic(c) ||c == KeyEvent.VK_BACK_SPACE || c == '.'||c == KeyEvent.VK_SHIFT || c == KeyEvent.VK_SPACE ){
            jTextFieldInsertCountry.setEditable(true);
           
        }
        else{
            JOptionPane.showMessageDialog(this, "please character  only");
            jTextFieldInsertCountry.setText(""  );
            jTextFieldInsertCountry.setEditable(false);
        } 
    }//GEN-LAST:event_jTextFieldInsertCountryKeyPressed

    private void jTextFieldInsertCityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldInsertCityKeyPressed
        char c = (char) evt.getKeyCode();
        if(Character.isAlphabetic(c) ||c == KeyEvent.VK_BACK_SPACE || c == '.'||c == KeyEvent.VK_SHIFT || c == KeyEvent.VK_SPACE ){
            jTextFieldInsertCity.setEditable(true);
           
        }
        else{
            JOptionPane.showMessageDialog(this, "please character only");
            jTextFieldInsertCity.setText(""  );
            jTextFieldInsertCity.setEditable(false);
        } 
    }//GEN-LAST:event_jTextFieldInsertCityKeyPressed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
       int currentRow = jTable.getSelectedRow();
     
        
        jSpinnerSno.setValue(Integer.parseInt(jTable.getValueAt(currentRow, 0).toString()));
        jTextFieldInsertCountry.setText(jTable.getValueAt(currentRow, 1).toString());
        jTextFieldInsertCity.setText(jTable.getValueAt(currentRow, 2).toString());
        jTextFieldInsertTemperature.setText(jTable.getValueAt(currentRow, 3).toString());
        jTextFieldInsertHumidity.setText(jTable.getValueAt(currentRow, 4).toString());
        jTextFieldInsertWindSpeed.setText(jTable.getValueAt(currentRow, 7).toString());
        jTextFieldInsertprecipitation.setText(jTable.getValueAt(currentRow, 8).toString());
        jTextFieldInsertDewPoint.setText(jTable.getValueAt(currentRow, 9).toString());
        jComboBox1.setSelectedItem(jTable.getValueAt(currentRow, 5));
    }//GEN-LAST:event_jTableMouseClicked
   
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
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnsort;
    private javax.swing.ButtonGroup buttonGroupVisibility;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelInsertCity;
    private javax.swing.JLabel jLabelInsertCountry;
    private javax.swing.JLabel jLabelInsertDewPoint1;
    private javax.swing.JLabel jLabelInsertHumidity2;
    private javax.swing.JLabel jLabelInsertPrecipitation;
    private javax.swing.JLabel jLabelInsertSNo;
    private javax.swing.JLabel jLabelInsertTemperature;
    private javax.swing.JLabel jLabelInsertUVIndex;
    private javax.swing.JLabel jLabelInsertVisibility1;
    private javax.swing.JLabel jLabelInsertWindSpeed;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelHomePage;
    private javax.swing.JPanel jPanelModifyData;
    private javax.swing.JRadioButton jRadioButtonClear;
    private javax.swing.JRadioButton jRadioButtonExcellent;
    private javax.swing.JRadioButton jRadioButtonModerate;
    private javax.swing.JRadioButton jRadioButtonPoor;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerSno;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldInsertCity;
    private javax.swing.JTextField jTextFieldInsertCountry;
    private javax.swing.JTextField jTextFieldInsertDewPoint;
    private javax.swing.JTextField jTextFieldInsertHumidity;
    private javax.swing.JTextField jTextFieldInsertTemperature;
    private javax.swing.JTextField jTextFieldInsertWindSpeed;
    private javax.swing.JTextField jTextFieldInsertprecipitation;
    // End of variables declaration//GEN-END:variables

   
}
