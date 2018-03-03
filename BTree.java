class BTree<E>{

  
   private static final int elements = 3;
   private Node root;
   private int t;
   
   public BTree(int t){

      this.t = t; 

   }

   public void add(int key){

    if (root == null)
    {
        // Allocate memory for root
        root = new Node(t, true);
        root.keys[0] = key;  // Insert key
        root.numberOfKeys = 1;  // Update number of keys in root
    }
    else // If tree is not empty
    {
        // If root is full, then tree grows in height
        if (root.numberOfKeys == 2*t-1)
        {
           
            Node s = new Node(t, false);
 
            // Make old root as child of new root
            s.child[0] = root;
 
            // Split the old root and move 1 key to the new root
            s.separateChild(0, root);
 
            // New root has two children now.  Decide which of the
            // two children is going to have new key
            int i = 0;
            if (s->keys[0] < k)
                i++;
            s.child[i].insertNonFull(k);
 
            // Change root
            root = s;
        }
        else  // If root is not full, call insertNonFull for root
            root->insertNonFull(k);
    }

        


   }

   public Node find(int key){

     if(root != null){

        return root.find(key);

      }else{

         return null;
      }


      return root;
   }


    private class Node{

       private int [] keys;
       private int t;
       private Node child [];
       private int numberOfKeys =  0;
       boolean isLeaf = true;

       public Node(int t, boolean isLeaf){

         keys = new int[elements - 1];
         child = new Node[elements];

          this.t = t;
          leaf = leaf1;
      
          
          keys = new int[2*t-1];
          child = new Node [2*t];
      

          numberOfKeys = 0;

       }

       public void addKeysToNode(int  key){

    

            for(int i = 0; i < keys.length; i++){

                if(keys.length == 0){
  
                  this.keys[0] = keys[0];
  
                }else{
  
                    this.swapKeys(keys, i);
                  
  
                }

                nonEmptyFields++;
  
  
            }

        

       }

       public void addNonFull(int key){

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

              newNode.child[j] = node.child[i+t];

            }
              
        }

         node.numberOfKeys = t - 1;

         for (int i = n; i >= index+1; i--){
          child[i+1] = child[j];
         }
           
 
   
          child[index+1] = newNode;
      
          // A key of y will move to this node. Find location of
          // new key and move all greater keys one space ahead
          for (int i = numberOfKeys-1; i >= i; i--){
            keys[i+1] = keys[i];
          }
             
      
          // Copy the middle key of y to this node
          keys[index] = node.keys[t-1];
      
          // Increment count of keys in this node
          numberOfKeys++;

       }

       public Node get(int key){

          int i = 0;

          while (i < numberOfKeys && key > keys[i])

            i++;
    
          if (keys[i] == key)
            return this;
    
          if (leaf == true)
            return null;
    
        
           return child[i].search(key);

       }

       
       

        
    }


}