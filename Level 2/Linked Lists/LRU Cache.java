//LRU Cache
//https://leetcode.com/problems/lru-cache/

//Very Imp.

class LRUCache {
    public static class Node{
        int key;
        int val;
        Node prev;
        Node next;
        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }
    
    int size = 0, capacity;
    Node head, tail;
    HashMap<Integer, Node> hm;
        
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
        size = 0;
        hm = new HashMap<>();
    }
    
    public int get(int key) {
        if(hm.containsKey(key) == false)
            return -1;
        
        Node curr = hm.get(key);
        
        // Remove At
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        
        // Add First
        curr.prev = head;
        curr.next = head.next;
        curr.prev.next = curr;
        curr.next.prev = curr;
        
        return curr.val;
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key) == false){
            // Insert
            Node curr = new Node(key, value);
            
            if(size == capacity){
                // Remove Last
                Node temp = tail.prev;
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                hm.remove(temp.key);
                
            } else size++;
            
            // Add First
            curr.prev = head;
            curr.next = head.next;
            curr.prev.next = curr;
            curr.next.prev = curr;
            hm.put(key, curr);
            
        } else {
            // Update
            Node curr = hm.get(key);
        
            // Remove At
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;

            // Add First
            curr.prev = head;
            curr.next = head.next;
            curr.prev.next = curr;
            curr.next.prev = curr;
            
            curr.val = value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */


/*146. LRU Cache
Medium

Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

Implement the LRUCache class:

LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
int get(int key) Return the value of the key if the key exists, otherwise return -1.
void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
The functions get and put must each run in O(1) average time complexity.

 

Example 1:

Input
["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
Output
[null, null, null, 1, null, -1, null, -1, 3, 4]

Explanation
LRUCache lRUCache = new LRUCache(2);
lRUCache.put(1, 1); // cache is {1=1}
lRUCache.put(2, 2); // cache is {1=1, 2=2}
lRUCache.get(1);    // return 1
lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
lRUCache.get(2);    // returns -1 (not found)
lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
lRUCache.get(1);    // return -1 (not found)
lRUCache.get(3);    // return 3
lRUCache.get(4);    // return 4
 

Constraints:

1 <= capacity <= 3000
0 <= key <= 104
0 <= value <= 105
At most 2 * 105 calls will be made to get and put.*/