//Populating Next Right Pointers in Each Node
//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/


/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
/* 
class Solution {
    public Node connect(Node root) {
     Node p1 = root ;
        while(p1 != null){
            Node p2  = p1 ;
            while(p2 != null){
                if(p2.left!= null){
                    p2.left.next = p2.right;
                }
                
                if(p2.right!= null && p2.next!= null){
                    p2.right.next = p2.next.left;
                }
                p2 = p2.next;
            }
            p1 = p1.left;
        }
        return root;
    }
} */