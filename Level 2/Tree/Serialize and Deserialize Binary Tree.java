//Serialize and Deserialize Binary Tree
//https://leetcode.com/problems/serialize-and-deserialize-binary-tree/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    class Pair {
        TreeNode node ;
        int state = 0;
        
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
       
        if(root == null) return "";
        
        StringBuilder sb  = new StringBuilder();
        helper(root , sb);
        return sb.toString();
    }
    
    public void helper(TreeNode root , StringBuilder sb){
        if(root == null){
            sb.append(".");
            sb.append(" ");
            return ;
        }
        
        sb.append(root.val);
        sb.append(" ");
        helper(root.left , sb);
        helper(root.right , sb );
        
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
        if(data.length() == 0){
            return null;
        }
        String[] darray = data.split(" ");
        
        Stack<Pair> st = new Stack<>();
        Pair rootp = new Pair();
        rootp.node = new TreeNode(Integer.parseInt(darray[0]));
        st.push(rootp);
        
        int idx  = 0 ;
        while(st.size() > 0){
            Pair pair = st.peek();
            if(pair.state == 0 ){
                idx++;
                pair.state++;
                
                if(darray[idx].equals(".") == false){
                    Pair leftp = new Pair();
                    leftp.node = new TreeNode(Integer.parseInt(darray[idx]));
                    pair.node.left = leftp.node;
                    
                    st.push(leftp);
                }
            }else if(pair.state == 1){
                idx++;
                pair.state++;
                
                if(darray[idx].equals(".") == false){
                    Pair rpair = new Pair();
                    rpair.node = new TreeNode(Integer.parseInt(darray[idx]));
                    pair.node.right = rpair.node;
                    
                    st.push(rpair);
                }
            }else{
                st.pop();
            }
        }
        return rootp.node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));














