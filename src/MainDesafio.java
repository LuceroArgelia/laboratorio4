/**
 * Prueba del desafío: Author y Book (agregación, bidireccionalidad y sobrecarga de addBook).
 */
public class MainDesafio {
    public static void main(String[] args) {
        Author author = new Author("Gabriel Garcia Marquez");

        // addBook(Book book)
        Book b1 = new Book("Cien anios de soledad", author, 25.50);
        author.addBook(b1);

        // addBook(String title, double price) - sobrecarga
        author.addBook("El amor en los tiempos del colera", 22.00);

        System.out.println("Libros de " + author.getName() + ":");
        for (Book b : author.getBooks()) {
            b.getInfo();
        }
    }
}
