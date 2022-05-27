//Find the Closest Element in BST 

//https://practice.geeksforgeeks.org/problems/find-the-closest-element-in-bst/1/

/* 
class Solution
{
    //Function to find the least absolute difference between any node
    //value of the BST and the given integer.
    static int minDiff(Node  root, int K) 
    { 
        // Write your code here
        int min = Integer.MAX_VALUE;
        
        while(root != null){
            if(root.data < K){
                min = Math.min(min, Math.abs(K - root.data));
                root = root.right;
            }
            else if(root.data > K){
                min = Math.min(min, Math.abs(root.data - K));
                root = root.left;
            }
            else{
                return 0;
            }
        }
        return min;
    } 
}
 */