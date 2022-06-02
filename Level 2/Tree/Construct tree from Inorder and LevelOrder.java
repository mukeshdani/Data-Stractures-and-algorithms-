//Construct tree from Inorder and LevelOrder
//https://practice.geeksforgeeks.org/problems/construct-tree-from-inorder-and-levelorder/1/


class GfG
{
    Node buildTree(int inord[], int level[])
    {
        //your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for( int i = 0 ; i< level.length ; i++){
            map.put(level[i],i);
        }
        Node root = helper(inord , map , 0 , inord.length -1 );
        return root;
    }
    
    public Node helper(int [] inord , HashMap<Integer,Integer> map, int lo , int hi){
        if(lo > hi)return null;
        
        int minidx = lo;
        for(int i = lo + 1; i<=hi ; i++){
            if(map.get(inord[i])<map.get(inord[minidx])){
                minidx = i;
            }
        }
        
        Node node = new Node (inord[minidx]);
        node.left = helper(inord , map , lo , minidx -1);
        node.right = helper(inord , map , minidx + 1 , hi);
        return node;
    }
    
   
}