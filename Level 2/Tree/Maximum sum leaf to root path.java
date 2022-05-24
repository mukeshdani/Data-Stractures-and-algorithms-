//Maximum sum leaf to root path

//https://practice.geeksforgeeks.org/problems/maximum-sum-leaf-to-root-path/1/




//User function Template for Java
/* 
class Solution
{
    
    public static int maxPathSum(Node root)
    {
        //code here
        if(root == null)return 0;
        
        int left =maxPathSum(root.left);
        int right = maxPathSum(root.right);
        
        return root.data + Math.max(left , right);
    }
}
 */


 // Other Way to Solve this 

 
/* class Solution
{
    
    public static int maxPathSum(Node root)
    {
        //code here
      if(root.left != null && root.right != null){
          int left = maxPathSum(root.left);
          int right = maxPathSum(root.right);
          return root.data + Math.max(left , right);
      }else if(root.left!= null){
          int left = maxPathSum(root.left);
          return root.data + left;
      }else if(root.right != null){
            int right = maxPathSum(root.right);
          return root.data + right;
      }else {
          //leaf 
          return root.data;
      }
    }
} */