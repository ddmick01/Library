import java.util.*;
public interface InventoryService {
    // update book quantity, throws error if book DNE or quantity data invalid
    void updateInventory(String isbn, int quantity) throws BookNotFoundException, InvalidQuantityException;

    // return amount of one book available, throws error if book DNE
    int getAvailableCopies(String isbn) throws BookNotFoundException;

    // return list of popular books
    List<Book> popularityReport();
}