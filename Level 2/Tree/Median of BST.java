//Median of BST
//https://practice.geeksforgeeks.org/problems/median-of-bst/1


class Tree
{
    public static void inOrder(Node root , ArrayList<Integer>list){
        if (root == null)return ;
        
        inOrder(root.left , list );
        list.add(root.data);
        inOrder(root.right , list);
    }
    public static float findMedian(Node root)
    {
        // code here.
        ArrayList<Integer> n1 = new ArrayList<>();
        
        inOrder(root , n1);
        
        int  n= n1.size();
        
        if(n%2==0){
            int a = n1.get(n1.size()/2);
            int b = n1.get((n1.size()/2) - 1);
            
            return (float)(a+b)/2;
            
        }else {
            return n1.get(n1.size()/2);
        }
    }
}