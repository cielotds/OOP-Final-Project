/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import model.User;
import java.sql.*;

/**
 *
 * @author Cielo Tadas
 */
public class UserDao {
    public static void save(User user){
        String query = "insert into user(name,email,password) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getPassword()+"')";
        DbOperations.setDataOrDelete(query, "Registered Successfully!");
    }
    
    public static User login(String email,String password) {
        User user = null;
        try{
            ResultSet rs = DbOperations.getData("select *from user where email='"+email+"' and password='"+password+"'");
            while(rs.next()) {
                user = new User();
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return user;
    }
}
