
package com.system.student;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AddLecturerInfo extends javax.swing.JFrame {

    /**
     * Creates new form Lecturer
     */
    Lecturer lec = new Lecturer();
    public AddLecturerInfo() {
        initComponents();
        ButtonGroup bg=new ButtonGroup();
        bg.add(jRadioButton_Lecturer_female);     //adding radio button in frame 
        bg.add(jRadioButton_Lecturer_male);
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Lecturer_tp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Lecturer_address = new javax.swing.JTextArea();
        jDateChooserBirth_Lecturer = new com.toedter.calendar.JDateChooser();
        jRadioButton_Lecturer_female = new javax.swing.JRadioButton();
        jRadioButton_Lecturer_male = new javax.swing.JRadioButton();
        jTextField_Lecturer_LName = new javax.swing.JTextField();
        jTextField_LecturerFName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton_Lecturer_Add = new javax.swing.JButton();
        jButton_Lecturer_cancel = new javax.swing.JButton();
        jButton_Lecturer_clear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Address :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("TP_NO :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Birth of date :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Gender :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Last Name :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("First Name :");

        jTextField_Lecturer_tp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_Lecturer_tp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Lecturer_tpActionPerformed(evt);
            }
        });
        jTextField_Lecturer_tp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Lecturer_tpKeyTyped(evt);
            }
        });

        jTextArea_Lecturer_address.setColumns(20);
        jTextArea_Lecturer_address.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextArea_Lecturer_address.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Lecturer_address);

        jDateChooserBirth_Lecturer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jRadioButton_Lecturer_female.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton_Lecturer_female.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton_Lecturer_female.setText("Female");

        jRadioButton_Lecturer_male.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton_Lecturer_male.setText("Male");

        jTextField_Lecturer_LName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_Lecturer_LName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Lecturer_LNameActionPerformed(evt);
            }
        });

        jTextField_LecturerFName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Teachers-icon.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel1.setText("Add Lecturer");

        jButton_Lecturer_Add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Lecturer_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add1.png"))); // NOI18N
        jButton_Lecturer_Add.setText("Add");
        jButton_Lecturer_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Lecturer_AddActionPerformed(evt);
            }
        });

        jButton_Lecturer_cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Lecturer_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancel1.png"))); // NOI18N
        jButton_Lecturer_cancel.setText("Cancel");
        jButton_Lecturer_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Lecturer_cancelActionPerformed(evt);
            }
        });

        jButton_Lecturer_clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Lecturer_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Clear-icon.png"))); // NOI18N
        jButton_Lecturer_clear.setText("Clear");
        jButton_Lecturer_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Lecturer_clearActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/abc4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton_Lecturer_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton_Lecturer_clear)
                        .addGap(32, 32, 32)
                        .addComponent(jButton_Lecturer_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(10, 10, 10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jRadioButton_Lecturer_male)
                                .addGap(71, 71, 71)
                                .addComponent(jRadioButton_Lecturer_female))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                            .addComponent(jTextField_LecturerFName)
                            .addComponent(jDateChooserBirth_Lecturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_Lecturer_tp)
                            .addComponent(jTextField_Lecturer_LName))
                        .addGap(53, 53, 53)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_LecturerFName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Lecturer_LName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton_Lecturer_male)
                    .addComponent(jRadioButton_Lecturer_female))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jDateChooserBirth_Lecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Lecturer_tp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(33, 33, 33)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Lecturer_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Lecturer_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Lecturer_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Lecturer_tpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Lecturer_tpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Lecturer_tpActionPerformed

    private void jTextField_Lecturer_tpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Lecturer_tpKeyTyped
        // allow only numbers
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_Lecturer_tpKeyTyped

    private void jTextField_Lecturer_LNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Lecturer_LNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Lecturer_LNameActionPerformed
 public boolean veriText(){
     //can't insert null values
        if(jTextField_LecturerFName.getText().equals("")||jTextField_Lecturer_LName.getText().equals("")||jTextField_Lecturer_tp.getText().equals("")||jTextArea_Lecturer_address.getText().equals("")||jDateChooserBirth_Lecturer.getDate()==null){
             JOptionPane.showMessageDialog(null, "One or more empty field");
            return false;
         
         //choose a date higher than the current date    
        }else if(jDateChooserBirth_Lecturer .getDate().compareTo(new Date())>0){
            JOptionPane.showMessageDialog(null, "No lecturer from the Future are not allowed");
            return false;
        }
        else{
             return true;
        }
            
       
    }
    private void jButton_Lecturer_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Lecturer_AddActionPerformed
     //adding new student details 
        String fname=jTextField_LecturerFName.getText();      //inserting firstname   
        String lname=jTextField_Lecturer_LName.getText();     //inserting last name 
        String phone=jTextField_Lecturer_tp.getText();        //inserting tp_no 
        String address=jTextArea_Lecturer_address.getText();  //inserting address 
        String gender ="Male";
        if(jRadioButton_Lecturer_female.isSelected()){    
            gender="Female";
        }

        if(veriText()){

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");   // date format
            String bdate = dateFormat.format(jDateChooserBirth_Lecturer.getDate());

            Lecturer lec = new Lecturer();      //creating object for lecturer class 
            lec.insertUpdateDeleteStudent('i', null, fname, lname, gender, bdate, phone, address);
                     
            //adding student details in jtable2 (lecturer table)
           ManageLecturerInfo.jTable2.setModel(new DefaultTableModel(null,new Object[]{"Id","First name","Last Name","Gender","Birthdate","Phone Number","Address",}));
           lec. fillLecturerJtable(ManageLecturerInfo.jTable2, "");

        }
    }//GEN-LAST:event_jButton_Lecturer_AddActionPerformed

    private void jButton_Lecturer_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Lecturer_cancelActionPerformed
        this.dispose();      //exit addlecturerinfo frame 
    }//GEN-LAST:event_jButton_Lecturer_cancelActionPerformed

    private void jButton_Lecturer_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Lecturer_clearActionPerformed

        jTextArea_Lecturer_address.setText("");      //clear data from textArea 
        jTextField_LecturerFName.setText("");        //clear data from textfield 
        jTextField_Lecturer_LName.setText("");
        jTextField_Lecturer_tp.setText("");
        jRadioButton_Lecturer_female.setSelected(false);     //female radio button setselected = false
        jRadioButton_Lecturer_male.setSelected(false);      //male radio button setselected = false
        jDateChooserBirth_Lecturer.setDate(null);           //setdate as empty 
    }//GEN-LAST:event_jButton_Lecturer_clearActionPerformed

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
            java.util.logging.Logger.getLogger(AddLecturerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddLecturerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddLecturerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLecturerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddLecturerInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Lecturer_Add;
    private javax.swing.JButton jButton_Lecturer_cancel;
    private javax.swing.JButton jButton_Lecturer_clear;
    private com.toedter.calendar.JDateChooser jDateChooserBirth_Lecturer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton_Lecturer_female;
    private javax.swing.JRadioButton jRadioButton_Lecturer_male;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Lecturer_address;
    private javax.swing.JTextField jTextField_LecturerFName;
    private javax.swing.JTextField jTextField_Lecturer_LName;
    private javax.swing.JTextField jTextField_Lecturer_tp;
    // End of variables declaration//GEN-END:variables
}
