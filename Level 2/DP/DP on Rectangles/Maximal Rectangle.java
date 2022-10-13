//https://leetcode.com/problems/maximal-rectangle/

import java.util.*;
class Solution {
    public int largestRectangleArea(int[] heights) {
         int n = heights.length;
         Stack<Integer> st = new Stack<>();
         int maxArea = Integer.MIN_VALUE;
         for(int i = 0  ; i<= n ; i++){
             while(!st.empty() && (i==n || heights[st.peek()] >= heights[i])){
                 int height = heights[st.peek()];
                 st.pop();
                 int weight;
                 if(st.empty())weight = i;
                 else weight = i - st.peek() - 1;
                 maxArea = Math.max(maxArea , height * weight);
             }
             st.push(i);
         }
         
         return maxArea;
     }
     public int maximalRectangle(char[][] matrix) {
         int maxArea = 0;
         int n = matrix.length;
         int m = matrix[0].length;
         int [] arr = new int [m];
         for(int i = 0 ; i<n ; i++){
             for(int j = 0 ; j<m ; j++){
                 if(matrix[i][j] == '1')arr[j]++;
                 else arr[j] = 0 ;
             }
             int area = largestRectangleArea(arr);
             maxArea = Math.max(maxArea , area);
         }
         return maxArea;
     }
 }