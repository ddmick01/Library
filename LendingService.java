import java.util.*;
public interface LendingService {
    // check out a book to a patron, throws errors if book or patron DNE, book not available, or too much owed
    void checkoutBook(String patronId, String isbn) throws PatronNotFoundException, BookNotFoundException, BookUnavailableException, LoanLimitExceededException;

    // return book, throws error if book DNE or book already in inventory
    void returnBook(String isbn) throws BookNotFoundException, BookNotCheckedOutException;

    // reserve book for patron, throws error if book or patron DNE or book already reserved
    void reserveBook(String patronId, String isbn) throws PatronNotFoundException, BookNotFoundException, BookAlreadyReservedException;

    // return overdue loans
    List<Loan> getOverdueLoans();

    // return late fee, throws error if loan data invalid
    double calculateLateFee(Loan loan) throws InvalidLoanException;
}
