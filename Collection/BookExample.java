package Collection;
import java.util.HashSet;
class Book {
    int id;
    String name, author, publisher;
    int identity;
    public Book(int id, String name, String author, String publisher, int identity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.identity = identity;
    }
}
public class BookExample {
    public static void main(String[] args) {
        HashSet<Book> s = new HashSet<>();
        Book b1 = new Book(8, "Phyics", "Huzaifa", "PSA", 43);
        Book b2= new Book(12, "chemistry", "JKS", "CSa", 45);
        s.add(b1);
        s.add(b2);
        for (Book b : s) {
            System.out.print(b.id+b.name+"\n"+b.author+"\n"+b.publisher+"\n"+b.identity);

        }

    }
}


