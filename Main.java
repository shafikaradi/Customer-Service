 class Main{

 public static void main(String[] args) {

    //Customer [] customers = {new Customer("Shafiq", 916416709),new Customer("Ahmed", 913200296) };
    Array<Customer> cService = new Array<>();
    HashTable htService = new HashTable<String,Integer>();

    cService.add(new Customer("Shafiq", 916416709));
    cService.addByIndex(new Customer("Ahmed", 913200296),100);
   

     
     System.out.println(cService.find(0).getCustomerMobileNo());

    
  
      
  }


}