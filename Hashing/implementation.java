package Hashing;

// import java.util.*;

// import LinkedList.LinkedList;

// public class implementation {
//     static class HashMap<k,V>{ //generic
//        private class Node{
//         K key;
//         V value;
//        }

//        public Node( K key, V value){
//         this.key=key;
//         this.value=value;
//        }
//     }

//     private int n;
//     private  int N;

//     private LinkedList<Node> buckets[];

//     @SuppressWarnings("unchecked");
//     public HashMap(){
//         this.n=4;
//         this.buckets=new LinkedList[4];
//         for(int i=0;i<4;i++){
//             this.buckets[i]=new LinkedList<>();
//         }
//     }

//     private int hashFunction( K Key){
//         int hc=key.hashCode();
//         return Math.abs(hc)% buckets.length;
//     }

//     private int searchInLL(K key, int bi){
//         LinkedList<Node> ll= buckets[bi];
//         int di=0; 

//         for(int i=0;i<ll.n();i++){
//             Node node=ll.get(i);
//             if(node.key==key){
//                 return di;
//             }
//             di++;
//         }

//         return -1;
//     }

//     public void put(K key , V value){
//         int bi=hashFunction(key);// 0 to size -1
//         int di=searchInLL(key);

//         if(di!=-1){
//             Node node=buckets[bi].get(di);
//             node.value=value;
//         }else{
//             buckets[bi].add(new Node(key,value));
//             size++;
//         }

//         int lam
//     }

//     public static void main(String[] args) {
        
//     }
    
}
