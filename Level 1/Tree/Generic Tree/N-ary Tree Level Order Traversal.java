//N-ary Tree Level Order Traversal
//https://leetcode.com/problems/n-ary-tree-level-order-traversal/




/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        if(root == null){
            return new ArrayList();
        }
    List<List<Integer>> res = new LinkedList();
    
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(q.size() != 0 ){
            int size = q.size();
            List<Integer> currLevel = new ArrayList();
            while(size-->0){
            Node rnode = q.remove();
                currLevel.add(rnode.val);
                for(Node child : rnode.children)
                    q.add(child);
            }            
           res.add(currLevel);
        }
        
    return res;
}

}
