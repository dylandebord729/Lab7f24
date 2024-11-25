/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dgdebordpstcc.dylan_debord_lab07_bookstoreapp;

/**
 *
 * @author dgdeb_b82hwq2
 */
public class Dylan_DeBord_Lab07_Book {
        private String title;
    private String author;
    private Double price;
    private int quantityInStock;
    
    public Dylan_DeBord_Lab07_Book(){
        title = "";
        author = "";
        price = 0.0;
        quantityInStock = 0;
    }
    public Dylan_DeBord_Lab07_Book(String title, String author, Double price, int quantityInStock){
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    //@return the title
    public String getTitle() {
        return title;
    }
    //@param title the title to set
    public void setTitle(String title) {
        this.title = title;
    }
    
    //@return the author
    public String getAuthor() {
        return author;
    }
    //@param author the author to set
    public void setAuthor(String author) {
        this.author = author;
    }
    
    //@return the price
    public Double getPrice() {
        return price;
    }
    //@param price the price to set
    public void setPrice(Double price) {
        this.price = price;
    }
    
    //@return the quanityInStock
    public int getQuantityInStock() {
        return quantityInStock;
    }
    //@param quanityInStock the quanityInStock to set
    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    
    public double getTotalValueInStock(){
        double totalPrice = price * quantityInStock;
        return totalPrice;
    } 
}
