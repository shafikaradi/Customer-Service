
class HashTable<T,K>{

    private static final int hashTableSize = 100;
    

    private Object [] values;



    public HashTable(){

        values = new Object[hashTableSize];

    }


    public void add(T key, K value){

        HashLinkedList list;

       System.out.println(Math.abs(key.hashCode() % hashTableSize));
        if(values[Math.abs(key.hashCode() % hashTableSize)] == null){

            list = new HashLinkedList();
            list.add(key, value);
            values[Math.abs(key.hashCode() % hashTableSize)] = list;

        }else{

            list = (HashLinkedList) values[Math.abs(key.hashCode() % hashTableSize)];
            list.add(key, value);

        }

        list = null;
        
    }

    //find an item by a key

    public K find(T key){
        
        HashLinkedList list = (HashLinkedList) values[Math.abs(key.hashCode() % hashTableSize)];
        return  list.find(key);
    }

    public boolean doesValueExist(T key){

        if(values[Math.abs(key.hashCode() % hashTableSize)] == null){


            return false;

        }else{


            return true;
        }


    }

  



    private class HashLinkedList{

         
        private HashNode head;
        private HashNode tail;
        private HashNode node;
  
     
  
        public void add(T key, K value){

            node = new HashNode(key, value);
            isHeadNull(node);
            isHeadNotNull(node);
            node = null;
  
        }
  
        private void isHeadNull(HashNode node){

            if(head == null){

                head = node;
                tail = node;

            }
  
        }
  
        private void isHeadNotNull(HashNode node){
            if(head != null){

                tail.setNext(node);
                tail = node;

            }
        }
  
        private K find(T key){
  
          HashNode temp = head;
  
          while(temp != null){
  
            
            if(temp.getKey().equals(key)){
  
              return temp.getValue();
  
            }
  
            temp = temp.next;
  
          }

          return null;
  
        }
        
  
        private class HashNode{
          
          private T key;
          private K value;
          private HashNode next;
  
          public HashNode(T key, K value){
  
            this.key = key;
            this.value = value;
  
           }
  
           public void setNext(HashNode next){
  
             this.next = next;
  
           }
  
           public HashNode getNext(){
  
            return next;
  
          }
  
          public T getKey(){
  
            return key;
  
          }
  
          public K getValue(){
  
            return value;
  
          }
  
  
        }
  
  
      }
  
}