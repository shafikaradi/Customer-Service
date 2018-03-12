
class Array<T>{

    private static final int fixedArraySize = 100;
    private int instanceIndex = 0;

    private Object [] items;

    

    public Array(){

        items = new Object[fixedArraySize];

    }

    public void add(T item){

        if(instanceIndex <= 99){

            items[instanceIndex] = item;
             ++instanceIndex;
 
         }else{
 
             System.out.println("Out of range");
 
         }


    }

   public  void addByIndex(T item, int index){

        if(index <= 99){

            items[index] = item;
    
        }else{

            System.out.println("Out of range");

        }

   }

    public T find(int index){

        if(index < fixedArraySize && index >= 0 ){

            return (T) items[index];

        }


        return null;
    }

    public int count(){
 
        int counter = 0;
        for(int i =0; i < items.length; i++){
          
            if(items[i] != null){

                counter++;
            }

        }
       return counter;
    }


 




}