/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgdebordpstcc.dylan_debord_lab07_bookstoreapp;

/**
 *
 * @author dgdeb_b82hwq2
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class Dylan_DeBord_Lab07_BookStoreApp {

    public static void main(String[] args) {
        //Declares Number Format
        NumberFormat c = NumberFormat.getCurrencyInstance();
        
        //Creates the array and Sets up the three (3) differant books.
        Dylan_DeBord_Lab07_Book[] books = new Dylan_DeBord_Lab07_Book[3];
        books[0] = new Dylan_DeBord_Lab07_Book("Java Programming", "John Doe", 50.00, 10);
        books[1] = new Dylan_DeBord_Lab07_Book("Python Essentials", "Jane Smith", 45.00, 8);
        books[2] = new Dylan_DeBord_Lab07_Book("Web Development", "Alice Johnson", 55.00, 5);
        
        //for loop printing the books WITHOUT any changes.
        for (int i = 0; i <= 2; i++) {
            System.out.print("Book: "+ (i + 1));
            System.out.print(" Title: " + books[i].getTitle());
            System.out.print(", Author: " + books[i].getAuthor());
            System.out.print(", Price: " + c.format(books[i].getPrice()));
            System.out.print(", Quantity: " + books[i].getQuantityInStock());
            System.out.println(", Total Value: " + c.format(books[i].getTotalValueInStock()));
        }
        
        //Prints a Blank line.
        System.out.println("");
        
        //Declares scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the book you want to update the quantity for: ");
        int bookNum = input.nextInt();
        
        //Asks for the New quanity for the book in question
        System.out.print("Enter the new quantity: ");
        books[bookNum - 1].setQuantityInStock(input.nextInt());
        
        // Prints a Blank line
        System.out.print("");
        
        //Prints the book that WAS CHANGED.
        System.out.print("Updated Book: "+ bookNum);
        System.out.print(" Title: " + books[bookNum - 1].getTitle());
        System.out.print(", Author: " + books[bookNum - 1].getAuthor());
        System.out.print(", Price: " + c.format(books[bookNum - 1].getPrice()));
        System.out.print(", Quantity: " + books[bookNum - 1].getQuantityInStock());
        System.out.println(", Total Value: " + c.format(books[bookNum - 1].getTotalValueInStock()));
    }
}
