//Reversing Queue
//https://www.codingninjas.com/codestudio/problems/reversing-queue_1170046?leftPanelTab=0


import java.util.Queue;

public class Solution {
    public static void reverse(Queue < Integer > q) {
        // Write your code here.
        if ( q.size() == 0 ){
            return ;
        }
        int val = q.remove();
        reverse(q);
            q.add(val);
    }
}