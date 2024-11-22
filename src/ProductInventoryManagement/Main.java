/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProductInventoryManagement;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Inventory inventory= new Inventory();
        inventory.addProduct("Laptop", 999.99, 5);
        inventory.addProduct("Smartphone", 499.99, 10);
        inventory.addProduct("Tablet", 299.99, 0);
        inventory.addProduct("Smartwatch", 199.99, 3);
        
        System.out.println("The total value of the inventory:  "+ inventory.calculateTotal());
        System.out.println("The most expensive product is: "+ inventory.findMostExpensive());
        System.out.println("The product named Headphones is in stock? :" + inventory.checkInStock("Headphones"));
        
        inventory.sortProducts("price", false);
        inventory.displayProducts();
    }
    
}
