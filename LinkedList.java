import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LinkedList <T>{

  private T item;
  private Node head;
  private Node tail;
  private Node node;
  private int counter = 0;
  private Lock lock = new ReentrantLock();


  
  public void add(T item){

 
   lock.lock();
 
      node = new Node(item);
      counter++;
      isHeadNull(node);
      isHeadNotNull(node);
    

    lock.unlock();
    
  }

   private void isHeadNull(Node node){

      if(head == null){

        head = node;
        tail = node;

      }
   }
  
   private void isHeadNotNull(Node node){
     
     if(head != null){
      
       tail.setNext(node);
       tail = node;

      } 

   }


  public T find(T item){


    Node temp = head;

      while(temp != null){
          
          if(temp.getItem().equals(item)){

            return item;

          }
        temp = temp.getNextNode();
      
      }
   return null;
    

  }

  public int count(){
    return this.counter;
  }

   class Node{

     private T item;
     private Node next;


      public Node(T item){

         this.item = item;
         
      }

      public void setItem(T item){

        this.item = item;

      }

      public void setNext(Node next){

        this.next = next;

      }

      public T getItem(){


         return item;

      }

      public Node getNextNode(){
      

        return next;

      }


    }


}