package bloodbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raj
 */
public class ViewProgress extends javax.swing.JFrame {

    /**
     * Creates new form ViewProgress
     */
    public ViewProgress() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        bGroupComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailsTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Your Progress");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter name :");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Enter requested blood group:");

        nameTextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        nameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameTextField.setToolTipText("You can also enter some initial characters");
        nameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        nameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTextFieldKeyPressed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(0, 153, 153));
        searchButton.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.setBorder(null);
        searchButton.setEnabled(false);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        bGroupComboBox.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bGroupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        bGroupComboBox.setBorder(null);
        bGroupComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGroupComboBoxActionPerformed(evt);
            }
        });
        bGroupComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bGroupComboBoxKeyReleased(evt);
            }
        });

        detailsTextArea.setEditable(false);
        detailsTextArea.setBackground(new java.awt.Color(255, 255, 153));
        detailsTextArea.setColumns(20);
        detailsTextArea.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        detailsTextArea.setRows(5);
        detailsTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        detailsTextArea.setFocusable(false);
        detailsTextArea.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(detailsTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bGroupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(nameTextField)
                    .addComponent(bGroupComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextFieldKeyPressed
        searchButton.setEnabled(!(nameTextField.getText().equals("") || bGroupComboBox.getSelectedItem().toString().equals("-- Select --")));
        if (evt.getKeyCode() == 10)
            bGroupComboBox.requestFocus();
    }//GEN-LAST:event_nameTextFieldKeyPressed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver()); // Used only to load the class and not create an instance
            try (Connection dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lsapp?zeroDateTimeBehavior=convertToNull", "root", "")) {
                String query = "SELECT request_master.Request_ID, "
                        + "patient_master.Name `Patient Name`, "
                        + "patient_master.BloodGroup `Blood Group`, "
                        + "request_master.Quantity, "
                        + "request_master.Location, "
                        + "request_master.DateOfRequirement `Date of Requirement`, "
                        + "request_master.Status "
                        + "FROM request_master "
                        + "INNER JOIN patient_master "
                        + "ON patient_master.Patient_ID = request_master.Patient_ID "
                        + "WHERE patient_master.Name LIKE '" + nameTextField.getText() + "%' AND "
                        + "patient_master.BloodGroup = '" + bGroupComboBox.getSelectedItem().toString() + "'";
                try (PreparedStatement statement = dbConnection.prepareStatement(query)) {
                    ResultSet resultSet = statement.executeQuery();
                    detailsTextArea.setText("");
                    boolean flag = false;
                    while (resultSet.next()) {
                        flag = true;
                        detailsTextArea.append("Request ID: " + resultSet.getInt(1) + "\n");
                        detailsTextArea.append("Patient Name: " + resultSet.getString(2) + "\n");
                        detailsTextArea.append("Blood Group: " + resultSet.getString(3) + "\n");
                        detailsTextArea.append("Quantity: " + resultSet.getInt(4) + "\n");
                        detailsTextArea.append("Location: " + resultSet.getString(5) + "\n");
                        detailsTextArea.append("Date of requirement: " + resultSet.getString(6) + "\n");
                        detailsTextArea.append("Status: " + resultSet.getString(7).toUpperCase() + "\n\n");
                    }
                    if (!flag)
                        detailsTextArea.append("NOT FOUND!");
                }
            }
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void bGroupComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGroupComboBoxActionPerformed
        searchButton.setEnabled(!(nameTextField.getText().equals("") || bGroupComboBox.getSelectedItem().toString().equals("-- Select --")));
    }//GEN-LAST:event_bGroupComboBoxActionPerformed

    private void bGroupComboBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bGroupComboBoxKeyReleased
        if (evt.getKeyCode() == 10)
            searchButton.doClick();
    }//GEN-LAST:event_bGroupComboBoxKeyReleased

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
            java.util.logging.Logger.getLogger(ViewProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewProgress().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bGroupComboBox;
    private javax.swing.JTextArea detailsTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
