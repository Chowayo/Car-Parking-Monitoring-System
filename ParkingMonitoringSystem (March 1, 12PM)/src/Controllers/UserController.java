package Controllers;


import Database.DBConnection;
import Models.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    
    public String convert(String password, String[] encryp, String[] smallLetters){
        int start=0, end=1, a;
        String new_word="";
        for(int i=0; i<password.length(); i++){
            a = 0;
            for(String encry: encryp){
                if(password.substring(start,end).equals(smallLetters[a])){
                    new_word += encry;
                }
                a++; 
            }
            start++;
            end++;
        }
        return new_word;
    }
    
    public List<Users> session(int employeeID, String password){
        Users user = new Users();
        
        List<Users> sessions = new ArrayList<Users>();
        
        String sql = "Select * from employees WHERE employeeID = ? AND password = ?";
        
        try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setInt(1, employeeID);
            ps.setString(2, password);
            
            try(ResultSet resultset = ps.executeQuery()){
                if(resultset.next()){
                    user.setEmployeeID(resultset.getInt("employeeID"));
                    user.setFname(resultset.getString("first_name"));
                    user.setLname(resultset.getString("last_name"));
                    user.setEmail(resultset.getString("email"));
                    user.setPassword(resultset.getString("password"));                      
                }
                sessions.add(user);
            }
           
        }catch(SQLException e){
            e.printStackTrace();  
        }
        return sessions;
    }
    
    
    //FOR DEMO ONLY 
    public void update(Users user, int userId){
        String sql = "UPDATE employees SET first_name = ?, last_name = ?, email = ?, password = ? WHERE employeeID = ?";
        
        try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, user.getFname());
            ps.setString(2, user.getLname());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPassword());
            ps.setInt(5, userId);
            
            ps.executeUpdate();
        
        }catch(SQLException e){
            System.err.println("Error Updating data: "+ e.getMessage());
            e.printStackTrace();  
        }
    
    }
    
    
       
    
}

