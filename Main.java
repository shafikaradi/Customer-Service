 class Main{


 public static void main(String[] args) {

      Customer shafiq = new Customer("Shafiq", 916416709);
      Customer ahmed = new Customer("Ahmed", 913200296);
      Customer khaled = new Customer("Khaled",945521203);
      Customer hamza = new Customer("Hamza",92328299);
      Customer tareq = new Customer("Tareq",958477382);
      Customer abdulrahman = new Customer("Abdulrahman",928374654);
      Customer aymen = new Customer("Aymen",910283743);
      Customer fawzi = new Customer("Fawzi",938273924);
      Customer mahmoud = new Customer("Mahmoud",948573823);
      Customer muhammed = new Customer("Muhammed",918273742);





   /* Array<Customer> customerArray = new Array<>();

    customerArray.add(shafiq);
    customerArray.add(ahmed);
    customerArray.add(khaled);
    customerArray.add(hamza);
    customerArray.add(tareq);
    customerArray.add(abdulrahman);
    customerArray.add(aymen);
    customerArray.add(fawzi);
    customerArray.add(mahmoud);
    customerArray.add(muhammed);

    System.out.println("The phone number of "+customerArray.find(0).getCustomerName()+" is "+customerArray.find(0).getCustomerMobileNo()+", data was retrived from Array");*/
    HashTable <String,Customer> customerHashTable = new HashTable<>();

    customerHashTable.add("Shafiq", shafiq);
    customerHashTable.add("Ahmed",ahmed);
    customerHashTable.add("Khaled",khaled);
    customerHashTable.add("Hamza",hamza);
    customerHashTable.add("Tareq",tareq);
    customerHashTable.add("Abdulrahman",abdulrahman);
    customerHashTable.add("Aymen",aymen);
    customerHashTable.add("Fawzi",fawzi);
    customerHashTable.add("Mahmoud",mahmoud);
    customerHashTable.add("Muhammed",muhammed);

    System.out.println("The phone number of "+customerHashTable.find("Shafiq").getCustomerName()+" is "+customerHashTable.find("Shafiq").getCustomerMobileNo()+", data was retrived from HashTable");

   /* LinkedList <Customer> customerLinkedList = new LinkedList<>();

    customerLinkedList.add(shafiq);
    customerLinkedList.add(ahmed);
    customerLinkedList.add(khaled);
    customerLinkedList.add(hamza);
    customerLinkedList.add(tareq);
    customerLinkedList.add(abdulrahman);
    customerLinkedList.add(aymen);
    customerLinkedList.add(fawzi);
    customerLinkedList.add(mahmoud);
    customerLinkedList.add(muhammed);

    System.out.println("The phone number of "+customerLinkedList.find(ahmed).getCustomerName()+" is "+customerLinkedList.find(ahmed).getCustomerMobileNo()+", data was retrived from LinkedList");*/  
  }



}