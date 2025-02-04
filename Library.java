import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Funcionalidad para agregar un libro
    public void addBook(Book book) {
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


// Funcionalidad para buscar por autor
public Book findBookByAuthor(String author) {
for (Book book : books) {
if (book.getAuthor().equalsIgnoreCase(author)) {
return book;
}
}
return null;
}
//Funcionalidad para elimnar un libro
public void removeBook(String title, String author) {
Book bookToRemove = null;
for (Book book : books) {
if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author)) {
bookToRemove = book;
break;
}
}
if (bookToRemove != null) {
books.remove(bookToRemove);
System.out.println("Libro eliminado: " + bookToRemove);
} else {
System.out.println("Libro no encontrado.");
}
}
}
