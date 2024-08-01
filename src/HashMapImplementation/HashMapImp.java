package HashMapImplementation;

import java.util.LinkedList;

public class HashMapImp {
    static class MyHashMap<K, V> {
        private static final int DEFAULT_CAPACITY = 4;
        private static final float DEFAULT_LOAD_FACTOR = 0.75f;
        private int n;
        private class Node<K, V> {
            private K key;
            private V value;
            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        } 
        private LinkedList<Node>[] buckets;

        private void intiBuckets(int N) {
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            return Math.abs(key.hashCode()) % buckets.length;
        }

        private int searchInBucket(LinkedList<Node> currBucket, K key) {
            for (int i = 0; i < currBucket.size(); i++) {
                if (currBucket.get(i).key == key) return i;
            }
            return -1;
        }

        public MyHashMap() {
            intiBuckets(DEFAULT_CAPACITY);
        }

        public int size() {
            return n;
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei == -1) {
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            } else {
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }

        }

        public V get(K key) {
            int bi = hashFunction(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei != -1) {
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            return null;
        }

        public V remove(K key) {

        }
    }

    public static void main(String[] args) {
        
    }
}