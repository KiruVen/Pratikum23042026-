/*
 Nama    : Muhammad Taufiqillah, NIM :2501082017
 */
package pratikum23042026;

public class Book {
    private final String nama;
    private final Author Author;
    private double price;
    private int qty;
    
    public Book(String nama, Author Author, double price, int qty){
        this.nama = nama;
        this.Author = Author;
        this.price = price;
        this.qty = qty;
    }
    public String getNama(){
        return nama;
    }
    public Author getAuthor(){
        return Author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString() {
        return "Book[Nama: " + nama + 
           ", Author: " + Author + 
           ", Harga: " + price + 
           ", Jumlah: " + qty + "]";
    }
}