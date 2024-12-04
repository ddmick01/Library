import java.util.*;
public interface BookService {
    // add book to system, throws error if book has invalid data or already exists in system
    Book addBook(Book book) throws InvalidBookDataException, DuplicateISBNException;

    // remove book from system, throws error if book DNE
    void removeBook(String isbn) throws BookNotFoundException;

    // update existing book in system, throws error if book DNE or new book data invalid
    Book updateBook(Book book) throws BookNotFoundException, InvalidBookDataException;

    // search for books based on certain criteria and returns the books that match
    List<Book> searchBooksAuthor(String author);
    List<Book> searchBooksTitle(String title);
    List<Book> searchBooksGenre(String genre);
    List<Book> searchBooksPublicationYear(String publicationYear);
}