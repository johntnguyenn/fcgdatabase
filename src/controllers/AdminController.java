package controllers;

import connections.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Admin;

public class AdminController {
    
    Connection connection = new DBConnection().getConnection();
    
    public int registerAdmin(Admin admin){
       int added = 0;
        try
        {
            String query = "insert into admin (username, contact, email, password)"
                    + "values (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, admin.getUsername());
            preparedStatement.setString(2, admin.getContact());
            preparedStatement.setString(3, admin.getEmail());
            preparedStatement.setString(4, admin.getPassword());
          
            added = preparedStatement.executeUpdate();

        }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "Something went wrong when try to add admin informations, \nPlese Check Database connection");
        }
        
        return added;
        
    }
     public String login(String email, String password){
       String login = null;
        try
        {
            String query = "select username from admin where email =? AND password =?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
          
                login  = resultSet.getString("username");
            }
            
          
        }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "Something went wrong while admin logging \nPlese Check Database connection");
        }
        
        return login;
        
    }
     
     public List<Admin> getAllAdmin(){
       List<Admin> admins = new ArrayList<>();
        try
        {
            String query = "select * from admin";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
          
                Admin admin = new Admin(resultSet.getString("username"), resultSet.getString("contact"), resultSet.getString("email"), resultSet.getString("password"));
                admins.add(admin);
            }
            
          
        }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "Something went wrong while getting admins \nPlese Check Database connection");
        }
        
        return admins;
        
    }
}
