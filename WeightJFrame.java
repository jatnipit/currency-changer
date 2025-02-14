package project66;

import javax.swing.JOptionPane;

public class WeightJFrame extends javax.swing.JFrame {

    public WeightJFrame() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        backButton1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weight");
        setPreferredSize(new java.awt.Dimension(500, 400));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilograms (kg)", "Grams (g)", "Pounds (lb)", "Ounces (oz)", "Tons" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilograms (kg)", "Grams (g)", "Pounds (lb)", "Ounces (oz)", "Tons" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTextField1.setText("0.00");

        jTextField2.setText("0.00");

        backButton1.setText("BMI");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Weight Converter");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        backButton.setText("Menu");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Select input weight unit : ");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Converted value :");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Select output weight unit : ");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Enter amount : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(30, 30, 30))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1)
                                .addComponent(jTextField2))
                            .addGap(5, 5, 5)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(backButton1))
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        BmiJFrame bmiJFrame = new BmiJFrame();
        bmiJFrame.show();
        dispose();
    }//GEN-LAST:event_backButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            double value = Double.parseDouble(jTextField1.getText());
            switch (jComboBox1.getSelectedIndex()) {
                case 0 -> {
                    switch (jComboBox2.getSelectedIndex()) {
                        case 0 -> jTextField2.setText(String.valueOf(value));
                        case 1 -> jTextField2.setText(String.valueOf(String.format("%.2f", kgToG(value))));
                        case 2 -> jTextField2.setText(String.valueOf(String.format("%.2f", kgToLbs(value))));
                        case 3 -> jTextField2.setText(String.valueOf(String.format("%.2f", kgToOz(value))));
                        default -> jTextField2.setText(String.valueOf(String.format("%.2f", kgToTons(value))));
                    }
                }
                case 1 -> {
                    switch (jComboBox2.getSelectedIndex()) {
                        case 0 -> jTextField2.setText(String.valueOf(String.format("%.2f", gToKg(value))));
                        case 1 -> jTextField2.setText(String.valueOf(value));
                        case 2 -> jTextField2.setText(String.valueOf(String.format("%.2f", gToLbs(value))));
                        case 3 -> jTextField2.setText(String.valueOf(String.format("%.2f", gToOz(value))));
                        default -> jTextField2.setText(String.valueOf(String.format("%.2f", gToTons(value))));
                    }
                }
                case 2 -> {
                    switch (jComboBox2.getSelectedIndex()) {
                        case 0 -> jTextField2.setText(String.valueOf(String.format("%.2f", lbsToKg(value))));
                        case 1 -> jTextField2.setText(String.valueOf(String.format("%.2f", lbsToG(value))));
                        case 2 -> jTextField2.setText(String.valueOf(value));
                        case 3 -> jTextField2.setText(String.valueOf(String.format("%.2f", lbsToOz(value))));
                        default -> jTextField2.setText(String.valueOf(String.format("%.2f", lbsToTons(value))));
                    }
                }
                case 3 -> {
                    switch (jComboBox2.getSelectedIndex()) {
                        case 0 -> jTextField2.setText(String.valueOf(String.format("%.2f", ozToKg(value))));
                        case 1 -> jTextField2.setText(String.valueOf(String.format("%.2f", ozToG(value))));
                        case 2 -> jTextField2.setText(String.valueOf(String.format("%.2f", ozToLbs(value))));
                        case 3 -> jTextField2.setText(String.valueOf(value));
                        default -> jTextField2.setText(String.valueOf(String.format("%.2f", ozToTons(value))));
                    }
                }
                default -> {
                    switch (jComboBox2.getSelectedIndex()) {
                        case 0 -> jTextField2.setText(String.valueOf(String.format("%.2f", tonsToKg(value))));
                        case 1 -> jTextField2.setText(String.valueOf(String.format("%.2f", tonsToG(value))));
                        case 2 -> jTextField2.setText(String.valueOf(String.format("%.2f", tonsToLbs(value))));
                        case 3 -> jTextField2.setText(String.valueOf(String.format("%.2f", tonsToOz(value))));
                        default -> jTextField2.setText(String.valueOf(value));
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid value!!!");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("0.00");
        jTextField2.setText("0.00");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainMenuJFrame menuJFrame = new MainMenuJFrame();
        menuJFrame.show();
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    public double kgToG(double value){
        return value*1000;
    }
    public double kgToLbs(double value){
        return value*2.20462262;
    }
    public double kgToOz(double value){
        return value*35.2739619;
    }
    public double kgToTons(double value){
        return value*0.00110231131;
    }
    
    public double gToKg(double value){
        return value/1000;
    }
    public double gToLbs(double value){
        return value*0.00220462262;
    }
    public double gToOz(double value){
        return value*0.0352739619;
    }
    public double gToTons(double value){
        return value*1.10231131*Math.pow(10, -6);
    }
    
    public double lbsToKg(double value){
        return value*0.45359237;
    }
    public double lbsToG(double value){
        return value*453.59237;
    }
    public double lbsToOz(double value){
        return value*16;
    }
    public double lbsToTons(double value){
        return value*0.0005;
    }
    
    public double ozToKg(double value){
        return value*0.0283495231;
    }
    public double ozToG(double value){
        return value*28.3495231;
    }
    public double ozToLbs(double value){
        return value*0.0625;
    }
    public double ozToTons(double value){
        return value*3.12500*Math.pow(10, -5);
    }
    
    public double tonsToKg(double value){
        return value*907.18474;
    }
    public double tonsToG(double value){
        return value*907184.74;
    }
    public double tonsToLbs(double value){
        return value*2000;
    }
    public double tonsToOz(double value){
        return value*32000;
    }
    
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
            java.util.logging.Logger.getLogger(WeightJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WeightJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WeightJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WeightJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeightJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
