import java.util.*;
public interface NotificationService {
    // remind patron of due date for return of a book, throws error if patron DNE or if patron will not be notified
    void sendDueReminder(String patronId, String bookTitle) throws PatronNotFoundException, NotificationFailedException;

    // notify patron that book is available, throws error if patron DNE or if patron will not be notified
    void sendBookAvailable(String patronId, String bookTitle) throws PatronNotFoundException, NotificationFailedException;
}