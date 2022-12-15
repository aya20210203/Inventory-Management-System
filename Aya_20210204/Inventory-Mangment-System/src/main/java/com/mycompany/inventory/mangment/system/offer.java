/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory.mangment.system;

/**
 *
 * @author asus
 */
public class offer extends products /*implements acessable*/{
    
     private int quantity;
     private String startDate;
     private String endDate;
     private int percentage;

    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
    public void addOffer(String productName,int quantity,String startDate,String endDate,int percentage){
        
    }
    public void updateOffer(String productName,int quantity,String startDate,String endDate,int percentage){
        
    }
    //public int delete(String productname){
        
    //}
    
}
