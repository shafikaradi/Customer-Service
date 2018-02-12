class Main{

 public static void main(String[] args) {

    System.out.println("Hello world");
    Customer [] customers = {new Customer("Shafiq", 916416709),new Customer("Ahmed", 913200296) };
    CustomerService cService = new CustomerService(customers);
    // cService.addCustomerToArray(new Customer("Shafiq", 916416709));
    // cService.addCustomerToArray(new Customer("Ahmed", 913200296));
    cService.findCustomerMobileNoInArray(916416709);
      
  }


}