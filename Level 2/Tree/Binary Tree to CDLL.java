//Binary Tree to CDLL
//https://practice.geeksforgeeks.org/problems/binary-tree-to-cdll/1/

//First Approach 
class Solution
{ 
    Node start;
    Node prev;
    private void helper(Node root)
    {
        if(root==null)
        return;
        helper(root.left);
        //
        if(prev==null)
        {
            start=root;
        }
        else
        {
            prev.right=root;
            root.left=prev;
        }
        prev=root;
        helper(root.right);
    }
    //Function to convert binary tree into circular doubly linked list.
    Node bTreeToClist(Node root)
    {
        //your code here
        helper(root);
        Node last=prev;
        last.right=start;
        start.left=last;
        return start;
    }
    
}
    
