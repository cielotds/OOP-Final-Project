/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author Cielo Tadas
 */
public class ConnectionProvider {
     public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ghbsystem?useSSL=false", "root", "1024");
            return con;
        }
        catch(Exception e){
                return null;
                }
    }
}
