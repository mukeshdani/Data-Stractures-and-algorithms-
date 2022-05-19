//Bottom View of Binary Tree
//https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1

// { Driver Code Starts
//Initial Template for Java


//Contributed by Sudarshan Sharma
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references
 
    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}



class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	        Solution ob = new Solution();
			    ArrayList <Integer> res = ob.bottomView(root);
			    for (Integer num : res) System.out.print (num + " ");
		     	System.out.println();
	        }
	}
}

// } Driver Code Ends


//User function Template for Java



    class Solution
{
    
    static class Pair {
        Node node;
        int horiz = 0;
    }
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> bottomView(Node root)
    {
        // add your code
        ArrayList<Integer> retVal = new ArrayList<>();
        
        HashMap<Integer, Node> map = new HashMap<>();
        
        int lv = 0;
        int rv = 0;
        
        Queue<Pair> queue = new LinkedList<>();
        Pair p = new Pair();
        p.node = root;
        p.horiz = 0;
        
        queue.add(p);
        
        while(queue.size() > 0){
            Pair temp = queue.remove();
            
            if(temp.horiz < lv){
                lv = temp.horiz;
            }
            
            if(temp.horiz > rv){
                rv = temp.horiz;
            }
            
        
                map.put(temp.horiz, temp.node);
            
            
            if(temp.node.left != null){
                Pair lp = new Pair();
                lp.node = temp.node.left;
                lp.horiz = temp.horiz - 1;
                
                queue.add(lp);
            }
            
            if(temp.node.right != null){
                Pair rp = new Pair();
                rp.node = temp.node.right;
                rp.horiz = temp.horiz + 1;
                
                queue.add(rp);                
            }
        }
        
        for(int i = lv; i <= rv; i++){
            retVal.add(map.get(i).data);
        }
        
        return retVal;
    }
}
