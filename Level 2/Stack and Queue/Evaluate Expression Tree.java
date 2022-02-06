//Evaluate Expression Tree
//https://www.codingninjas.com/codestudio/problems/evaluate-expression-tree_975484?leftPanelTab=0


/*******************************************************
    Following is the BinaryTreeNode class structure

    class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;
	
	    public BinaryTreeNode(T data) {
		    this.data = data;
	    }
    }
*******************************************************/
public class Solution 
{
	public static int evaluateExpression(BinaryTreeNode<String> root) 
	{
		//WRITE YOUR CODE HERE
        
        if(root.left == null && root.right == null){
            return Integer.parseInt(root.data);
        }
        
        int left = evaluateExpression(root.left);
        int right = evaluateExpression(root.right);
        
        if(root.data.equals("+"))return left + right ;
        if(root.data.equals("-"))return left - right ;
        if(root.data.equals("*"))return left * right ;
        return left / right ;
	}
}