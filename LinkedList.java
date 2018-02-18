

class LinkedList <T>{

  Object item;
  private Node root;
  private Node node;


  
  public void add(Node node, T item){

    node.setItem(item);
    node.setNext(node);
  
   
  }


  public T find(T item){


    Node temp = Node.getRoot();

    while(temp != null){
       
      if(temp.getItem().equals(item)){

        return item;

      }
    temp = temp.getNext();
  
  }
   return null;
    

  }




}