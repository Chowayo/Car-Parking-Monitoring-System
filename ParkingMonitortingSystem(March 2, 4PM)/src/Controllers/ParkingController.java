package Controllers;

import Database.DBConnection;
import Models.Parking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ParkingController {
    
    public void register(Parking park){ 
        String query = "INSERT INTO parking(plate, vehicle, price, slot) values" 
                + "(?,?,?,?)";
        
        try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(query)){
            
            ps.setString(1, park.getPlate());
            ps.setString(2, park.getVehicle());
            ps.setInt(3, park.getPrice());
            ps.setString(4, park.getSlot());
            
            
            ps.executeUpdate();
            
        
        } catch (SQLException e){
            e.printStackTrace(); //Output if the value is not inserted in the table or try had an error
        }  
    }
    
    public void checkout(String slotname){
        String sql = "UPDATE parking SET time_out = CURRENT_TIMESTAMP WHERE slot = ? AND time_out IS NULL";
        
        try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setString(1, slotname);
            
            ps.executeUpdate();
        
        }catch(SQLException e){
            System.err.println("Error Updating data: "+ e.getMessage());
            e.printStackTrace();  
        }
    
    }
    
}
