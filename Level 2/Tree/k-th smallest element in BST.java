//k-th smallest element in BST
//geeksforgeeks.org/kth-smallest-element-in-bst-using-o1-extra-space/

class Solution {
    // Return the Kth smallest element in the given BST
    int ans ;
    int count ;
    public void inorder(Node root , int k){
        if(root == null)return ;
        inorder(root.left , k);
        count++;
        if(count==k){
            ans = root.data;
            return;
        }
        inorder(root.right , k);
    }
    public int KthSmallestElement(Node root, int K) {
        // Write your code here
       
        count = 0;
        ans =-1;
        inorder(root , K);
        return ans;
    }
}
