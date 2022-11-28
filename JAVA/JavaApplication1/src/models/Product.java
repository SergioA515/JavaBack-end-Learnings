/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Sena
 */
public class Product {
    double price;
    
    public Product(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }
}
