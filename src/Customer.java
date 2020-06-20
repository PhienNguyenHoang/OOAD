public class Customer() {
    private String driverLicenseNr;
    private String name;
    private String phone;
    private int discount;

    public Customer(String driverLicenseNr, String name, String phone, int discount) {
        this.driverLicenseNr = driverLicenseNr;
        this.name = name;
        this.phone = phone;
        this.discount = discount;
    }
    public void showCustomer() {
        System.out.println("Customer: ");
        System.out.println("license: ", this.driverLicenseNr);
        System.out.println("name: ", this.name);
        System.out.println("phone: ", this.phone);
        System.out.println("discount in dollars: ", this.discount);

    }
}