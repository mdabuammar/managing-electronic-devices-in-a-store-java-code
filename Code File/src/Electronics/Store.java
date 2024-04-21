
package Electronics;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Store extends javax.swing.JFrame {

    ArrayList<retail> lb;
DefaultTableModel dtm;
    public Store() {
       lb=new ArrayList<>();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Price");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 61, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Date");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Brand");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jTextField1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField1.setText("Washing Machine");
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 150, -1));

        jTextField2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 150, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Device");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 60, 20));

        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Device", "Price", "Date", "Quantity", "Brand", "Model"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 590, 340));

        jButton5.setBackground(new java.awt.Color(204, 255, 204));
        jButton5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton5.setText("Buy More");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 100, -1));

        jButton6.setBackground(new java.awt.Color(0, 255, 204));
        jButton6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton6.setText("Insert");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 100, -1));

        jButton7.setBackground(new java.awt.Color(153, 153, 255));
        jButton7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton7.setText("Update");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 100, -1));

        jButton8.setBackground(new java.awt.Color(255, 153, 51));
        jButton8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton8.setText("Discard");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 100, -1));

        jTextField3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 150, -1));
        jPanel5.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 150, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Quantity");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jRadioButton1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jRadioButton1.setText("Samsung");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jRadioButton2.setText("LG");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jTextField4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel5.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 150, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Model");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jTabbedPane1.addTab("Washing Machine", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Price");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 61, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Date");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Brand");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jTextField5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField5.setText("Camera");
        jPanel6.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 150, -1));

        jTextField6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel6.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 150, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Device");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 60, 20));

        jTable2.setBackground(new java.awt.Color(204, 255, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Device", "Price", "Date", "Quantity", "Brand", "Model"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 590, 350));

        jButton9.setBackground(new java.awt.Color(255, 153, 153));
        jButton9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton9.setText("Back");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 100, -1));

        jButton10.setBackground(new java.awt.Color(0, 255, 204));
        jButton10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton10.setText("Insert");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 100, -1));

        jButton11.setBackground(new java.awt.Color(153, 153, 255));
        jButton11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton11.setText("Update");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 100, -1));

        jButton12.setBackground(new java.awt.Color(255, 153, 51));
        jButton12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton12.setText("Discard");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 100, -1));

        jTextField7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel6.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 150, -1));
        jPanel6.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 150, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Quantity");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jRadioButton3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jRadioButton3.setText("Canon");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jRadioButton4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jRadioButton4.setText("Sony");
        jPanel6.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Model");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jTextField8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel6.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 150, -1));

        jButton13.setBackground(new java.awt.Color(204, 255, 204));
        jButton13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton13.setText("Buy Now");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 140, 40));

        jTabbedPane1.addTab("Camera", jPanel6);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setBackground(new java.awt.Color(204, 255, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 380, 430));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("Thank You For Shopping");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 160, 40));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setText("Shopping Receipt");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 200, 40));

        jTabbedPane1.addTab("Shopping Receipt", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow = jTable1.getSelectedRow();

    if (selectedRow >= 0 && selectedRow < lb.size()) {
        retail selectedRetail = lb.get(selectedRow);

        jTextField1.setText(selectedRetail.device);
        jTextField2.setText(Integer.toString(selectedRetail.price));
        // Assuming jDateChooser1 is a JDateChooser component
        try {
            Date selectedDate = new SimpleDateFormat("dd-MM-yyyy").parse(selectedRetail.date);
            jDateChooser1.setDate(selectedDate);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        jTextField3.setText(Integer.toString(selectedRetail.quantity));
        jTextField4.setText(selectedRetail.model);
       

        if (!selectedRetail.model.equals(jRadioButton1.getText())) {
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(true);
        } else {
            jRadioButton1.setSelected(true);
            jRadioButton2.setSelected(false);
        }
        
    }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    jTabbedPane1.setSelectedIndex(1);   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
       jRadioButton2.setSelected(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
       int selectedRow = jTable2.getSelectedRow();

    if (selectedRow >= 0 && selectedRow < lb.size()) {
        retail selectedRetail = lb.get(selectedRow);

        jTextField5.setText(selectedRetail.device);
        jTextField6.setText(Integer.toString(selectedRetail.price));
        // Assuming jDateChooser1 is a JDateChooser component
        try {
            Date selectedDate = new SimpleDateFormat("dd-MM-yyyy").parse(selectedRetail.date);
            jDateChooser2.setDate(selectedDate);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        jTextField7.setText(Integer.toString(selectedRetail.quantity));
        jTextField8.setText(selectedRetail.brand);

        if (!selectedRetail.model.equals(jRadioButton3.getText())) {
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(true);
        } else {
            jRadioButton3.setSelected(true);
            jRadioButton4.setSelected(false);
        }
        
     
    }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    jTabbedPane1.setSelectedIndex(0);    
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DefaultTableModel dtm2 = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel dtm1 = (DefaultTableModel) jTable2.getModel();   
lb.add(new retail(jTextField1.getText(), Integer.parseInt(jTextField2.getText()),
    jDateChooser1.getDate() != null ? new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate()) : "",
    Integer.parseInt(jTextField3.getText()), 
        jRadioButton1.isSelected() ? jRadioButton1.getText() : jRadioButton2.getText(),
    jTextField4.getText()));
Object rowd[] = new Object[6]; 
dtm1.setRowCount(0);
dtm2.setRowCount(0);
for (retail d : lb) {
    rowd[0] = d.device;
    rowd[1] = d.price;
    rowd[2] = d.date;
    rowd[3] = d.quantity;
    rowd[4] = d.brand;
    rowd[5] = d.model;
    dtm1.addRow(rowd);
    dtm2.addRow(rowd);
}
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jDateChooser1.setDate(null);
jRadioButton1.setSelected(false);
jRadioButton2.setSelected(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
StringBuilder dataText = new StringBuilder();
int totalPrice = 0;
int totalQuantity = 0;

for (retail r : lb) {
    dataText.append("Device: ").append(r.device).append("\n");
    dataText.append("Price: ").append(r.price).append("\n");
    dataText.append("Date: ").append(r.date).append("\n");
    dataText.append("Quantity: ").append(r.quantity).append("\n");
    dataText.append("Brand: ").append(r.brand).append("\n");
    dataText.append("Model: ").append(r.model).append("\n");
    dataText.append("Radio Value: ").append(r.radioValue).append("\n");
    dataText.append("-------------------\n");

    totalPrice += r.price * r.quantity; // Calculate total price for this item
    totalQuantity += r.quantity; // Accumulate total quantity
}

dataText.append("Total Price: ").append(totalPrice).append("\n");
dataText.append("Total Quantity: ").append(totalQuantity);

jTextArea1.setText(dataText.toString());
jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      DefaultTableModel dtm2 = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel dtm1 = (DefaultTableModel) jTable2.getModel();      
lb.add(new retail(jTextField5.getText(), Integer.parseInt(jTextField6.getText()),
    jDateChooser2.getDate() != null ? new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser2.getDate()) : "",
    Integer.parseInt(jTextField7.getText()), jRadioButton3.isSelected() ? jRadioButton3.getText() : jRadioButton4.getText(),
    jTextField8.getText()));

Object rowd[] = new Object[6]; // Update to match the number of fields in the 'Device' class
 dtm1.setRowCount(0);
dtm2.setRowCount(0);
for (retail d : lb) {
    rowd[0] = d.device;
    rowd[1] = d.price;
    rowd[2] = d.date;
    rowd[3] = d.quantity;
    rowd[4] = d.brand;
    rowd[5] = d.model;
   
    dtm1.addRow(rowd);
    dtm2.addRow(rowd);
}

// Clearing fields
jTextField5.setText("");
jTextField6.setText("");
jTextField7.setText("");
jTextField8.setText("");
jDateChooser2.setDate(null);
jRadioButton3.setSelected(false);
jRadioButton4.setSelected(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
      jRadioButton1.setSelected(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
   int selectedRow = jTable1.getSelectedRow();
    if (selectedRow >= 0 && selectedRow < lb.size()) {
        String device = jTextField1.getText();
        int price = Integer.parseInt(jTextField2.getText());
        Date selectedDate = jDateChooser1.getDate();
        int quantity = Integer.parseInt(jTextField3.getText());
        String brand = jRadioButton1.isSelected() ? jRadioButton1.getText() : jRadioButton2.getText();
        String model = jTextField4.getText();
        retail selectedRetail = lb.get(selectedRow);
        selectedRetail.device = device;
        selectedRetail.price = price;
        selectedRetail.date = new SimpleDateFormat("yyyy-MM-dd").format(selectedDate);
        selectedRetail.quantity = quantity;
        selectedRetail.brand = brand;
        selectedRetail.model = model;
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setValueAt(device, selectedRow, 0);
        dtm.setValueAt(price, selectedRow, 1);
        dtm.setValueAt(selectedRetail.date, selectedRow, 2);
        dtm.setValueAt(quantity, selectedRow,3 );
        dtm.setValueAt(brand, selectedRow, 4);
        dtm.setValueAt(model, selectedRow, 5); 
    }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        dtm=(DefaultTableModel)jTable1.getModel();
        int choice=JOptionPane.showConfirmDialog(this,"Do you Want to Delete?","Delete",0);
if(choice==0)
{
if(jTable1.getSelectedRowCount()==1)
{
    lb.remove(jTable1.getSelectedRow());
    dtm.removeRow(jTable1.getSelectedRow());
    
}
else
    JOptionPane.showMessageDialog(this, "Select one row");
}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
   int selectedRow = jTable2.getSelectedRow();

    if (selectedRow >= 0 && selectedRow < lb.size()) {
        String device = jTextField5.getText();
        int price = Integer.parseInt(jTextField6.getText());
        Date selectedDate = jDateChooser2.getDate();
        int quantity = Integer.parseInt(jTextField4.getText());
        String brand = jRadioButton3.isSelected() ? jRadioButton4.getText() : jRadioButton3.getText();
        String model = jTextField8.getText();

        retail selectedRetail = lb.get(selectedRow);
        selectedRetail.device = device;
        selectedRetail.price = price;
        selectedRetail.date = new SimpleDateFormat("yyyy-MM-dd").format(selectedDate);
        selectedRetail.quantity = quantity;
        selectedRetail.brand = brand;
        selectedRetail.model = model;

        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        dtm.setValueAt(device, selectedRow, 0);
        dtm.setValueAt(price, selectedRow, 1);
        dtm.setValueAt(selectedRetail.date, selectedRow, 2);
        dtm.setValueAt(quantity, selectedRow,3 );
        dtm.setValueAt(brand, selectedRow, 4);
        dtm.setValueAt(model, selectedRow, 5);

     
    }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
             dtm=(DefaultTableModel)jTable2.getModel();
        int choice=JOptionPane.showConfirmDialog(this,"Do you Want to Delete?","Delete",0);
if(choice==0)
{
if(jTable2.getSelectedRowCount()==1)
{
    lb.remove(jTable2.getSelectedRow());
    dtm.removeRow(jTable2.getSelectedRow());
    
}
else
    JOptionPane.showMessageDialog(this, "Select one row");
}
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Store().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

    private int getRowIndexInTable2(retail selectedRetail) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
