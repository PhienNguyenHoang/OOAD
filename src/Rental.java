
public class Rental() {
    private String rentalNr;
    private String creationDate;
    private String expectedReturnDate;
    private String expectedReturnTime;
    private String actualReturnDate;
    private String actualReturnTime;
    private String notes;
    private Branch branch;
    
    public Rental(String rentalNr, String creationDate, String expectedReturnDate,
     String expectedReturnTime, String actualReturnDate, String actualReturnTime, String notes, Branch branch) {
        this.rentalNr = rentalNr;
        this.creationDate = creationDate;
        this.expectedReturnDate = expectedReturnDate;
        this.expectedReturnTime = expectedReturnTime;
        this.actualReturnDate = actualReturnDate;
        this.actualReturnTime = actualReturnTime;
        this.notes = notes;
        this branch = branch;
    }
}