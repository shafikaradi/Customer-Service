
class Array<T>{

    private static final int fixedArraySize = 100;
    private int sharedInstanceIndex = 0;

    private T [] items = new T[fixedArraySize];

    public Array(T [] items){

        this.items = items;

    }

    public Array(){

    }

    //Add items in order
    public void add(T item){

     
        if(sharedInstanceIndex >= 0 && sharedInstanceIndex < 100){
            items[sharedInstanceIndex] = item;
            ++sharedInstanceIndex;
        }else{

            System.out.println("Out of range");

        }

        

    }

    //Add an item by specifying an index
    public void add(T item, int atIndex){


        if(atIndex < 0 && atIndex > fixedArraySize){

            items[atIndex] = item;

        }else{

            System.out.println("Out of range");
        }
        
        

    }

  //Find an item by its value
    public void find(Object value){

        for(int i = 0; i < fixedArraySize; i++){

            if(items[i] == null){

                if(sharedInstanceIndex >=0  && sharedInstanceIndex < 100){
                    continue;
                }else{
                    break;
                }
               

            }if(items[i].getCustomerMobileNo() == value){

                System.out.print("The Customer "+ items[i].getCustomerName() +" was found");
                //return new Object();
            }else{

                System.out.print("Nothing was found");
                //return new Object();
            }

        }

    }


    //Find a Customer by an index
    public void findCustomerByIndex(Object value, int atIndex){

        

            if(items[atIndex].getCustomerMobileNo() == value){

                System.out.print("The Customer "+ items[atIndex].getCustomerName() +" was found");
                return;
            }else{

                System.out.print("Nothing was found");
                return;
            }

        

    }




}