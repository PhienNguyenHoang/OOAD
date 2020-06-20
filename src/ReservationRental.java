public class ReservationRental() {
    private String status;
    private String expectedPickupDate;
    private String expectedPickupTime;
    private String actualPickupDate;
    private String actualPickupTime;
    private double depositAmount;
    private double costLessAmount;

    public ReservationRental(String status, String expectedPickupDate, String expectedPickupTime,
     String actualPickupDate, String actualPickupTime, double depositAmount, double costLessAmount) {
        this.status = status;
        this.expectedPickupDate = expectedPickupDate;
        this.expectedPickupTime = expectedPickupTime;
        this.actualPickupTime = actualPickupTime;
        this.actualPickupDate = actualPickupDate;
        this.depositAmount = depositAmount;
        this.costLessAmount = costLessAmount;
    }
}