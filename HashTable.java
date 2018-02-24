
class HashTable<T,K>{

    private static final int hashTableSize = 100;
    

    private Object [] values;


    public HashTable(){

        values = new Object[hashTableSize];
    }


    public void add(T key, K value){

        values[Math.abs(key.hashCode() % hashTableSize)] = value;
        
    }

    //find an item by a key

    public K find(T key){

        return (K) values[Math.abs(key.hashCode() % hashTableSize)];
    }



}