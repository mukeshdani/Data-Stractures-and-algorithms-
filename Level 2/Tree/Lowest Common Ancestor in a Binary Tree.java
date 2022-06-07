//Lowest Common Ancestor in a Binary Tree
//https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-binary-tree/1


//Using Recursion 

class Solution
{
    //Function to return the lowest common ancestor in a Binary Tree.
	Node lca(Node root, int n1,int n2)
	{
	// Your code here

         if(root==null){ return null;}
        
         if(root.data==n1||root.data==n2){return root;}
        
             Node leftLca=lca(root.left,n1,n2);
            
             Node rightLca=lca(root.right,n1,n2);
        
         if(leftLca!=null&&rightLca!=null){return root;}
        
         if(leftLca!=null){return leftLca;}
        
         else{return rightLca;}
	}
}