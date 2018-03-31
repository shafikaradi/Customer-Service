import java.lang.Runnable;
import java.util.Random; 
 
 
 class Main{

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

 public static void main(String[] args) {


        Main mainObject = new Main();
        
       

        for(int i = 1; i <= 10; i++){
          mainObject.fillHashTable();
        }

    
  }

  public void fillArray(){
    Array<Customer> customerArray = new Array<>();
      



      for(int i =0 ; i < 1000; i++){
 
        Runnable runnable10 =  () -> {

          
          customerArray.add(muhammed);
            
        };
        
        new Thread(runnable10).start();
      }
    

   
  


        try{
          Thread.sleep(1000);
        }catch(Exception e){
        }finally{
    
        }

      System.out.println("The phone number of "+customerArray.find(9).getCustomerName()+" is "+customerArray.find(9).getCustomerMobileNo()+", data was retrived from Array");
      System.out.println("Number of items of Array is "+customerArray.count());
  }
 
  

  public void fillHashTable(){

    HashTable <String,Customer> customerHashTable = new HashTable<>();
 

    for(int i =0 ; i < 100; i++){
 
      Runnable runnable11 =  () -> {

        
          customerHashTable.add("Shafiq", shafiq);
          try{
            wait();
          }catch(Exception e){

          }
          
      };

      
      
      new Thread(runnable11).start();
    }

      Customer selectedCustomerFromHashTable = customerHashTable.find("Shafiq");

    

    

   
    try{
      Thread.sleep(1000);
      System.out.println("The phone number of "+selectedCustomerFromHashTable.getCustomerName()+" is "+selectedCustomerFromHashTable.getCustomerMobileNo()+", data was retrived from HashTable");
      System.out.println("Number of items of HashTable is "+customerHashTable.count());
    }catch(Exception e){
    }finally{

    }

  }

  public void fillLinkedList(){

    LinkedList <Customer> customerLinkedList = new LinkedList<>();
  

    for(int i =0 ; i < 100; i++){
 
      Runnable runnable21 =  () -> {

        
        customerLinkedList.add(muhammed);
          
      };
      
      new Thread(runnable21).start();
    }

    try{
      Thread.sleep(1000);
    }catch(Exception e){
    }finally{

    }

   Customer temp =  customerLinkedList.find(muhammed);
   System.out.println("The phone number of "+temp.getCustomerName()+" is "+temp.getCustomerMobileNo()+", data was retrived from LinkedList");
   System.out.println("Number of items of LinkedList is "+customerLinkedList.count());
  
  }


  public void fillBTree(){
     Random randdom = new Random(); 
     BTree customerTree = new BTree(3);
     
     Runnable runnable31 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50);
        customerTree.add(randomNumber);
  
      }
     };

     Runnable runnable32 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50) + 50;
        customerTree.add(randomNumber);
  
      }
     };

     Runnable runnable33 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50) + 100;
        customerTree.add(randomNumber);
  
       }
     };

     Runnable runnable34 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50) + 150;
        customerTree.add(randomNumber);
  
       }
     };

     Runnable runnable35 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50) + 200;
        customerTree.add(randomNumber);
  
       }
     };

     Runnable runnable36 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50) + 250;
        customerTree.add(randomNumber);
  
       }
     };

     Runnable runnable37 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50) + 300;
        customerTree.add(randomNumber);
  
       }
     };

     Runnable runnable38 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50) + 350;
        customerTree.add(randomNumber);
  
       }
     };

     Runnable runnable39 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50) + 400;
        customerTree.add(randomNumber);
  
       }
     };

     Runnable runnable40 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50) + 450;
        customerTree.add(randomNumber);
  
       }
     };

     Runnable runnable41 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50) + 500;
        customerTree.add(randomNumber);
  
       }
     };

     Runnable runnable42 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50) + 550;
        customerTree.add(randomNumber);
  
       }
     };

     Runnable runnable43 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50) + 600;
        customerTree.add(randomNumber);
  
       }
     };

     Runnable runnable44 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50) + 650;
        customerTree.add(randomNumber);
  
       }
     };

     Runnable runnable45 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50) + 700;
        customerTree.add(randomNumber);
  
       }
     };

     Runnable runnable46 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50) + 750;
        customerTree.add(randomNumber);
  
       }
     };

     Runnable runnable47 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50) + 800;
        customerTree.add(randomNumber);
  
       }
     };

     Runnable runnable48 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50) + 850;
        customerTree.add(randomNumber);
  
       }
     };

     Runnable runnable49 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50) + 900;
        customerTree.add(randomNumber);
  
       }
     };

     Runnable runnable50 = () -> {
      int randomNumber = 0;
      for(int i = 1; i <= 50; i++){

        randomNumber = randdom.nextInt(50) + 950;
        customerTree.add(randomNumber);
  
       }
     };

     Runnable runPrint4 = () -> {
      String result  = customerTree.get(55) != null ? "was found" : "not found";
      System.out.println(result);

     };
     new Thread(runnable31).start();
     new Thread(runnable32).start();
     new Thread(runnable33).start();
     new Thread(runnable34).start();
     new Thread(runnable35).start();
     new Thread(runnable36).start();
     new Thread(runnable37).start();
     new Thread(runnable38).start();
     new Thread(runnable39).start();
     new Thread(runnable40).start();
     new Thread(runnable41).start();
     new Thread(runnable42).start();
     new Thread(runnable43).start();
     new Thread(runnable44).start();
     new Thread(runnable45).start();
     new Thread(runnable46).start();
     new Thread(runnable47).start();
     new Thread(runnable48).start();
     new Thread(runnable49).start();
     new Thread(runnable50).start();
     new Thread(runPrint4).start();
     
     
  }


}
