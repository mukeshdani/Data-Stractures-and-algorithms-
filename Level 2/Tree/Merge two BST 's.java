//Merge two BST 's
//https://practice.geeksforgeeks.org/problems/merge-two-bst-s/1#


class Solution
{
    //Function to return a list of integers denoting the node 
    //values of both the BST in a sorted order.
    
    public void inOrder(Node root , ArrayList<Integer> list){
        if(root == null)return ;
        
        inOrder(root.left , list);
        list.add(root.data);
        inOrder(root.right , list);
    }
    
    
    public List<Integer> merge(Node root1,Node root2)
    {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        if(root1== null&& root2 == null){
            return res;
        }
        
        ArrayList<Integer> n1 = new ArrayList<>();
         ArrayList<Integer> n2 = new ArrayList<>();
         
         inOrder(root1 , n1);
         inOrder(root2 , n2);
         
         int i = 0 ;
         int j = 0 ;
         
         while(i<n1.size() && j<n2.size()){
             
             if(n1.get(i)<n2.get(j)){
                 res.add(n1.get(i));
                 i++;
             }else if(n1.get(i)>n2.get(j)){
                 res.add(n2.get(j));
                 j++;
             }else {
                 res.add(n1.get(i));
                 res.add(n2.get(j));
                 i++;
                 j++;
             }
             
         }
         
         while(j<n2.size()){
             res.add(n2.get(j));
             j++;
         }
         while(i<n1.size()){
             res.add(n1.get(i));
             i++;
         }
        return res;
        
    }
}