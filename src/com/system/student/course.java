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
//course class to insert , delete, update student information
public class course {
    public void insertUpdateDeleteStudent(char operation,Integer id, String courseName, Integer module,Integer duration){
        Connection con = DbConnection.dbconnect();
        PreparedStatement ps; 
        
       
        if(operation == 'i'){      //i for insert
            try {                      //query to add course information 
                ps=con.prepareStatement("insert into abc_sis.course(courseName,modules,duration) values (?,?,?)");
                ps.setString(1, courseName);  //inserting course name 
                ps.setInt(2, module);        //inserting modules 
                ps.setInt(3, duration);     //inserting duration 
                          
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "New Course added");
                }
            } catch (SQLException ex) {         //try, catch to avoid error when inserting data
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        if(operation == 'u'){        // u for update info
            try {                    //query to update course information   
                ps=con.prepareStatement("update abc_sis.course set courseName=?,modules=?,duration=? where courseID=?  ");
                ps.setString(1, courseName);  // updating course name to edit  
                ps.setInt(2, module);        //updating modules to edit 
                ps.setInt(3, duration);       //updating  duration to edit       
                ps.setInt(4, id);            //updating id to edit 
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "Course data updated");
                }
            } catch (SQLException ex) {      //try, catch to avoid error when updating  data
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
       
         if(operation == 'd'){      //d for delete info
            try {                  //query to delete course information 
                ps=con.prepareStatement("delete from abc_sis.course where courseID =? ");
               
                ps.setInt(1, id);
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "Course data is deletde");
                }
            } catch (SQLException ex) {      //try, catch to avoid error when deleting  data
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public boolean isCourseExit(String CourseName){
        
        boolean isExist = false;
        Connection con = DbConnection.dbconnect();             //connecting system with database
        PreparedStatement ps;
        try {            
            ps =con.prepareStatement("select * from abc_sis.course where courseName = ?");
            ps.setString(1,CourseName);
            
            ResultSet rs=ps.executeQuery();
           
            if (rs.next()){
                isExist = true;
            }
            
                    
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return isExist;
    }
    
    
    public void fillCourseJtable(JTable table){  
       
        Connection con = DbConnection.dbconnect();           //connecting system with database
        PreparedStatement ps;
        try {            
            ps =con.prepareStatement(" select * from abc_sis.course");
           
            
            ResultSet rs=ps.executeQuery();
            DefaultTableModel model =( DefaultTableModel)table.getModel();
            
            Object []row;
            while(rs.next()){      //filling course data in jtable 
                row =new Object[5];
                row[0]= rs.getInt(1);     //getting course id in first row
                row[1]= rs.getString(2);  //getting courseName in second row
                row[2]= rs.getInt(3);    //getting  modules in third row 
                row[3]= rs.getInt(4);    //getting duration in forth row 
                
            
                model.addRow(row);
            }
                    
        } catch (SQLException ex) {      //try catch to aviod error handling method 
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
}

    

