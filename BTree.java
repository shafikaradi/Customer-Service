import java.lang.reflect.Array;


class BTree{

  
  
   private Node root;
   private int t;
   
   public BTree(int t){

      this.t = t; 

   }

   public void add(int key){

    if (root == null){
      
        root = new Node(t, true);
        root.keys[0] = key;  
        root.numberOfKeys = 1; 

    }else{
     
        if (root.numberOfKeys == 2*t-1) {
           
            Node s = new Node(t, false);
 
         
            s.child[0] = root;
 
            s.split(0, root);
 
            int i = 0;
            if (s.keys[0] < key)
                i++;
            s.child[i].addNonFull(key);
 
     
            root = s;
        }else{
          root.addNonFull(key);
        }
      }  
    }

    public Node get(int key){

      if(root == null){

        return null;

      }else{

        return root.get(key);
      }

    }

    private class Node{

       private int [] keys;
       private int t;
       private Node [] child;
       private int numberOfKeys =  0;
       private boolean isLeaf = true;

       public Node(int t, boolean isLeaf){

       
          this.t = t;
          this.isLeaf = isLeaf;
      
          
          keys = new int[2*t-1];
          child = new Node[2*t];
    
          numberOfKeys = 0;

       }

       

       public void addNonFull(int key){


        int index = numberOfKeys - 1;

              if (isLeaf == true){
              
              while (index >= 0 && keys[index] > key)
              {
                  keys[index+1] = keys[index];
                  index--;
              }
      
              keys[index+1] = key;
              numberOfKeys = numberOfKeys+1;
          } else  {
              
              while (index >= 0 && keys[index] > key)
              index--;
      
              if (child[index+1].numberOfKeys == 2*t-1) {
           
                   split(index+1, child[index+1]);
      
                  
                  if (keys[index+1] < key)
                      index++;
              }
              child[index+1].addNonFull(key);
          }

       }

       public void split(int index, Node node){

        Node newNode = new Node(node.t, node.isLeaf);
        newNode.numberOfKeys = t - 1;

        for (int i = 0; i < t-1; i++){
          newNode.keys[i] = node.keys[i+t];
        }
        
 
   
        if (node.isLeaf == false)
        {
            for (int i = 0; i < t; i++){

              newNode.child[i] = node.child[i+t];

            }
              
        }

         node.numberOfKeys = t - 1;

         for (int i = numberOfKeys; i >= index+1; i--){
          child[i+1] = child[i];
         }
           
 
   
          child[index+1] = newNode;
      

          for (int i = numberOfKeys - 1; i >= index; i--){
             keys[i+1] = keys[i];
          }
             
      

          keys[index] = node.keys[t-1];
      
     
          numberOfKeys++;

       }

       public Node get(int key){

          int index = 0;

          while (index < numberOfKeys && key > keys[index])

          index++;
    
          if (keys[index] == key)
            return this;
    
          if (isLeaf == true)
            return null;
    
        
           return child[index].get(key);

       }

       
       

        
    }


}