/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductInventoryManagement;

import java.util.*;


public class Inventory {
    private ArrayList<Product> Products;
    
    public Inventory(){
        this.Products= new ArrayList();
    }
    // addProduct to inventory
    public void addProduct (String name, double price, int quantity)
    {
        Product product= new Product(name, price, quantity);
        this.Products.add(product);
    }
    // calculate total inventory value
    public double  calculateTotal(){
        double totalPrice=0;
        for(Product p: this.Products)
        {
            totalPrice+= p.calculatePrice();
        }
        
        return totalPrice;
    }
    // find the most expensive product
public String findMostExpensive() {
        double max = -1;
        Product maxP = null;
        for (Product p : this.Products) {
            if (max < p.getPrice()) {
                max = p.getPrice();
                maxP = p;
            }
        }
        return maxP != null ? maxP.getName() : "No Products";
    }
// check if a product named is in stock
    public boolean checkInStock(String name) {
        for (Product p : this.Products) {
            if (p.getName().equals(name)) return true;
        }
        return false;
    }

// sort product descending/ ascending order wuth options like by price, quantity.  
    public void sortProducts(String criteria, boolean ascending) {
        Comparator<Product> comparator;


        switch (criteria.toLowerCase()) {
            case "price":
                comparator = Comparator.comparing(Product::getPrice);
                break;
            case "quantity":
                comparator = Comparator.comparing(Product::getQuantity);
                break;
            default:
                System.out.println("Invalid criteria! Choose 'price' or 'quantity'.");
                return;
        }

      
        if (!ascending) {
            comparator = comparator.reversed();
        }

      
        this.Products.sort(comparator);
    }

  // display Products in inventory
    public void displayProducts() {
        System.out.println("-----INVENTORY-----");
        for (Product p : this.Products) {
            System.out.println(p);
        }
    }
}
