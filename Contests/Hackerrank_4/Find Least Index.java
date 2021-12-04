
import java.io.*;
import java.util.*;

public class Solution {
    
     public static int smallestEqual(int[] nums) {
      
        int result = -1;
        for(int i = 0; i < nums.length; i++) {
            if(i % 10 == nums[i]) {
                result = i;
                break;
            }
        }
        return result;
    
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn = new Scanner (System.in );
            int n = scn.nextInt();
        int []arr = new int [n];
        for ( int i = 0 ; i< n ;i++){
            arr[i]=scn.nextInt();
        }
        
     System.out.println(smallestEqual(arr));
    }
}




/*Given a 0-indexed integer array nums, return the smallest index i of nums such that i mod 10 == nums[i], or -1 if such index does not exist.

x mod y denotes the remainder when x is divided by y.

Input Format

First line takes an Integer N, size of array nums Next line takes elements of an array as nums1, nums2...

Constraints

1 <= nums.length <= 100
0 <= nums[i] <= 9
Output Format

Print a desired integer.

Sample Input 0

3
0 1 2
Sample Output 0

0
Explanation 0

i=0: 0 mod 10 = 0 == nums[0].
i=1: 1 mod 10 = 1 == nums[1].
i=2: 2 mod 10 = 2 == nums[2].
All indices have i mod 10 == nums[i], so we return the smallest index 0.

Sample Input 1

4
4 3 2 1
Sample Output 1

2
Explanation 1

i=0: 0 mod 10 = 0 != nums[0].
i=1: 1 mod 10 = 1 != nums[1].
i=2: 2 mod 10 = 2 == nums[2].
i=3: 3 mod 10 = 3 != nums[3]. 2 is the only index which has i mod 10 == nums[i].*/