package DSA.Lecture_10HashingHeap;
import java.util.*;

public class HashMapCreation {

    //This is the class which I will be using
    static class HashMap<K, V>{
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key=  key;
                this.value = value;
            }
        }

        private int n;//Nodes
        private int N;//Buckets
        private LinkedList<Node>[] bucket;

        public HashMap(){
            this.N = 4;
            this.bucket = new LinkedList[4];

            for(int i=0; i<4; i++){
                this.bucket[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int val = Math.abs(key.hashCode());
            return val%N;
        }
        private int searchInLL(K key, int ind){
            LinkedList<Node> ll = bucket[ind];

            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            //-1 means that node is not avail
            return -1;
        }
        private void reHash(){
            LinkedList<Node>[] oldBucket= bucket;
            bucket = new LinkedList[N*2];

            for(int i=0; i<oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0; j<ll.size(); j++){
                    Node linkedListNode = ll.get(j);
                    put(linkedListNode.key, linkedListNode.value);
                }
            }
        }
        public void put(K key, V value){
            int bi = hashFunction(key);
            int LLIndex = searchInLL(key, bi);
        
            
            //if node not available
            if(LLIndex==-1){
                bucket[bi].add(new Node(key, value));
                n++;
            }
            else{
               Node node =  bucket[bi].get(LLIndex);
               node.value = value;
            }
        
            double lambda = n/N;
            if(lambda>=2.0){
                reHash();
            }
        }
        
        public V get(K key){
            int bi = hashFunction(key);
            int llIndex = searchInLL(key, bi);

            if(llIndex==-1){
                return null;
            }
            else{
                return bucket[bi].get(llIndex).value;
            }
        }
    
        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int llIndex = searchInLL(key, bi);

            return llIndex!=-1;
        }

        public V remove(K key){
            int bi = hashFunction(key);
            int llIndex = searchInLL(key, bi);

            if(llIndex==-1){
                return null;
            }
            else{
                n--;
                return bucket[bi].remove(llIndex).value;
            }
        }
    }
}
