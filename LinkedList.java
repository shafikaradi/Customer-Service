

class LinkedList <T>{

  T item;
  private Node root;
  private Node node;

 


  public LinkedList(){

    //isRootEqualToNull();

  }
  
  public void add(Node node, T item){

    node.setItem(item);
    node.setNext(node);
  
   
  }

  public void add(Node node){

    this.node = node;

    

  }

  public Object find(Object item){


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