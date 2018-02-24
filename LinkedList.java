

class LinkedList <T>{

  private T item;
  private Node head;
  private Node tail;
  private Node node;


  
  public void add(T item){

    node = new Node(item);
    isHeadNull(item);
    isHeadNotNull(item);
  }

   private void isHeadNull(T item){

      if(head == null){

        head = node;
        tail = node;

      }
   }
  
   private void isHeadNotNull(T item){
     
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