

public class Branch() {
    private String branchNr;
    private String address;
    private String phone;
    private Car car1;
    private Rental rental1;

    public Branch(String branchNr, String address, String phone) {
        this.branchNr = branchNr;
        this.address = address;
        this.phone = phone;
    }
    List<Car> car = new ArrayList<Car>;
    car.add(car1);
    List<Rental> rental = new ArrayList<Rental>;
    rental.add(rental1);
    public void showBranch() {
        system.out.println("New Branch: ");
        system.out.println(this.branchNr);
        system.out.println(this.address);
        system.out.println(this.phone);
    }
}
