
class HashTable<T,K>{

    private static final int fixedHashTableSize = 100;
    private int instanceIndex = 0;
    private Object [] keys;
    private Object [] values;


    public HashTable(){

        keys =  new Object[fixedHashTableSize];
        values = new Object[fixedHashTableSize];
    }

    @SuppressWarnings("unchecked")
    public void add(T key, K value){

        if(instanceIndex <= 99){

           keys[instanceIndex] = key;
           values[instanceIndex] = value;
            ++instanceIndex;

        }else{

            System.out.println("Out of range");

        }
    }

    //find an item by a key
    @SuppressWarnings("unchecked")

    public K find(T key){

        for(int index = 0; index < fixedHashTableSize; index++){
          
            if(((T) keys[index]).equals(key)){

                return (K)values[index];
            }

        }
 
        return null;
    }






}