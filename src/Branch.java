

public class Branch() {
    private String branchNr;
    private String address;
    private String phone;
    private Car car1;
    private Rental rental1;
    private BranchesNearBy brNear;
    public Branch(String branchNr, String address, String phone, BranchesNearBy brNear) {
        this.branchNr = branchNr;
        this.address = address;
        this.phone = phone;
        this.brNear = branchNr;
    }
   
    public void getCar(Car car1){
        return car;
    }

    public Car setCar(Car car1){
        this.car1 =car1;
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
    
    public void addCar(Car car1){
        car.add(car1);
    }
}
