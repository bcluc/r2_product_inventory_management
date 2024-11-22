/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductInventoryManagement;

public class Product {
    private String name;
    private double price;
    private int quantity;
    
    public Product( String name, double price, int quantity){
        this.name= name;
        this.price = price;
        this.quantity= quantity;
    }
    
    public double calculatePrice (){
        return price*quantity;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
     @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", quantity=" + quantity + "}";
    }
}
