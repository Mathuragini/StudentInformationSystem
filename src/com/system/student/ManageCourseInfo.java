/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.student;

import static com.system.student.ManageStudentsInfo.jTable1;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class ManageCourseInfo extends javax.swing.JFrame {

    /**
     * Creates new form ManageCourseInfo
     */
    course crs = new course();
    DefaultTableModel model;
    public ManageCourseInfo() {
        initComponents();
        crs.fillCourseJtable(jTable3);
       
        model =(DefaultTableModel)jTable3.getModel();
        jTable3.setRowHeight(30);
        jTable3.setShowGrid(true);
        jTable3.setGridColor(Color.black);
        jTable3.setSelectionBackground(Color.blue);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton_co_add = new javax.swing.JButton();
        jButton_co_Remove = new javax.swing.JButton();
        jButton_co_cancel = new javax.swing.JButton();
        jSpinner_co_module = new javax.swing.JSpinner();
        jSpinner_co_duration = new javax.swing.JSpinner();
        jTextField1_courseName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField_coID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton_co_edit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setText("Manage Course Info");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel2.setText("Course Name :");

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel3.setText("No of Modules :");

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel4.setText("Duration (Months) :");

        jButton_co_add.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton_co_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add stu.png"))); // NOI18N
        jButton_co_add.setText("Add");
        jButton_co_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_co_addActionPerformed(evt);
            }
        });

        jButton_co_Remove.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton_co_Remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        jButton_co_Remove.setText("Remove");
        jButton_co_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_co_RemoveActionPerformed(evt);
            }
        });

        jButton_co_cancel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton_co_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancel1.png"))); // NOI18N
        jButton_co_cancel.setText("Cancel");
        jButton_co_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_co_cancelActionPerformed(evt);
            }
        });

        jSpinner_co_module.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinner_co_module.setModel(new javax.swing.SpinnerNumberModel(2, 2, 50, 1));

        jSpinner_co_duration.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinner_co_duration.setModel(new javax.swing.SpinnerNumberModel(2, 2, 80, 1));

        jTextField1_courseName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CourseID", "CourseName", "No.of.Modules", "Duration(Months)"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable3);

        jTextField_coID.setEditable(false);
        jTextField_coID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel5.setText("CourseID:");

        jButton_co_edit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton_co_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Text-Edit-icon.png"))); // NOI18N
        jButton_co_edit.setText("Edit");
        jButton_co_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_co_editActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Courses-iconNew.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_co_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_co_Remove)
                        .addGap(22, 22, 22)
                        .addComponent(jButton_co_edit)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_co_cancel)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField1_courseName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                            .addComponent(jSpinner_co_duration, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSpinner_co_module, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                            .addComponent(jTextField_coID, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_coID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1_courseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jSpinner_co_module, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner_co_duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_co_add)
                            .addComponent(jButton_co_Remove)
                            .addComponent(jButton_co_edit)
                            .addComponent(jButton_co_cancel))))
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_co_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_co_addActionPerformed

                addCourseFrame AdCor = new  addCourseFrame();
                AdCor.setVisible(true);
                AdCor.pack();
                AdCor.setLocationRelativeTo(null);
                AdCor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);          
    }//GEN-LAST:event_jButton_co_addActionPerformed

    private void jButton_co_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_co_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_co_cancelActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int Index = jTable3.getSelectedRow();
        
       jTextField_coID.setText(model.getValueAt(Index, 0).toString());
       jTextField1_courseName.setText(model.getValueAt(Index, 1).toString());
       jSpinner_co_module.setValue(Integer.valueOf(model.getValueAt(Index, 2).toString()));
       jSpinner_co_duration.setValue(Integer.valueOf(model.getValueAt(Index, 3).toString()));
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton_co_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_co_editActionPerformed
        if(!crs.isCourseExit(jTextField1_courseName.getText())){
            int id = Integer.valueOf(jTextField_coID.getText());
            
            String name = jTextField1_courseName.getText();
            int module = Integer.valueOf(jSpinner_co_module.getValue().toString());
            int duration = Integer.valueOf(jSpinner_co_duration.getValue().toString());
            
            crs.insertUpdateDeleteStudent('u', id, name, module, duration);  
            
            ManageCourseInfo.jTable3.setModel(new DefaultTableModel(null,new Object[]{"courseID","CourseName","Modules","Duration(Months)"}));
            crs.fillCourseJtable(ManageCourseInfo.jTable3);
            JOptionPane.showMessageDialog(null, "Course Edited");
           
        } else{
            
            JOptionPane.showMessageDialog(null, "Course is already exit");
        }
    }//GEN-LAST:event_jButton_co_editActionPerformed

    private void jButton_co_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_co_RemoveActionPerformed
            
            if(!jTextField_coID.getText().equals("")){
            int id = Integer.valueOf(jTextField_coID.getText());
            crs.insertUpdateDeleteStudent('d', id, null, null,null);  
            
            ManageCourseInfo.jTable3.setModel(new DefaultTableModel(null,new Object[]{"courseID","CourseName","Modules","Duration(Months)"}));
            crs.fillCourseJtable(ManageCourseInfo.jTable3);
            
            jTextField_coID.setText("");
            jTextField1_courseName.setText("");
            jSpinner_co_module.setValue(2);
            jSpinner_co_duration.setValue(2);
            }
    }//GEN-LAST:event_jButton_co_RemoveActionPerformed

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
            java.util.logging.Logger.getLogger(ManageCourseInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCourseInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCourseInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCourseInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCourseInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_co_Remove;
    private javax.swing.JButton jButton_co_add;
    private javax.swing.JButton jButton_co_cancel;
    private javax.swing.JButton jButton_co_edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_co_duration;
    private javax.swing.JSpinner jSpinner_co_module;
    public static javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1_courseName;
    private javax.swing.JTextField jTextField_coID;
    // End of variables declaration//GEN-END:variables
}
