//Clone Graph
//https://leetcode.com/problems/clone-graph/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/
/* 
class Solution {
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        
        HashMap<Integer, Node> visited = new HashMap<>();
        return helper(node, visited);
    }
    
    public Node helper(Node node, HashMap<Integer, Node> visited){
        Node clone = new Node(node.val);
        visited.put(node.val, clone);
        
        for(Node nbr: node.neighbors){
            Node nbrClone = null;
            
            if(visited.containsKey(nbr.val) == false){
                nbrClone = helper(nbr, visited);
            } else {
                nbrClone = visited.get(nbr.val);
            }
            
            clone.neighbors.add(nbrClone);
        }
        
        
        return clone;
    }
} */