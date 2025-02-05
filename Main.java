public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Agregar algunos libros
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("1984", "George Orwell")); // Intento de agregar un libro duplicado

        // Listar los libros ordenados por título
        library.listBooks();

        // Buscar libros por título
        Book foundBook = library.findBookByTitle("1984");
        if (foundBook != null) {
            System.out.println("Libro encontrado por título: " + foundBook);
        } else {
            System.out.println("Libro no encontrado.");
        }

        // Buscar libros por autor
        Book foundBookByAuthor = library.findBookByAuthor("Harper Lee");
        if (foundBookByAuthor != null) {
            System.out.println("Libro encontrado por autor: " + foundBookByAuthor);
        } else {
            System.out.println("Libro no encontrado.");
        }

        // Eliminar un libro
        library.removeBook("1984", "George Orwell");

        // Listar los libros después de la eliminación
        library.listBooks();
    }
}
