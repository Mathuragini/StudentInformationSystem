/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.student;

import abc_internationalcollege_sis.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
//student class to insert , delete, update student information
public class student {
    public void insertUpdateDeleteStudent(char operation,String id,String fname,String lname, String gender, String bdate,String phone,String address){
        Connection con = DbConnection.dbconnect();  //connecting system with database
        PreparedStatement ps; 
        
       
        //inserting operation to add new data
        if(operation == 'i')    //i for insert
        {
            try {                               //query to add student data
                ps=con.prepareStatement("insert into abc_sis.student(studentID,firstName,lastName,Gender,birthDate,phoneNumber,address) values (?,?,?,?,?,?,?)");
                 ps.setString(1, id);                                        // getting user input to add, studentID
                ps.setString(2, fname);              // getting user input to add, student first name
                ps.setString(3, lname);              // getting user input to add, student last name
                ps.setString(4, gender);             // getting user input to add, student gender 
                ps.setString(5, bdate);              // getting user input to add, student birthDate
                ps.setString(6, phone);              // getting user input to add, student phoneNumber
                ps.setString(7, address);
               
                 
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "New Student added");  //showing message when new student is added to the database
                }
            } catch (SQLException ex) {         //try, catch to avoid error when inserting data
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
       //update operation to edit data 
        if(operation == 'u')//u for edit 
        {
            try {                        //query to update student data to particular student id                                                                
                ps=con.prepareStatement("update abc_sis.student set firstName = ?,lastName=?,Gender=?,birthDate=?,phoneNumber=?,address=? where studentID=?;");
                ps.setString(1, fname);      //enter the  first name to edit 
                ps.setString(2, lname);      //enter  lastname to edit 
                ps.setString(3, gender);     //enter gender to edit 
                ps.setString(4, bdate);     //enter the date of birth to edit 
                ps.setString(5, phone);     //enter the phone no to edit 
                ps.setString(6, address);   //enter the address to edit 
                ps.setString(7, id);         //enter the id to edit 
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "Student data updated"); //showing message when student is update  to the database
                }
            } catch (SQLException ex) {//try, catch to avoid error when update data
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        //delete operation to remove data 
         if(operation == 'd')//d for delete 
         {
            try {
                ps=con.prepareStatement("delete from abc_sis.student where studentId=? "); //query to delete student data to perticular student id 
               
                ps.setString(1, id);
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "Student data is deletde");//showing message when  student is deleted 
                }
            } catch (SQLException ex) {//try, catch to avoid error when deleting data
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //method to to fill jtable with student information 
    public void fillStudentJtable(JTable table,String valueToSearch){
       
        Connection con = DbConnection.dbconnect(); //connecting system with database
        PreparedStatement ps;
        try {            
            ps =con.prepareStatement(" select * from abc_sis.student where concat(studentID,firstName,lastName,Gender,birthDate,phoneNumber,address)like ?");
            ps.setString(1,"%"+ valueToSearch +"%");
            
            ResultSet rs=ps.executeQuery();
            DefaultTableModel model =( DefaultTableModel)table.getModel();
            
            Object []row;
            while(rs.next()){//filling student data in jtable 
                row =new Object[7];
                row[0]= rs.getString(1);//getting student id in first row
                row[1]= rs.getString(2);//getting student f_name in second row
                row[2]= rs.getString(3);//getting student l_name in third row
                row[3]= rs.getString(4);//getting student gender four row
                row[4]= rs.getString(5);//getting student dob in fifth row
                row[5]= rs.getString(6);//getting student tp_no in sixth row
                row[6]= rs.getString(7);//getting student address in seventh row
                
                model.addRow(row);
            }
                    
        } catch (SQLException ex) {//try catch to aviod error handling method 
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
