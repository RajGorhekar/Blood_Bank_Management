package bloodbank;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raj
 */
public class ViewRequests extends javax.swing.JFrame {
    private final String mainQuery = "SELECT request_master.Request_ID, "
                        + "patient_master.Name `Patient Name`, "
                        + "patient_master.BloodGroup `Blood Group`, "
                        + "request_master.Quantity, "
                        + "request_master.Location, "
                        + "request_master.DateOfRequirement `Date of Requirement`, "
                        + "request_master.Status "
                        + "FROM request_master "
                        + "INNER JOIN patient_master "
                        + "ON patient_master.Patient_ID = request_master.Patient_ID";
    /**
     * Creates new form ViewRequests
     */
    public ViewRequests() {
        initComponents();
        performDbInit(mainQuery);
    }
    
    private void performDbInit(String query) {
        answerButton.setEnabled(false);
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver()); // Used only to load the class and not create an instance
            try (Connection dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lsapp?zeroDateTimeBehavior=convertToNull", "root", "")) {
                try (PreparedStatement statement = dbConnection.prepareStatement(query)) {
                    requests.setModel(DbUtils.resultSetToTableModel(statement.executeQuery()));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requests = new javax.swing.JTable();
        answerButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        remainingCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Requests Page");
        setSize(new java.awt.Dimension(0, 0));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension((int) (0.92 * java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth()), (int)(0.92 * java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight())));
        jPanel1.setMinimumSize(new java.awt.Dimension((int) (0.92 * java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth()), (int)(0.92 * java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight())));
        jPanel1.setPreferredSize(new java.awt.Dimension((int) (0.92 * java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth()), (int)(0.92 * java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight())));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("Requests");

        jScrollPane1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jScrollPane1.setMaximumSize(new java.awt.Dimension(super.getWidth() - 40, super.getHeight() - 80));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(super.getWidth() - 40, super.getHeight() - 80));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(super.getWidth() - 40, super.getHeight() - 80));

        requests.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        requests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request_ID", "Patient Name", "Blood Group", "Quantity", "Location", "Date of Requirement", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requests.setIntercellSpacing(new java.awt.Dimension(0, 0));
        requests.setRowHeight(30);
        requests.setSelectionBackground(new java.awt.Color(232, 57, 95));
        requests.getTableHeader().setReorderingAllowed(false);
        requests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                requestsMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(requests);

        answerButton.setBackground(new java.awt.Color(0, 153, 153));
        answerButton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        answerButton.setForeground(new java.awt.Color(255, 255, 255));
        answerButton.setText("Answer Request");
        answerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        answerButton.setEnabled(false);
        answerButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        answerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sort By:");
        jLabel2.setFocusable(false);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setRequestFocusEnabled(false);

        jComboBox1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Patient Name", "Blood Group", "Quantity", "Date of Requirement" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Search By:");
        jLabel3.setFocusable(false);
        jLabel3.setRequestFocusEnabled(false);

        jComboBox2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Patient Name", "Blood Group", "Quantity", "Location", "Date of Requirement" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(0, 153, 153));
        searchButton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.setEnabled(false);
        searchButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        //searchButton.setVisible(false);

        searchTextField.setEditable(false);
        searchTextField.setBackground(new java.awt.Color(255, 255, 153));
        searchTextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        searchTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyPressed(evt);
            }
        });
        //searchTextField.setVisible(false);

        remainingCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        remainingCheckBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        remainingCheckBox.setText("Show Remaining only");
        remainingCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        remainingCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(remainingCheckBox))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(answerButton)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(remainingCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(answerButton)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1107, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String text = searchTextField.getText();
        String query = mainQuery + " WHERE ";
        if (remainingCheckBox.isSelected())
            query += "request_master.Status = 'Remaining' AND ";
        if (jComboBox2.getSelectedItem().toString().equals("Quantity"))
            query += "request_master.Quantity = " + Integer.parseInt(text);
        else {
            switch(jComboBox2.getSelectedItem().toString()) {
                case "Patient Name":
                    query += "patient_master.Name ";
                    break;
                case "Blood Group":
                    query += "patient_master.BloodGroup ";
                    break;
                case "Location":
                    query += "request_master.Location ";
                    break;
                case "Date of Requirement":
                    query += "request_master.DateOfRequirement ";
            }
            query += "LIKE '" + text + "%'";
        }
        if (!jComboBox1.getSelectedItem().toString().equals("-- Select --")) {
            query += " ORDER BY ";
            switch(jComboBox1.getSelectedItem().toString()) {
                case "Patient Name":
                    query += "patient_master.Name";
                    break;
                case "Blood Group":
                    query += "patient_master.BloodGroup";
                    break;
                case "Quantity":
                    query += "request_master.Quantity";
                    break;
                case "Date of Requirement":
                    query += "request_master.DateOfRequirement";
            }
        }
        performDbInit(query);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        searchTextField.setText("");
        if (!jComboBox2.getSelectedItem().toString().equals("-- Select --")) {
            searchTextField.setEditable(true);
            searchTextField.setBackground(Color.WHITE);
            searchTextField.requestFocus();
            searchButton.setEnabled(true);
            searchTextField.setToolTipText("Enter " + jComboBox2.getSelectedItem().toString() + " or some initial characters");
        } else {
            searchTextField.setEditable(false);
            searchTextField.setBackground(new Color(255, 255, 153));
            searchTextField.setToolTipText(null);
            searchButton.setEnabled(false);
            jComboBox1ActionPerformed(evt);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (!jComboBox2.getSelectedItem().toString().equals("-- Select --")) {
            jComboBox2.setSelectedIndex(0);
            jComboBox2ActionPerformed(evt);
        }
        if (!jComboBox1.getSelectedItem().toString().equals("-- Select --")) {
            String query = mainQuery;
            if (remainingCheckBox.isSelected())
                query += " WHERE request_master.Status = 'Remaining'";
            query += " ORDER BY ";
            switch(jComboBox1.getSelectedItem().toString()) {
                case "Patient Name":
                    query += "patient_master.Name";
                    break;
                case "Blood Group":
                    query += "patient_master.BloodGroup";
                    break;
                case "Quantity":
                    query += "request_master.Quantity";
                    break;
                case "Date of Requirement":
                    query += "request_master.DateOfRequirement";
            }
            performDbInit(query);
        } else
            performDbInit(remainingCheckBox.isSelected() ? mainQuery + " WHERE request_master.Status = 'Remaining'" : mainQuery);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void answerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButtonActionPerformed
        if (requests.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Select a single row at a time.");
            return;
        }
        Object[] array = new Object[7];
        for (int i = 0; i < 7; i++)
            array[i] = requests.getValueAt(requests.getSelectedRow(), i);
        dispose();
        new UpdateDelete(array).setVisible(true);
    }//GEN-LAST:event_answerButtonActionPerformed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        if (requests.getSelectedRow() != -1)
            requests.clearSelection();
        answerButton.setEnabled(false);
    }//GEN-LAST:event_formMouseReleased

    private void requestsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestsMouseReleased
        if (requests.getSelectedRow() != -1 && requests.getValueAt(requests.getSelectedRow(), 6).toString().equals("Remaining")) {
            requests.setSelectionBackground(new Color(232, 57, 95));
            answerButton.setEnabled(true);
        }
        else {
            requests.setSelectionBackground(Color.green);
            answerButton.setEnabled(false);
        }
    }//GEN-LAST:event_requestsMouseReleased

    private void searchTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyPressed
        if (evt.getKeyCode() == 10)
            searchButton.doClick();
    }//GEN-LAST:event_searchTextFieldKeyPressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewRequests().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton answerButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox remainingCheckBox;
    private javax.swing.JTable requests;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables
}