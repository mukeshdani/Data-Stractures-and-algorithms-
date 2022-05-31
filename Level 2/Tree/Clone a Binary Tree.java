//Clone a Binary Tree

//https://practice.geeksforgeeks.org/problems/clone-a-binary-tree/1/

class Solution{
    public Tree cloneTree(Tree tree){
       // add code here.
       createDuplicate(tree);
       SetDuplicate(tree);
       Tree dup = removeDuplicate(tree);
       return dup;
     }
     
     public void createDuplicate(Tree node){
         if(node == null)return ;
         createDuplicate(node.left);
         createDuplicate(node.right);
         
         Tree duplicate = new Tree(node.data);
         
         duplicate.left = node.left;
         duplicate.right = null;
         node.left = duplicate;
         
     }
     public void SetDuplicate(Tree orig){
          if(orig == null)return ;
          
          SetDuplicate(orig.left.left);
          
          SetDuplicate(orig.right);
          
          if(orig.random != null){
              orig.left.random = orig.random.left;
          }
     }
     
     public Tree removeDuplicate(Tree node){
          if(node == null)return null;
          
          Tree leftDup = removeDuplicate(node.left.left);
          Tree rightDup = removeDuplicate(node.right);
          
          Tree dup = node.left;
          node.left = node.left.left;
          dup.left = leftDup;
          dup.right = rightDup;
          return dup;
     }
}