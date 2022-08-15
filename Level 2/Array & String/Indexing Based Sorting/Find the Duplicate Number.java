//Find the Duplicate Number
//https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length ; 
        for(int i=0 ; i< n ; i++){
            int val = nums[i] % (n+1);
            nums[val - 1] += (n+1);
        }
        
        for(int i = 0 ; i<  n; i++){
            if(nums[i]/(n+1) > 1){
                return i+1;
            }
        }
        return n;
    }
}



//2nd Method
class main {
    
    // Floyd Cycle
    public int findDuplicate(int[] nums) {
        int slow = 0 ; 
        int fast = 0 ;
       
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast) break;
        }
        
        slow = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}

/* 
 * class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
      int left = 0 , right = 1 ;
        int ans =0;
        while ( right != nums.length){
            if ( nums[left] == nums[right]){
                ans = nums[left];
                right++;
            }else {
                left++;
                right++;
            }
        }
        return ans ;
    }
}
 */