import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Array<T>{

    private static final int fixedArraySize = 1000;
    private int instanceIndex = 0;

    private Object [] items;
    private Lock lock = new ReentrantLock();

    

    public Array(){

        items = new Object[fixedArraySize];
        

    }

    public void add(T item){

        try{
            Thread.sleep(50);
          }catch(Exception e){
          }finally{
      
          }
          lock.lock();   
        if(instanceIndex <= 999){

            items[instanceIndex] = item;
             instanceIndex = instanceIndex + 1;
 
         }else{
 
             System.out.println("Out of range");
          
         }

   
         lock.unlock();
     
    }

   public  void addByIndex(T item, int index){

        if(index <= 999){

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
 
       return instanceIndex;
    }


    

 




}