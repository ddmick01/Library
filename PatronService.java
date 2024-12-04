import java.util.*;
public interface PatronService {
    // add a new patron to system, throws error if patron data is invalid or if patron already exists
    Patron registerPatron(Patron patron) throws InvalidPatronDataException, DuplicatePatronException;

    // update patron data, throws error if patron DNE or if new patron data is invalid
    void updatePatron(Patron patron) throws PatronNotFoundException, InvalidPatronDataException;

    // returns patron information, throws error if patron DNE
    Patron getPatron(String patronId) throws PatronNotFoundException;
}