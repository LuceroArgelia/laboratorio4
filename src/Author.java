import java.util.ArrayList;
import java.util.List;

/**
 * Desafío: clase Author (agregación: un Author tiene una lista de Book).
 * Encapsulación: atributos privados con métodos públicos de acceso.
 * Sobrecarga: addBook(Book) y addBook(String, double).
 */
public class Author {
    private String name;
    private List<Book> books;

    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Agrega un libro ya creado
    public void addBook(Book book) {
        books.add(book);
    }

    // Sobrecarga: crea el libro a partir de título y precio
    public void addBook(String title, double price) {
        books.add(new Book(title, this, price));
    }

    public List<Book> getBooks() {
        return books;
    }
}
