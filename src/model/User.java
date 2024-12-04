/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Cielo Tadas
 */
public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    
    public User() {}
    
    public User (int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }
       
    public String getEmail(){
        return email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }


    public String getPassword() {
        return password;
    }
   
}
