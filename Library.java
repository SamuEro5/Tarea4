import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Funcionalidad para agregar un libro
    public void addBook(Book book) {
    for (Book b : books) {
        if (b.getTitle().equalsIgnoreCase(book.getTitle()) && b.getAuthor().equalsIgnoreCase(book.getAuthor())) {
            System.out.println("El libro ya existe en la biblioteca.");
            return;
        }
    }
    books.add(book);
    System.out.println("Libro agregado: " + book);
}

    // Funcionalidad para listar todos los libros
    public void listBooks() {
        System.out.println("Lista de libros:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Funcionalidad para buscar un libro por título
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}
