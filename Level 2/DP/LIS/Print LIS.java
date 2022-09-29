
import java.util.*;
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length ;
        int [] dp = new int [n];
        Arrays.fill(dp,1);
        int [] hash = new int [n];
        Arrays.fill(hash,1);
        
        for(int i = 0 ; i<n ; i++){
            hash[i] = i;
            for(int prev = 0 ; prev <= i-1 ;prev++ )
            if(nums[prev] < nums[i] && dp[i] < 1 + dp[prev]){
              dp[i] = 1 + dp[prev];
                hash[i] = prev;
            }
        }
        
        int ans = -1 ;
        int last_idx = -1;
        for(int i = 0 ; i<= n-1 ; i++){
            if(dp[i] > ans){
                ans = dp[i];
                last_idx = i;
            }
        }
        
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(nums[last_idx]);
         while(hash[last_idx] != last_idx){ 
            last_idx = hash[last_idx];
            lis.add(nums[last_idx]);    
        }
        
        for(int i=lis.size()-1; i>=0; i--){
            System.out.print(lis.get(i)+" ");
        }
        System.out.println();
        return ans;
    }
}
