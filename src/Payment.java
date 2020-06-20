public class Payment() {
    private String paymentItem;
    private double amount;
    private String paymentMethod;
    private String paymentDate;
    private String creditCardDetails;

    public Payment(String paymentItem, double amount, String paymentMethod, String paymentDate, String creditCardDetails) {
        this.paymentItem = paymentItem;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
        this.creditCardDetails = creditCardDetails;
    }
}