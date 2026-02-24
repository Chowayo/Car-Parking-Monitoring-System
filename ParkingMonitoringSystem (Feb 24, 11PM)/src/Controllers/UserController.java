package Controllers;


import Database.DBConnection;
import Models.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserController {
    
    public void register(Users user){ 
        String query = "INSERT INTO employees(first_name, last_name, email, password) values" //User is the table name
                + "(?,?,?,?)";   
        try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(query)){
            
           
            ps.setString(1, user.getFname()); 
            ps.setString(2, user.getLname()); 
            ps.setString(3, user.getEmail()); 
            ps.setString(4, user.getPassword()); 
            
            ps.executeUpdate();
        
        } catch (SQLException e){
            e.printStackTrace(); //Output if the value is not inserted in the table or try had an error
        }  
    }
    
    
    public Users authenticate(String employeeID, String password){
        String sql = "SELECT * FROM employees WHERE employeeID = ? AND password = ?"; //Is the SQL syntax for system to run 
        
        try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)){
            
            int converted_employeeID = Integer.parseInt(employeeID);
        
            ps.setInt(1, converted_employeeID); 
            ps.setString(2, password); 
            
            ResultSet rs = ps.executeQuery(); 
            
            if(rs.next()){ 
                Users user = new Users();
                user.setFname(rs.getString("EmployeeID"));
                user.setLname(rs.getString("EmployeeID"));
                user.setEmail(rs.getString("EmployeeID"));
                user.setEmployeeID(rs.getInt("EmployeeID")); 
                user.setPassword(rs.getString("EmployeeID")); 
                return user; 
            }

        } catch(Exception e){
            e.printStackTrace();
            
        }
        return null; //IMPORTANT IDK WHY
    }
    
    
    
    
    
    
    
}

