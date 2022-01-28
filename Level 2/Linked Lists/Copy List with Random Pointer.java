//Copy List with Random Pointer
//https://leetcode.com/problems/copy-list-with-random-pointer/
//Time --> O(N)
//With constant extra space 
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){ 
            return null;
        }
        Node curr = head;
        
        // Insert duplicate nodes in between
        while(curr != null){
            Node duplicate = new Node(curr.val);
            duplicate.next = curr.next;
            curr.next = duplicate;
            curr = duplicate.next;
        }
        
        Node original = head;
        while(original != null){
            Node randomNode = original.random;
            if(original.random != null) randomNode = randomNode.next;
            original.next.random = randomNode;
            original = original.next.next;
        }
        
        original = head;
        Node copyHead = head.next, tail = copyHead;
        while(original != null){
            Node duplicate = original.next; 
            original.next = original.next.next;
            if(duplicate.next != null)
            duplicate.next = duplicate.next.next;
            original = original.next;
        }
        return copyHead;
    }
}



// Time --> O(N)
// with extra space 
class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> hm = new HashMap<>();
        // Original Node -> Duplicate Node
        
        Node copyHead = new Node(-1);
        Node tail = copyHead;
        
        // Creation of Deep Copied Linked List
        Node original = head;
        while(original != null){
            Node duplicate = new Node(original.val);  
            tail.next = duplicate;
            tail = duplicate;
            
            hm.put(original, duplicate);
            original = original.next;
        }
        
        // Updating the Random Pointers
        original = head;
        while(original != null){
            Node randomNode = original.random;
            if(randomNode != null){
                randomNode = hm.get(randomNode);
            }
            
            hm.get(original).random = randomNode; 
            original = original.next;
        }
        
        return copyHead.next;
    }
}


/*138. Copy List with Random Pointer
Medium

A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.

Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.

For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.

Return the head of the copied linked list.

The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:

val: an integer representing Node.val
random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.
Your code will only be given the head of the original linked list.

 

Example 1:


Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
Example 2:


Input: head = [[1,1],[2,1]]
Output: [[1,1],[2,1]]
Example 3:



Input: head = [[3,null],[3,0],[3,null]]
Output: [[3,null],[3,0],[3,null]]
 

Constraints:

0 <= n <= 1000
-104 <= Node.val <= 104
Node.random is null or is pointing to some node in the linked list.*/

