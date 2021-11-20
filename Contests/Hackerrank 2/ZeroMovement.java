

//Zero Movement
//Source Code

import java.io.*;
import java.util.*;

public class ZeroMovement{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        
        int [] nums = new int [n];
        
        for ( int k= 0 ; k<n;k++){
            nums[k]=scn.nextInt();
        }
        
        
    int i=0,j=1;
    
    while(j<nums.length){
        
        if(nums[i] != 0){
            i++;j++;
        }
        else if(nums[j]==0)
            j++;
        else{
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++; j++;
        }
    }
    
        for ( int m= 0 ; m<n;m++){
            System.out.print(nums[m]+" ");
        }
        
    
    }
}


/*

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Input Format

First line of each test case starts with an integer N denoting the size of the array nums.
Next line of input contains N space separated integers, where the ith integer denotes the value nums[i].
Constraints

1 <= nums.length <= 100
-1000 <= nums[i] <= 100
Output Format

For each test case, print the resultant array after moving all the zeros.
Sample Input 0

5
0 1 0 3 12
Sample Output 0

1 3 12 0 0
Explanation 0

Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]

*/