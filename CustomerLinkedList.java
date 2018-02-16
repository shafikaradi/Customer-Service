

class CustomerLinkedList <T>{

  private static int sharedInstanceIncrementedVariable = 0;
  private int index;
  private T data;
  private CustomerLinkedList<T> pointer;
  private CustomerLinkedList<T> root;

  public CustomerLinkedList(){

    index = sharedInstanceIncrementedVariable;
    sharedInstanceIncrementedVariable++;
    pointer = null;
   
  }

  public CustomerLinkedList(T data, CustomerLinkedList customerLinkedList){

    this.data = data;
    this.pointer = customerLinkedList;
    index = sharedInstanceIncrementedVariable;
    sharedInstanceIncrementedVariable++;
   
  }

  public void addCustomer(T data, CustomerLinkedList pointer){

    this.data = data;
    this.pointer = pointer;

  } 

  public void setNextNode(CustomerLinkedList pointer){

     this.pointer = pointer;

  }

  public void findCustomer(int mobileNo){

     for(int i = 0 ; i <= sharedInstanceIncrementedVariable; i++){

        if(cutomers.getIndex(i).getMobileNo() == mobileNo){

            System.out.print("The Customer "+ cutomers.getIndex(i).getCustomerName() +" was found");
                return;
        }else{

        }

     }
      
     CustomerLinkedList<T> reference = root;
     while(reference != null){

      
     }
  }

  



}