//Level Order Traversal
//

//Approach1 -> BFS
//Breadth First Search

//Time -> O(n)
//Space-> O(n)


import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class Solution {

    public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {

        ArrayList<Integer> output = new ArrayList<Integer>();

        //  If given tree is empty
        if (root == null) {
            return output;
        }

        //  To traverse level by level
        Queue<BinaryTreeNode> level = new LinkedList<>();

        //  Append root to the queue
        level.add(root);

        //  Iterater until queue does not become empty
        while (!level.isEmpty()) {

            //  Get the size of current level
            int levelSize = level.size();

            while (levelSize > 0) {
                levelSize--;

                //  Get the front node from queue
                BinaryTreeNode curr = level.poll();

                //  Store in output
                output.add(curr.val);

                //  Append left child into queue if it exist
                if (curr.left != null) {
                    level.add(curr.left);
                }

                //  Append right child into queue if it exist
                if (curr.right != null) {
                    level.add(curr.right);
                }

            }

        }

        //  Return the output
        return output;
    }

}