
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
//lecturer class to insert , delete, update student information
public class Lecturer {
     public void insertUpdateDeleteStudent(char operation,Integer id,String fname,String lname, String gender, String bdate,String phone,String address){
        Connection con = DbConnection.dbconnect();        //connecting system with database
        PreparedStatement ps;         
         //inserting operation to add new data
        if(operation == 'i')//i for insert
        {
            try {                     //query to add lecturer data
                ps=con.prepareStatement("insert into abc_sis.lecturer(firstName,lastName,Gender,birthDate,phoneNumber,address) values (?,?,?,?,?,?)");
                ps.setString(1, fname);     // getting user input to add, lecturer fname
                ps.setString(2, lname);     // getting user input to add, lecturer lname
                ps.setString(3, gender);    // getting user input to add, lecturer gender
                ps.setString(4, bdate);     // getting user input to add, lecturer dob
                ps.setString(5, phone);     // getting user input to add, lecturer tp_no
                ps.setString(6, address);   // getting user input to add, lecturer address
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "New lecturer added");
                }
            } catch (SQLException ex) {   //try, catch to avoid error when inserting data
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
         //updating  operation to add new data
        if(operation == 'u'){     // u for update info
            try {                      //query to update lecturer data
                ps=con.prepareStatement("update abc_sis.lecturer set firstName = ?,lastName=?,Gender=?,birthDate=?,phoneNumber=?,address=? where lecturerID=?;");
                ps.setString(1, fname);    //enter the  first name to edit 
                ps.setString(2, lname);    //enter  lastname to edit
                ps.setString(3, gender);   //enter gender to edit 
                ps.setString(4, bdate);    //enter the date of birth to edit 
                ps.setString(5, phone);    //enter the phone no to edit 
                ps.setString(6, address);  //enter the address to edit 
                ps.setInt(7, id);          //enter the id to edit 
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "lecturer data updated");
                }
            } catch (SQLException ex) {          //try, catch to avoid error when updating data
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
       //deleting  operation to add new data
         if(operation == 'd'){        //d for delete info
            try {                    //query to delete lecturer data
                ps=con.prepareStatement("delete from abc_sis.lecturer where lecturerID=? ");
               
                ps.setInt(1, id);
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "lecturer is deletde");
                }
            } catch (SQLException ex) {      //try, catch to avoid error when deleting  data
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void fillLecturerJtable(JTable table,String valueToSearch){//method to to fill jtable with lecturer information 
       
        Connection con = DbConnection.dbconnect(); //connecting system with database
        PreparedStatement ps;
        try {            
            ps =con.prepareStatement(" select * from abc_sis.lecturer where concat(firstName,lastName,Gender,birthDate,phoneNumber,address)like ?");
            ps.setString(1,"%"+ valueToSearch +"%");
            
            ResultSet rs=ps.executeQuery();
            DefaultTableModel model =( DefaultTableModel)table.getModel();
            
            Object []row;
            while(rs.next()){//filling student data in jtable 
                row =new Object[7];
                row[0]= rs.getInt(1);        //getting lecturer id in first row
                row[1]= rs.getString(2);     //getting lecturer f_name in second row
                row[2]= rs.getString(3);     //getting lecturerl_name in third row
                row[3]= rs.getString(4);    //getting lecturer gender four row
                row[4]= rs.getString(5);    //getting lecturer dob in fifth row
                row[5]= rs.getString(6);   //getting lecturer tp_no in sixth row
                row[6]= rs.getString(7);   //getting lecturer address in seventh row
                
                model.addRow(row);
            }                    
        } catch (SQLException ex) {     //try catch to aviod error handling method 
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
}
