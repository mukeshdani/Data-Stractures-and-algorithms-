//135. Candy
//https://leetcode.com/problems/candy/





class Solution {
    public int candy(int[] ratings) {
        
        int [] left = new int[ratings.length];
        int [] right = new int[ratings.length];
        
        left[0]=1;
        
        for ( int i = 1; i<ratings.length ; i++){
            if (ratings[i]>ratings[i-1]){
                left[i]=left[i-1]+1;
            }else {
                left[i] = 1;
            }
        }
        
        right[ratings.length-1]=1;
        for ( int i = ratings.length-2 ; i>=0 ; i--){
            if ( ratings[i] >ratings[i+1]){
                right[i] = right[i+1]+1;
            }else {
                right[i] = 1;
            }
        }
        
        int sum = 0 ;
        for ( int i = 0 ; i < ratings.length ; i++){
            sum+= Math.max(left[i],right[i]);
        }
        return sum;
        
      /* if (ratings == null || ratings.length == 0) return 0;
  
  int n = ratings.length;
  
  // a[i] stores the num of candies of i-th kid
  int[] a = new int[n]; a[0] = 1;
  
  // left to right
  for (int i = 1; i < n; i++)
    a[i] = (ratings[i] > ratings[i - 1]) ? a[i - 1] + 1 : 1;
  
  // right to left
  int sum = a[n - 1];
  
  for (int i = n - 2; i >= 0; i--) {
    if (ratings[i] > ratings[i + 1])
      a[i] = Math.max(a[i], a[i + 1] + 1);
        
    sum += a[i];
  }
  
  return sum;*/  
    }
}
/*There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute the candies to the children.

 

Example 1:

Input: ratings = [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
Example 2:

Input: ratings = [1,2,2]
Output: 4
Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
The third child gets 1 candy because it satisfies the above two conditions.
 

Constraints:

n == ratings.length
1 <= n <= 2 * 104
0 <= ratings[i] <= 2 * 104*/
