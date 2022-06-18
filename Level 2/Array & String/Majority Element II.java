/* //Majority Element II
//https://leetcode.com/problems/majority-element-ii/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        
        int val1 = nums[0];
        int count1 = 1;
        int val2 = nums[0]; //assign any random value 
        int count2 = 0;
        
        int i = 1 ;
        
        while(i<nums.length){
            if(nums[i] == val1){
                count1++;
            }else if(nums[i] == val2){
                count2++;
            }else {
                if(count1 == 0 ){
                    val1 = nums[i];
                    count1 = 1;
                }else if(count2 == 0 ){
                    val2 = nums[i];
                    count2 = 1;
                }else{
                    count1--;
                    count2--;
                }
            }
            i++;
        }
        
        if(isGreater(nums , val1)){
            res.add(val1);
        }
        if( val1 != val2 && isGreater(nums , val2)){
            res.add(val2);
        }
        
        return res;
    }
    
    public boolean isGreater(int [] arr , int val){
        int count  = 0 ;
        for(int i = 0 ; i< arr.length ; i++){
            if(val == arr[i]){
                count++;
            }
        }
        return count > arr.length / 3;
    }
} */