//Container With Most Water



class Solution {
    public int maxArea(int[] height) {
        int max = 0; // holds current maximum volume
        int left = 0, right = height.length-1; // holds pointers to the two ends of our water container
        while(left < right)
        {
           int minHeight = 0;
           if(height[left]<height[right])
           {
               minHeight = height[left]; 
               max = Math.max(minHeight*(right-left), max);
               left++;
           }
           else
           {
               minHeight = height[right];
               max = Math.max(minHeight*(right-left), max);
               right--;
           }
        }
        return max;
    }
}


/*
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

Notice that you may not slant the container.

 

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
Example 3:

Input: height = [4,3,2,1,4]
Output: 16
Example 4:

Input: height = [1,2,1]
Output: 2
 

Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104

*/