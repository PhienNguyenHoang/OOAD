
public static void main() {
   List<Branch> branchList = new ArrayList<Branch>;
   List<Rental> rentalList = new ArrayList<Rental>;
   List<Customer> customerList = new ArrayList<Customer>;
   List<Model> modelList = new ArrayList<Model>;
   List<RentalGroupList> rentalGroupList = new ArrayList<RentalGroupList>;
   Branch branch1 = new Branch("1", "234 pasteur", "0999999999", branch2);
   Branch branch2 = new Branch("2", "123 pasteur", "0888888888", branch1);
   Rental rental1 = new Rental();
   Customer customer1 = new Customer("2344", "Phien", "0999438372", 34);
   Car car1 = new Car("#$554", "available", model1, rentalGroup1);
   RentalGroup rentalGroup1 = new RentalGroup("abc", "new group", "no one rent");
   Model model1 = new Model("123", "vinfast", "v8", "50km/1l");
   branchList.add(branch1);
   rentalList.add(rental1);
   rentalGroupList.add(rentalGroup1);
   customerList.add(customer1);
   modelList.add(model1);
   branch1.showBranch();
   customer1.showCustomer();   

   
   
}