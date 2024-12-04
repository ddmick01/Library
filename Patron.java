public class Patron {
    // patron data
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String status;
    private boolean borrowingPrivilege;

    // constructor
    public Patron(String id, String name, String email, String phoneNumber, String status, boolean borrowingPrivilege) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.borrowingPrivilege = borrowingPrivilege;
    }

    // getter setter methods
    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public boolean getBorrowingPrivilege() { return borrowingPrivilege; }
    public void setBorrowingPrivilege(boolean borrowingPrivilege) { this.borrowingPrivilege = borrowingPrivilege; }

    // toString for patrons
    @Override
    public String toString() {
        return "Patron{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", status=" + status +
                ", borrowingPrivilege=" + borrowingPrivilege +
                '}';
    }
}