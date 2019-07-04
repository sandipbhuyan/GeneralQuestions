import com.sun.xml.internal.bind.v2.runtime.NameList;

public class Book
{
    String name;
    Author author;
    double price;
    int qtyStock;

    Book(String name, Author author, double price, int qtyStock)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyStock = qtyStock;
    }

    public static void main(String[] args) {
        Author a = new Author("Arpita", "arpita@gmail.com", "f");
        Book b = new Book("Story of arpita",a,100,1000);
        System.out.println("Book Name : " + b.name);
        System.out.println("Aythor Name : " + b.author.name);
        System.out.println("Author gender : " + b.author.gender);
        System.out.println("Book price : " + b.price);
        System.out.println("Book Quantity : " + b.qtyStock);
    }
}