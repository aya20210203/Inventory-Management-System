/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory.mangment.system;

/**
 *
 * @author asus
 */
public class categoryy /*implements acessable*/ {
    private static int categoryId;
    private String categoryName;

  

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        categoryId++;
    }
    public void addCategory(String categoryName){
        
    }
   // public int delete(String categoryName){
        
    //}
   // ResultSet show(){
        
  //  }

    
}
