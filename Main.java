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
        mainObject.fillArray();
        /*mainObject.fillHashTable();
        mainObject.fillBTree();
        mainObject.fillLinkedList();*/

    
  }

  public void fillArray(){
    Array<Customer> customerArray = new Array<>();
      

    Runnable runnable1 = () -> {

      customerArray.add(shafiq);
        
    };

    Runnable runnable2 = () -> {
 
      customerArray.add(ahmed);
        
    };

    Runnable runnable3 = () -> {

      customerArray.add(khaled);
    
    };

    Runnable runnable4 = () -> {
     
      customerArray.add(hamza);
                  
    };

    Runnable runnable5 = () -> {
    
      customerArray.add(tareq);
        
    };

    Runnable runnable6 = () -> {
    
      customerArray.add(abdulrahman);
        
    };

    Runnable runnable7 = () -> {
      customerArray.add(aymen);
    };

    Runnable runnable8 = () -> {

      customerArray.add(fawzi);
        
    };

    Runnable runnable9= () -> {

          
      customerArray.add(mahmoud);
      
        
    };

    Runnable runnable10 =  () -> {

          
      customerArray.add(muhammed);
        
    };


      
    

   

        new Thread(runnable1).start();
        new Thread(runnable2).start();
        new Thread(runnable3).start();
        new Thread(runnable4).start();
        new Thread(runnable5).start();
        new Thread(runnable6).start();
        new Thread(runnable7).start();
        new Thread(runnable8).start();
        new Thread(runnable9).start();
        new Thread(runnable10).start();
  


        try{
          Thread.sleep(1000);
        }catch(Exception e){
        }finally{
    
        }

      System.out.println("The phone number of "+customerArray.find(2).getCustomerName()+" is "+customerArray.find(2).getCustomerMobileNo()+", data was retrived from Array");
      System.out.println("Number of items of Array is "+customerArray.count());
  }
 
  

  public void fillHashTable(){

    HashTable <String,Customer> customerHashTable = new HashTable<>();
    Runnable runable11 = () -> {
    customerHashTable.add("Shafiq", shafiq);
    };

    Runnable runable12 = () -> {
    customerHashTable.add("Ahmed",ahmed);
    };

    Runnable runable13 = () -> {
    customerHashTable.add("Khaled",khaled);
    };

    Runnable runable14 = () -> {
    customerHashTable.add("Hamza",hamza);
    };

    Runnable runable15 = () -> {
    customerHashTable.add("Tareq",tareq);
    };

    Runnable runable16 = () -> {
    customerHashTable.add("Abdulrahman",abdulrahman);
    };
    Runnable runable17 = () -> {
    customerHashTable.add("Aymen",aymen);
    };

    Runnable runable18 = () -> {
    customerHashTable.add("Fawzi",fawzi);
    };

    Runnable runable19 = () -> {
    customerHashTable.add("Mahmoud",mahmoud);
    };
    Runnable runable20 = () -> {
    customerHashTable.add("Muhammed",muhammed);
    };

    Runnable runPrint2 = () -> {
      Customer selectedCustomerFromHashTable = customerHashTable.find("Abdulrahman");
      System.out.println("The phone number of "+selectedCustomerFromHashTable.getCustomerName()+" is "+selectedCustomerFromHashTable.getCustomerMobileNo()+", data was retrived from HashTable");
    };


    
    new Thread(runable11).start();
    new Thread(runable12).start();
    new Thread(runable13).start();
    new Thread(runable14).start();
    new Thread(runable15).start();
    new Thread(runable16).start();
    new Thread(runable17).start();
    new Thread(runable18).start();
    new Thread(runable19).start();
    new Thread(runable20).start();
    new Thread(runPrint2).start();

  }

  public void fillLinkedList(){

    LinkedList <Customer> customerLinkedList = new LinkedList<>();
    Runnable runable21 = () -> {
    customerLinkedList.add(shafiq);
    };
     

    Runnable runable22 = () -> {
    customerLinkedList.add(ahmed);
    };


    Runnable runable23 = () -> {
    customerLinkedList.add(khaled);
    };

    Runnable runable24 = () -> {
    customerLinkedList.add(hamza);
    };

    Runnable runable25 = () -> {
    customerLinkedList.add(tareq);
    };

    Runnable runable26 = () -> {
    customerLinkedList.add(abdulrahman);
    };

    Runnable runable27 = () -> {
    customerLinkedList.add(aymen);
    };

    Runnable runable28 = () -> {
    customerLinkedList.add(fawzi);
    };

    Runnable runable29 = () -> {
    customerLinkedList.add(mahmoud);
    };

    Runnable runable30 = () -> {
    customerLinkedList.add(muhammed);
    };

    Runnable runPrint3 = () -> {
    Customer selectedCustomerFromLinkedList = customerLinkedList.find(aymen);
    System.out.println("The phone number of "+selectedCustomerFromLinkedList.getCustomerName()+" is "+selectedCustomerFromLinkedList.getCustomerMobileNo()+", data was retrived from LinkedList"); 
    };

    new Thread(runable21).start();
    new Thread(runable22).start();
    new Thread(runable23).start();
    new Thread(runable24).start();
    new Thread(runable25).start();
    new Thread(runable26).start();
    new Thread(runable27).start();
    new Thread(runable28).start();
    new Thread(runable29).start();
    new Thread(runable30).start();
    new Thread(runPrint3).start();
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
