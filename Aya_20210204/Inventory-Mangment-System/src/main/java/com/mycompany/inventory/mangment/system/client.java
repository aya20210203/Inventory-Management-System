/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory.mangment.system;

/**
 *
 * @author asus
 */
public class client {
    private static int clientId;
    private String email;
    private String password;

   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        clientId++;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void addClient(String email,String password){
        
    }
   // public int isClient(String email,String password){
        
   // }
}
