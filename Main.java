

public class Main{

 public static void main(String[] args) {

    Customer [] customers = {new Customer("Shafiq", 916416709),new Customer("Ahmed", 913200296) };
    //Array cService = new Array<Customer>(customers);
    HashTable htService = new HashTable<String,Integer>();
    // cService.addCustomerToArray(new Customer("Shafiq", 916416709));
    // cService.addCustomerToArray(new Customer("Ahmed", 913200296));
    //cService.find(916416709);
    htService.add("Shafiq", 916416709);
    htService.add("Ahmed", 913200296);


    System.out.println(htService.find("Shafiq"));

  
      
  }


}