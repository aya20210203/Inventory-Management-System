/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory.mangment.system;

/**
 *
 * @author asus
 */
public class supplier extends products /*implements acessable*/{
    private static int supplierId;
    private String supplierName;
    

   
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        supplierId++;
    }
    public void addSupplier(String supplierName,String productName){
        
    }
    public void updateSupplier(String supplierName,String productName){
        
    }
  //  public int delete(supplierName){
        
  //  }
  //  public ResultSet show(){
        
    //}
    
}
