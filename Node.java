class Node<T>{

    private Node next;
    private static Node root;
    private static Node memoryPositionHolder;
    private T item;


    public Node(){
     
    }

    public Node(T item){

      this.item = item;
     
    }
    public void setItem(Node nodeReference, T item){

      isRootNull();
      this.item = item;
      memoryPositionHolder = this;

    }

    public void setItem(T item){

        this.item = item;

  
      }

    public T getItem(){
        counter++;
        System.out.println(counter);
        return item;
      }

    private void isRootNull(){

        if(root == null){

            root = this;
          
          }else{
      
            memoryPositionHolder.next  = this;
          }

    }

    public void setNext(Node node){

        isRootNull();
        memoryPositionHolder = this;

    }

    public Node getNext(){

        return next;
    }


    public static Node getRoot(){

        return root;
    }


  }