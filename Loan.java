import java.time.*;
public class Loan {
    // loan data
    private String id;
    private String patronId;
    private String bookIsbn;
    private LocalDate checkoutDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

    //constructor
    public Loan(String id, String patronId, String bookIsbn, LocalDate checkoutDate, LocalDate dueDate) {
        this.id = id;
        this.patronId = patronId;
        this.bookIsbn = bookIsbn;
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
        this.returnDate = null;
    }

    // getter setter methods
    public String getId() { return id; }
    public String getPatronId() { return patronId; }
    public String getBookIsbn() { return bookIsbn; }
    public LocalDate getCheckoutDate() { return checkoutDate; }
    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
    public LocalDate getReturnDate() { return returnDate; }
    public void setReturnDate(LocalDate returnDate) { this.returnDate = returnDate; }

    // check if loan overdue
    public boolean isOverdue() {
        return LocalDate.now().isAfter(dueDate) && returnDate == null;
    }

    // toString for loans
    @Override
    public String toString() {
        return "Loan{" +
                "id='" + id + '\'' +
                ", patronId='" + patronId + '\'' +
                ", bookIsbn='" + bookIsbn + '\'' +
                ", checkoutDate=" + checkoutDate +
                ", dueDate=" + dueDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
