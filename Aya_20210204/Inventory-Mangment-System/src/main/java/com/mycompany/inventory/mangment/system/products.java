/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory.mangment.system;

/**
 *
 * @author asus
 */
public class products extends categoryy /*implements acessable*/ {
    private static int productId;
    private String productName;
    private int price;
    private int quantity;
    private String productionDate;
    private String expirationDate;
    private int rate;
    


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
        productId++;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    public void addProduct(String productName,int price,int quantity,String categoryName,String expirationDate,String productionDate){
        
    }
    public void updateProduct(String productName,int price,int quantity,String categoryName,String expirationDate,String productionDate){
    }
   // public int delete(String productName){
        
   // }
    //public ResultSet search(String productName){
        
   // }
    //public ResultSet show(){
        
    //}
}